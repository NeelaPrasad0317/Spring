package com.nnp.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class AppConfig {
	/*@Autowired
	DataSource ds;*/
	
	@Autowired
	private Environment env;
	
	@Bean
	public JdbcTemplate getjt() {
		return new JdbcTemplate(getDs());
	}
	
	@Bean
	public DataSource getDs() {
		HikariDataSource ds=new HikariDataSource();
		ds.setDriverClassName(env.getRequiredProperty("spring.datasource.driver-class-name"));
		ds.setJdbcUrl(env.getRequiredProperty("spring.datasource.url"));
		ds.setUsername(env.getRequiredProperty("spring.datasource.username"));
		ds.setPassword(env.getRequiredProperty("spring.datasource.password"));
		ds.setMaximumPoolSize(env.getRequiredProperty("spring.datasource.hikari.maximum-pool-size",Integer.class));
		ds.setMinimumIdle(env.getRequiredProperty("spring.datasource.hikari.minimum-idle",Integer.class));
		return ds;
	}
}











