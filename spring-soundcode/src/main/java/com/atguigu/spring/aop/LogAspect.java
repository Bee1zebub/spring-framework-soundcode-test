package com.atguigu.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;


/**
 * Spring5以后顺序就一切正常
 * 正常：前置通知===目标方法===返回通知===后置通知
 * 异常: 前置通知===目标方法===异常通知===后置通知
 * try{
 *     前置通知
 *     目标方法的执行
 *     返回通知
 * }catch(){
 *     异常通知
 * }finally{
 *     后置通知
 * }
 *
 *
 */
@Component  //切面也是容器中的组件
@Aspect //说明这是切面: 把通知应用到切入点的过程
public class LogAspect {

	public LogAspect(){
		System.out.println("LogAspect...");
	}

	//提取切入点表达式，方便本类引用
	@Pointcut("execution(* com.atguigu.spring.aop.HelloService.sayHello(..))")
	public void pointCut(){}


	//前置通知  增强方法/增强器
	@Before("execution(* com.atguigu.spring.aop.HelloService.sayHello(..))")
	public void logStart(JoinPoint joinPoint){
		String name = joinPoint.getSignature().getName();
		System.out.println("logStart()==>"+name+"....【args: "+ Arrays.asList(joinPoint.getArgs()) +"】");
	}

	//返回通知
	@AfterReturning(value = "pointCut()",returning = "result")
	public void logReturn(JoinPoint joinPoint,Object result){
		String name = joinPoint.getSignature().getName();
		System.out.println("logReturn()==>"+name+"....【args: "+ Arrays.asList(joinPoint.getArgs()) +"】【result: "+result+"】");
	}


	//后置通知
	@After("pointCut()")
	public void logEnd(JoinPoint joinPoint){
		String name = joinPoint.getSignature().getName();
		System.out.println("logEnd()==>"+name+"....【args: "+ Arrays.asList(joinPoint.getArgs()) +"】");
	}


	//异常
	@AfterThrowing(value = "pointCut()",throwing = "exception")
	public void logError(JoinPoint joinPoint,Exception exception){
		String name = joinPoint.getSignature().getName();
		System.out.println("logError()==>"+name+"....【args: "+ Arrays.asList(joinPoint.getArgs()) +"】【exception: "+exception+"】");
	}
}
