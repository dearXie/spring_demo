package com.xieq.spring4.hello.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ELTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
		ElConfig config = context.getBean(ElConfig.class);
		config.outputResources();
		context.close();
	}
}
