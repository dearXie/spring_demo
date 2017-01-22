package com.xieq.spring4.advanced.multithread;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableAsync
@ComponentScan("com.xieq.spring4.advanced.multithread")
public class ThreadTaskExecuterConfig implements AsyncConfigurer{

	@Override
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor taskExecuter = new ThreadPoolTaskExecutor();
		taskExecuter.setCorePoolSize(3);
		taskExecuter.setMaxPoolSize(100);
		taskExecuter.setQueueCapacity(25);
		taskExecuter.initialize();
		return taskExecuter;
	}

	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return null;
	}

}
