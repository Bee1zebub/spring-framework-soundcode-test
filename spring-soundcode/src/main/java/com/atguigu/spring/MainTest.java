package com.atguigu.spring;

import com.atguigu.spring.bean.Cat;
import com.atguigu.spring.bean.Hello;
import com.atguigu.spring.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans2.xml");
		Hello hello = applicationContext.getBean(Hello.class);
		System.out.println(hello);
		applicationContext.close();
	}

/*
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans2.xml");
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans2.xml");
		Cat cat = applicationContext.getBean(Cat.class);
		System.out.println(cat);
		applicationContext.close();
	}
*/
	/*
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Person person = applicationContext.getBean(Person.class);
		System.out.println(person);
		applicationContext.close();
	}
*/
}
