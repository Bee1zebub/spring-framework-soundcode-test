package com.atguigu.web.controller;


import com.atguigu.web.exception.InvalidUserException;
import com.atguigu.web.service.HelloService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller("beanName")
public class HelloController {

	@Autowired
	private HelloService helloService;

	public HelloController(){
		System.out.println("HelloController...无参构造器");
	}

	@GetMapping("/hello")
	public String sayHello(String name, //可以从请求参数中得到
						   @RequestParam("user")String user, //可以从请求参数中得到
						   HttpSession session,
						   RedirectAttributes ra,
						   Integer i){
		int result = 10/i;
		if("abc".equals(user)){
			throw new InvalidUserException();
		}
		String mvc = helloService.say(user+"：MVC"+name);
		session.setAttribute("msg",mvc);
		ra.addFlashAttribute("msg","flash");
		return "index.jsp";
	}

	@GetMapping(value = "/accounts")
	public String handle(RedirectAttributes redirectAttrs) {
		// Save account ...
		// 使结果为 http://localhost:8080/springmvc_sourcecode_war__exploded/index.jsp?msg=strare
		redirectAttrs.addAttribute("msg","strare");
		// 放到session域中
		redirectAttrs.addFlashAttribute("message", "Account created!");
		return "redirect:/index.jsp";
	}
}
