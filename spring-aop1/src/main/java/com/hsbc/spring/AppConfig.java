package com.hsbc.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.hsbc.spring")
@EnableAspectJAutoProxy
public class AppConfig {

	
}
