package com.atguigu.spring.processor.bean;

import com.atguigu.spring.bean.Cat;
import com.atguigu.spring.bean.MyApplicationListener;
import com.atguigu.spring.bean.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;
@Component
public class MySmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {

	public MySmartInstantiationAwareBeanPostProcessor(){
		System.out.println("MySmartInstantiationAwareBeanPostProcessor()...无参构造器");
	}

	//预测bean的类型，最后一次改变组件类型。
	//1.当容器进行调用getBeanNameByType()返回指定类型beanName时，可以手动干预改变组件类型
	public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor...predictBeanType()===>"+beanClass+"--"+beanName);
//		if(beanClass.equals(com.atguigu.spring.bean.Cat.class)) {
//			return MyApplicationListener.class;
//		}
		return null;
	}

	//2.返回我们要使用的构造器候选列表
	public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName)
			throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor...determineCandidateConstructors()===>"+beanClass+"--"+beanName);
		return null;
	}

	//返回早期的bean引用
	public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor...getEarlyBeanReference()===>"+bean+"--"+beanName);
		return bean;
	}


}
