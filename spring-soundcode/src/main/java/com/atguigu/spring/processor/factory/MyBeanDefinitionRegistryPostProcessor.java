package com.atguigu.spring.processor.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * BeanFactory的后置处理器  , PriorityOrdered, Ordered
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor ,PriorityOrdered,Ordered{
	//构造器最先执行
	public MyBeanDefinitionRegistryPostProcessor(){
		System.out.println("MyBeanDefinitionRegistryPostProcessor...无参构造器");
	}
	@Override  //第三执行
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("MyBeanDefinitionRegistryPostProcessor...postProcessBeanFactory()");
	}

	@Override  //第二执行的
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("MyBeanDefinitionRegistryPostProcessor...postProcessBeanDefinitionRegistry()");
		//增强bean定义信息的注册中心，比如自己注册组件
	}

	//规定该bean工厂后置增强器执行的顺序，返回值越小优先级越高，0最高
	@Override
	public int getOrder() {
		return 0;
	}
}
