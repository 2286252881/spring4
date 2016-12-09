package com.zh.spring4.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListenner implements ApplicationListener<DemoEvent>{

	@Override
	public void onApplicationEvent(DemoEvent event) {
		String msg=event.getMsg();
		System.out.println("DemoListener接收到了DemoPublisher发布的消息："+msg);
	}

}
