package com.zh.spring4.ch3.condtional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConditionConfig.class);
		ListService listService=context.getBean(ListService.class);
		System.out.println(context.getEnvironment().getProperty("os.name")+"系统下的列表命令:"+listService.showListCmd());
	}
}
