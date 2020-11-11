package com.nnp.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.nnp.dao")
@PropertySource(value =  {"com/nnp/commons/jdbc.properties","com/nnp/commons/jdbc1.properties"})
public class PersistenceConfig {
	@Autowired
	private Environment env;
	
	@Bean
	public DataSource getDs() {
		HikariDataSource hkds=new HikariDataSource();
		hkds.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		hkds.setJdbcUrl(env.getRequiredProperty("jdbc.url"));
		hkds.setUsername(env.getRequiredProperty("jdbc.user"));
		hkds.setPassword(env.getRequiredProperty("jdbc.pwd"));
		hkds.setMaximumPoolSize(Integer.parseInt(env.getRequiredProperty("jdbc.maxSize")));
		hkds.setMinimumIdle(Integer.parseInt(env.getRequiredProperty("jdbc.minIdle")));
		hkds.setIdleTimeout(Integer.parseInt(env.getRequiredProperty("jdbc.timeout")));
		return hkds;
	}

}
