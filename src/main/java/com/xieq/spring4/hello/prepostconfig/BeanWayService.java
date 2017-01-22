package com.xieq.spring4.hello.prepostconfig;

public class BeanWayService {

	public void init() {
		System.out.println("init method..........");
	}

	public BeanWayService() {
		System.out.println("constract method ......");
	}

	public void destory() {
		System.out.println("destory method...........");
	}
}
