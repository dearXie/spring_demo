package com.xieq.spring4.hello.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UseFunctionService {

	@Autowired
	private FunctionService service;
	
	
	public void sayHello(String message) {
		this.service.sayHello(message);
	}
}
