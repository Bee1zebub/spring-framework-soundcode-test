package com.atguigu.spring;

import com.atguigu.spring.aop.HelloService;
import com.atguigu.spring.bean.Cat;
import com.atguigu.spring.bean.Hello;
import com.atguigu.spring.bean.Teacher;
import com.atguigu.spring.circle.A;
import com.atguigu.spring.config.AopOpenConfig;
import com.atguigu.spring.config.MainConfig;
import com.atguigu.spring.config.MainConfigOfPostProcessor;
import com.atguigu.spring.listener.AppEventPublisher;
import com.atguigu.spring.listener.ChangeEvent;
import com.atguigu.spring.listener.MessageEvent;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMainTest {

	public static void main(String[] args) {
//		ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
//		Person person = context.getBean(Person.class);
//		System.out.println(person);

//		String[] definitionNames = context.getBeanDefinitionNames();
//		for(String name:definitionNames){
//			System.out.println(name);
//		}
//
//		Person person = context.getBean(Person.class);
//		Cat catS = person.gettCar();
//		Cat cat = person.getCat();
//		System.out.println("使用@Lookup的Cat:"+ cat);
//		System.out.println("不使用@Lookup的Cat:"+catS);
//		Person person1 = context.getBean(Person.class);
//		Cat cat1 = person1.getCat();
//		System.out.println("Person对象的Cat属性是否相同："+ (cat == cat1));

//		//测试使用XxxAware的方式为底层组件自动注入值（也可把Teacher改为Person）
//		ApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfPostProcessor.class);
//		Teacher teacher = context.getBean(Teacher.class);
//		System.out.println("容器的值："+ context);
//		System.out.println("Teacher中容器的值："+ teacher.getContext());
//		System.out.println(context == teacher.getContext());

//		//测试使用AnnotationConfigApplicationContext注解的方式启动容器的十二个步骤
//		//测试循环引用
//		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
//		Hello hello =  applicationContext.getBean(Hello.class);
//		System.out.println(hello);
//		applicationContext.close();

		//AOP,原理测试
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopOpenConfig.class );
		HelloService helloService = applicationContext.getBean(HelloService.class);
		//使用切入点方法
		helloService.sayHello("zhangSan");


		//测试事件
		AppEventPublisher eventPublisher = applicationContext.getBean(AppEventPublisher.class);
		eventPublisher.publish(new A());
		eventPublisher.publish(new MessageEvent("hello，你好"));
		eventPublisher.publish(new ChangeEvent(eventPublisher,"sending..."));


//		Person bean = applicationContext.getBean(Person.class);

//		System.out.println(bean);


//		String[] names = applicationContext.getBeanDefinitionNames();
//		for (String name : names) {
//			System.out.println(name);
//		}


//		Cat bean1 = applicationContext.getBean(Cat.class);
//
//		Cat bean2 = applicationContext.getBean(Cat.class);
//
//		System.out.println(bean1 == bean2);  //false

//		Person bean1 = applicationContext.getBean(Person.class);
//
//		Cat cat = bean1.getCat();
//
//		Person bean2 = applicationContext.getBean(Person.class);
//
//		Cat cat1 = bean2.getCat();
//		System.out.println(cat1 == cat);  //true
//		System.out.println(cat1);


//		Person bean = applicationContext.getBean(Person.class);
//
//		ApplicationContext context = bean.getContext();
//
//		System.out.println(context == applicationContext);
	}
}



