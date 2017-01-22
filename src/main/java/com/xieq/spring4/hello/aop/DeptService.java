package com.xieq.spring4.hello.aop;

import org.springframework.stereotype.Service;

@Service
public class DeptService {

	public void query() {
		System.out.println("查询部门信息");
	}
}
