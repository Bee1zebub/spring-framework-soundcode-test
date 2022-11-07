package com.atguigu.spring.aop;

import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;


@Component  //切面存在的话就会返回代理对象，被增强类
public class HelloService {

	public HelloService(){
		System.out.println("....");
	}

	//切入点：实际被真正增强的方法叫做切入点。
	public String sayHello(@NotNull String name){
		String result = "你好："+name;
		System.out.println(result);
		int length = name.length();
		return result + "---" + length;
	}
}
