package com.xieq.spring4.hello.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DiTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
		UseFunctionService functionService = context.getBean(UseFunctionService.class);
		functionService.sayHello("spring di!");
		context.close();
	}
}
