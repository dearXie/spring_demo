package com.xieq.spring4.hello.prepostconfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

	@PostConstruct
	public void init() {
		System.out.println("JSR250 init  method..........");
	}

	public JSR250WayService() {
		System.out.println("JSR250 CONSTRACT........");
	}

	@PreDestroy
	public void destpry() {
		System.out.println("JSR250 method........");

	}

}
