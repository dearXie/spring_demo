package com.xieq.spring4.hello.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		UseFunctionService service = context.getBean(UseFunctionService.class);
		service.printMessage("xieqiang!");
		context.close();
	}
}
