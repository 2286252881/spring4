package com.zh.spring4.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



/**
 * 1.@Configuration注解：声明当前类是一个配置类
 * 2.@ComponentScan注解：自动扫描包名下所有使用@Service、@Component、@Repository和@Controller的类，并注册为
 * spring管理的Bean
 * @author Administrator
 *
 */

@Configuration //1
@ComponentScan("com.zh.spring4.ch1.di") //2
public class DiConfig {
	
}