package com.zh.spring4.ch1.di;

/**
 * 1.@Service注解,UseFunctionService类是由spring管理的一个Bean
 * 2.@Autowired注解，将FunctionService的实体Bean注入到UseFunctionService,
 * 让该类具备FunctionService的功能。还可以使用JSR-330的@Inject注解或者JSR-250的@Resource注解。都是等效的。
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //1
public class UseFunctionService {
	@Autowired //2
	FunctionService functionService;
	
	public String SayHello(String word){
		return functionService.sayHello(word);
	}
}
