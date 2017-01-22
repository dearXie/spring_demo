package com.xieq.spring4.advanced.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoEventListener implements ApplicationListener<DemoEvent> {

	@Override
	public void onApplicationEvent(DemoEvent event) {
		String message = event.getMessage();
		System.out.println("收到信息：" + message);
	}

}
