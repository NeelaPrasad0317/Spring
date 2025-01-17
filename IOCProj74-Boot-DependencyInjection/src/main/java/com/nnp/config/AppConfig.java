package com.nnp.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public LocalTime getTime() {
		return LocalTime.now();
	}
}
