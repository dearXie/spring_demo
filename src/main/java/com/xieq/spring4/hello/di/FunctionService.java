package com.xieq.spring4.hello.di;

import org.springframework.stereotype.Component;

@Component
public class FunctionService {

	public void sayHello(String message){
		System.out.println("hello:"+message);
	}
}
