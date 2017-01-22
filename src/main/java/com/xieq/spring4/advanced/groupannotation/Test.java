package com.xieq.spring4.advanced.groupannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(NewConfig.class);
		DemoService  demoService= context.getBean(DemoService.class);
		demoService.demoMethod();
		context.close();
	}
}
