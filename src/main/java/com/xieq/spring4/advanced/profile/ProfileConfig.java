package com.xieq.spring4.advanced.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

	@Bean
	@Profile("dev1")
	public ProfileBean createBean1() {
		return new ProfileBean("from dev1");
	}

	@Bean
	@Profile("dev2")
	public ProfileBean createBean2() {
		return new ProfileBean("from dev2");
	}

}
