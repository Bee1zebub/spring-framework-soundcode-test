package com.atguigu.web;

import com.atguigu.web.config.AppConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


/**
 * 只要写了这个，相当于配置了SpringMVC的DispatcherServlet
 * 1、Tomcat一启动就加载他
 * 		1）、创建了容器、制定了配置类（所有ioc、aop等spring的功能就ok）
 * 		2）、注册一个Servlet；	DispatcherServlet；
 * 		3）、以后所有的请求都交给了 DispatcherServlet；
 * 	效果，访问Tomcat部署的这个Web应用下的所有请求都会被 	DispatcherServlet 处理
 * 	DispatcherServlet就会进入强大的基于注解的mvc处理流程（@GetMapping）
 * 必须Servlet3.0以上才可以；Tomcat6.0以上才支持Servlet3.0规范
 *
 * Servlet3.0是javaEE的Web的规范标准，Tomcat是Servlet3.0规范的一个实现；
 */
public class AppStarter implements WebApplicationInitializer {

	//这个方法比refresh()刷新容器的方法要早执行
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		//1.创建ioc容器
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		//2.注册配置类
		context.register(AppConfig.class);
		//以上截止，ioc容器都没有启动

		//3.配置了 DispatcherServlet,利用servlet的初始化机制
		DispatcherServlet servlet = new DispatcherServlet(context);

		//4.DispatcherServlet 添加到 servletContext中以后，Tomcat就会对 DispatcherServlet 进行初始化 init()【servlet规范】
		ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
		registration.setLoadOnStartup(1);
		registration.addMapping("/"); //映射路径
	}
}
