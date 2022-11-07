package com.atguigu.spring.processor.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * BeanFactory的后置处理器
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	public MyBeanFactoryPostProcessor(){
		System.out.println("MyBeanFactoryPostProcessor()...无参构造器");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("MyBeanFactoryPostProcessor....postProcessBeanFactory===>"+beanFactory);
	}
}
