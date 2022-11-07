package com.atguigu.spring.config;

import com.atguigu.spring.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = {"com.atguigu.spring.processor","com.atguigu.spring.bean"})
public class MainConfigOfPostProcessor {
}
