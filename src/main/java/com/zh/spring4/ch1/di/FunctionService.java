package com.zh.spring4.ch1.di;

/**
 * 1.使用@service注解，声明FunctionService类是由spring来管理的一个Bean
 */
import org.springframework.stereotype.Service;

@Service  //1
public class FunctionService {
	public String sayHello(String word){
		return "hello"+word+"!";
	}
}
