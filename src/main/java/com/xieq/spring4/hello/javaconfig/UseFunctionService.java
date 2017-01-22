package com.xieq.spring4.hello.javaconfig;

public class UseFunctionService {

	private FunctionService functionService;

	public void printMessage(String message) {
		this.functionService.pringtMessage(message);
	}

	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}
	
	
}
