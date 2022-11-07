package com.atguigu.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

//@Component
public class Person implements ApplicationContextAware, MessageSourceAware {

	//使用XxxAware回调的方法为其注入值
	private ApplicationContext context;
	private MessageSource messageSource;


	private String name;

	private Cat cat;

	public Person() {
		System.out.println("Person---->无参构造方法");
	}


	//测试@Lookup用的getXXX方法
	@Lookup
	public Cat gettCar(){
		return cat;
	}


	public Cat getCat() {
		return cat;
	}


	@Autowired
	public void setCat(Cat cat) {
		System.out.println(cat);
		this.cat = cat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", cat=" + cat +
				'}';
	}


	//重写方法XxxAware的方法

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
	}

	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
}
