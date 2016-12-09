package com.zh.spring4.ch1.javaconfig;


/**
 * 1.此处没有使用@Service声明Bean
 * @author Administrator
 *
 */
//1
public class FunctionService {
	public String sayHello(String word){
		return "Hello "+word+"!";
	}
}
