package com.zh.spring4.ch3.taskexecutor;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
/**
 * 1.利用@EnableAsync注解开启异步任务支持
 * 2.配置实现类实现AsyncConfigurer并重写getAsyncExecutor方法返回一个ThreadPoolTaskExecutor
 * 这样我们就获得了一个基于线程池taskExecutor
 * @author Administrator
 *
 */
@Configuration
@ComponentScan("com.zh.spring4.ch3.taskexecutor")
@EnableAsync //1
public class TaskExecutorConfig implements AsyncConfigurer {//2

	@Override
	public Executor getAsyncExecutor() {//2
		
		ThreadPoolTaskExecutor taskExecutor=new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(5);
		taskExecutor.setMaxPoolSize(10);
		taskExecutor.setQueueCapacity(25);
		taskExecutor.initialize();
		return taskExecutor;
	}

	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
