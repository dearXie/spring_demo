package com.xieq.spring4.advanced.event;

import org.springframework.context.ApplicationEvent;

/**
 * 
 * 1,自定义事件继承：ApplicationEvent
 *
 */
public class DemoEvent extends ApplicationEvent {

	public DemoEvent(Object source, String message) {
		super(source);
		this.message = message;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
