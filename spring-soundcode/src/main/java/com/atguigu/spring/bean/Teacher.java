package com.atguigu.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

//@Component
public class Teacher implements ApplicationContextAware , MessageSourceAware {

//	@Autowired
	private ApplicationContext context;
	private MessageSource messageSource;

	private Cat cat;

	public Teacher() {
		System.out.println("Teacher---" +"无参构造方法");
	}

	public ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext context) {
		this.context = context;
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public Cat getCat() {
		return cat;
	}

	@Autowired
	public void setCat(Cat cat) {
		System.out.println("Teacher---->setCat()");
		this.cat = cat;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		 this.context = applicationContext;
	}

	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
}
