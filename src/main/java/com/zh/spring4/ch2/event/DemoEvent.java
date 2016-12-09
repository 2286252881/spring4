package com.zh.spring4.ch2.event;

import org.springframework.context.ApplicationEvent;

public class DemoEvent extends ApplicationEvent{
	private static final long serialVersionUID = 1519601884048414904L;

	public DemoEvent(Object source,String msg) {
		super(source);
		this.msg=msg;
	}

	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
