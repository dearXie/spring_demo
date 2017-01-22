package com.xieq.spring4.advanced.multithread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

	@Async
	public void executeAsynTask(Integer i) {
		System.out.println("执行异步任务："+i);
	}
	
	@Async
	public void executeAsynTaskPlus(Integer i) {
		System.out.println("执行异步任务plus："+(i+1));
	}
}
