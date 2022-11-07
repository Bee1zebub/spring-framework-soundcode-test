package com.atguigu.spring.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy //开启自动代理
@ComponentScan(value = {"com.atguigu.spring.aop","com.atguigu.spring.listener"})
@Configuration
public class AopOpenConfig {




}
