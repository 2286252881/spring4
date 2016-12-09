package com.zh.spring4.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ScopeConfig.class);
		
		DemoSingleletonService s1=context.getBean(DemoSingleletonService.class);
		DemoSingleletonService s2=context.getBean(DemoSingleletonService.class);
		
		DemoPrototypeService p1=context.getBean(DemoPrototypeService.class);
		DemoPrototypeService p2=context.getBean(DemoPrototypeService.class);
		
		System.out.println("s1与s2是否相等"+s1.equals(s2));
		System.out.println("p1与p2是否相等"+p1.equals(p2));
		context.close();
	}
}
