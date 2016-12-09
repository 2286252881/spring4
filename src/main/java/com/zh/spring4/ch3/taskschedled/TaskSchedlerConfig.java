package com.zh.spring4.ch3.taskschedled;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration

@ComponentScan("com.zh.spring4.ch3.taskschedled")
@EnableScheduling //1
public class TaskSchedlerConfig {
}
