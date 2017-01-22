package com.xieq.spring4.advanced.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		DemoEventPublisher publisher = context.getBean(DemoEventPublisher.class);
		publisher.publish("哈哈哈");
		context.close();

	}
}
