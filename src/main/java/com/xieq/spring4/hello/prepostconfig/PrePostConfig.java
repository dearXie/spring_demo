package com.xieq.spring4.hello.prepostconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xieq.spring4.hello.prepostconfig")
public class PrePostConfig {

	@Bean(initMethod = "init", destroyMethod = "destory")
	public BeanWayService createBean() {
		return new BeanWayService();
	}

	@Bean
	public JSR250WayService createJsr250Bean() {
		return new JSR250WayService();

	}
}
