package com.zh.spring4.ch3.condtional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

public class ConditionConfig {
	@Bean
	@Conditional(WindowCondition.class)
	public ListService windowsListServer(){
		return new WindowsListService();
	}
}
