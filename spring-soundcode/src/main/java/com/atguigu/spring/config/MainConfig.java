package com.atguigu.spring.config;

import com.atguigu.spring.bean.Cat;
import com.atguigu.spring.bean.Teacher;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;

//@Import({Person.class, MyBeanDefinitionRegistry.class})
@ComponentScan(value = {"com.atguigu.spring.bean","com.atguigu.spring.processor","com.atguigu.spring.circle"},useDefaultFilters = true , includeFilters = {@Filter(type = FilterType.ASSIGNABLE_TYPE ,classes = {Teacher.class, Cat.class})})
@Configuration()
public class MainConfig {

//	@Bean
//	public Person person(){
//		Person person = new Person();
//		person.setName("李四");
//		return person;
//	}
}
