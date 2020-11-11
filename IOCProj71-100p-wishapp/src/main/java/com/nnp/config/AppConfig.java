package com.nnp.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nnp.beans")
public class AppConfig {
	@Bean("time")
	public LocalTime getTime() {
		return LocalTime.now();
	}
}




