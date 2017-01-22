package com.xieq.spring4.advanced.multithread;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ThreadTaskExecuterConfig.class);
		AsyncService asyncService = context.getBean(AsyncService.class);
		for(int i = 0;i<100;i++){
			asyncService.executeAsynTask(i);//执行异步任务
			asyncService.executeAsynTaskPlus(i);//执行异步任务
		}
		context.close();
	}
}
