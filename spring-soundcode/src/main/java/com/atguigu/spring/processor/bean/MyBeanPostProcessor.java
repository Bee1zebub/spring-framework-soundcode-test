package com.atguigu.spring.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;


/**
 * Bean组件的 PostProcessor；
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
	public MyBeanPostProcessor(){
		System.out.println("MyBeanPostProcessor()...无参构造器");
	}

	//初始化之后进行后置处理：可以在当前组件所有属性全部就绪后继续进行增强
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcessor...postProcessAfterInitialization()===>"+bean+"--"+beanName);
		return bean;
	}

	//初始化之前进行后置处理：改变之前创建的bean的实例
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcessor...postProcessBeforeInitialization()===>"+bean+"--"+beanName);
		return bean;
	}


}
