package com.atguigu.web.config;

import com.atguigu.web.view.MeiNvViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
//@EnableWebMvc //启用Mvc
public class MvcExtendConfiguration  extends DelegatingWebMvcConfiguration {


//
//	@Bean
//	public ViewResolver InternalResourceViewResolver(){
//		return new InternalResourceViewResolver();
//	}
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		ViewResolver viewResolver = new MeiNvViewResolver();
		registry.viewResolver(new InternalResourceViewResolver());
		registry.viewResolver(viewResolver);
	}
}


