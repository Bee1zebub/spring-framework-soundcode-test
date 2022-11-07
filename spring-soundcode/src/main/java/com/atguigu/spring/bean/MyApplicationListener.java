package com.atguigu.spring.bean;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.SmartApplicationListener;

public class MyApplicationListener implements SmartApplicationListener {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {

	}

	@Override
	public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
		return false;
	}

	@Override
	public boolean supportsSourceType(Class<?> sourceType) {
		return SmartApplicationListener.super.supportsSourceType(sourceType);
	}

	@Override
	public int getOrder() {
		return SmartApplicationListener.super.getOrder();
	}

	@Override
	public String getListenerId() {
		return SmartApplicationListener.super.getListenerId();
	}
}
