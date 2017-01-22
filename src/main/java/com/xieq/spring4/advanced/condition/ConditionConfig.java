package com.xieq.spring4.advanced.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {

	@Bean
	@Conditional(WindowsCondition.class)
	public ListService createWindowListService() {
		return new ListServiceWindowImpl();
	}

	@Bean
	@Conditional(LinuxCondition.class)
	public ListService createLinuxListSerice() {
		return new LinuxListServiceImpl();
	}
}
