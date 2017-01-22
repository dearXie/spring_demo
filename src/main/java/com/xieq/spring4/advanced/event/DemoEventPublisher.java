package com.xieq.spring4.advanced.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoEventPublisher {
	@Autowired
	ApplicationContext applicationContext;

	public void publish(String message) {
		applicationContext.publishEvent(new DemoEvent(this,message));

	}

}
