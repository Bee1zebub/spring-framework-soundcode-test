package com.atguigu.spring.config;

import com.atguigu.spring.bean.Cat;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyBeanDefinitionRegistry implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		RootBeanDefinition definition = new RootBeanDefinition(Cat.class);
		//definition.setInstanceSupplier(() -> new Cat());
		//definition.setInitMethodName("aaa"); 执行自定义的初始化方法
		registry.registerBeanDefinition("cat",definition);
	}
}
