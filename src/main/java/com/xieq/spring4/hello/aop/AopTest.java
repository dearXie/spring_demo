package com.xieq.spring4.hello.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		UserService userService = context.getBean(UserService.class);
		DeptService deptService = context.getBean(DeptService.class);
		
		userService.add();
		deptService.query();
		
		context.close();
		
	}
}
