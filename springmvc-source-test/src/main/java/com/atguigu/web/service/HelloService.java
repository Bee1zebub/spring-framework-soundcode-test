package com.atguigu.web.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	public HelloService(){
		System.out.println("HelloService...无参构造器");
	}

	public String say(String str){
		return str;
	}

}
