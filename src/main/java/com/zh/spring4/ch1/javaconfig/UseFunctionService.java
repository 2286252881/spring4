package com.zh.spring4.ch1.javaconfig;

/**
 * 1.没有声明Bean
 * 2.没有注入Bean
 * @author Administrator
 *
 */
//1
public class UseFunctionService {
	
	
	
	//2
	FunctionService functionService;

	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}
	
	public String sayHello(String word){
		return functionService.sayHello(word);
	}
	
	
}
