package com.zh.spring4.ch2.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

public class DemoEvent extends ApplicationContextEvent{
	
	private String msg;
	
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}



	public DemoEvent(ApplicationContext source) {
		super(source);
		this.msg=msg;
	}

	
}
