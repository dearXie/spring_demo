package com.xieq.spring4.advanced.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("dev2");
		context.register(ProfileConfig.class);
		context.refresh();
		ProfileBean bean = context.getBean(ProfileBean.class);
		System.out.println(bean.getContent());
		context.close();
	}
}
