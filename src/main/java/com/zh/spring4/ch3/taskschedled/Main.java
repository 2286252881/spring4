package com.zh.spring4.ch3.taskschedled;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TaskSchedlerConfig.class);
	}
}
