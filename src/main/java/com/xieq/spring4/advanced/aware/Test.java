package com.xieq.spring4.advanced.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		AwareService service = context.getBean(AwareService.class);
		service.output();
		context.close();

	}
}
