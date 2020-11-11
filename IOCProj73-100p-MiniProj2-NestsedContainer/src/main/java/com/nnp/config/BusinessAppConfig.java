package com.nnp.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = {"com.nnp.dao","com.nnp.service"})
public class BusinessAppConfig {
	@Bean
	public DataSource getDs() {
		HikariDataSource hkds=new HikariDataSource();
		hkds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		hkds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		hkds.setUsername("scott");
		hkds.setPassword("tiger");
		hkds.setMaximumPoolSize(4);
		hkds.setMinimumIdle(2);
		hkds.setIdleTimeout(20000);
		return hkds;
	}
	
	
}
