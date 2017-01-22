package com.xieq.spring4.hello.aop;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Action(name = "调用UserService的add方法添加一个用户")
	public void add() {
		System.out.println("添加一个user到数据库");
	}
}
