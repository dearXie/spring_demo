package com.xieq.spring4.advanced.groupannotation;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	public void demoMethod() {
		System.out.println("用自己的注解一样可以");
	}
}
