package com.atguigu.spring.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("prototype")
@Component
public class Cat implements InitializingBean, DisposableBean {
	private String name;

	public Cat() {
		System.out.println("Cat()...无参构造器");
	}

	public String getName() {
		return name;
	}

	@Value("${JAVA_HOME}")
	public void setName(String name) {
		System.out.println("Cat...setName()");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"name='" + name + '\'' +
				'}';
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Cat...destroy()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Cat...afterPropertiesSet()");
	}
}
