package com.atguigu.spring.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	public MyInstantiationAwareBeanPostProcessor(){
		System.out.println("MyInstantiationAwareBeanPostProcessor...无参构造器");
	}

	//1.初始化之前进行后置处理,spring留给我们给这个组件创建bean实例对象的方法；如果我们自己创建了对象，spring不会再次创建对象
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBeanPostProcessor...postProcessBeforeInstantiation()===>"+beanClass+"--"+beanName);
		return null;
	}

	//初始化之后进行后置处理
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		//可以提前改变一些bean里面的属性，然后返回false，则spring的属性赋值被跳过
		System.out.println("MyInstantiationAwareBeanPostProcessor...postProcessAfterInstantiation()===>"+bean+"--"+beanName);
		return true;
	}

	//
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName)
			throws BeansException {
		System.out.println("MyInstantiationAwareBeanPostProcessor...postProcessProperties()===>"+bean+"--"+beanName);
		return pvs;
	}
//	public PropertyValues postProcessPropertyValues(
//			PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
//		System.out.println("MyInstantiationAwareBeanPostProcessor...postProcessProperties");
//		return pvs;
//	}
}

