package com.zh.spring4.ch3.taskschedled;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedledTaskServer {
	
	private static final SimpleDateFormat dateFormat1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static final SimpleDateFormat dateFormat2=new SimpleDateFormat("HH:mm:ss");
	
	
	@Scheduled(fixedRate=5000)//1
	public void reprotCurrentTime(){
		System.out.println("每隔5秒执行一次"+dateFormat1.format(new Date()));
	}
	
	@Scheduled(cron="0 18 11 ? * *")//2
	public void fixTimeExecution(){
		System.out.println("在指定的时间"+dateFormat2.format(new Date())+"执行");
	}
}
