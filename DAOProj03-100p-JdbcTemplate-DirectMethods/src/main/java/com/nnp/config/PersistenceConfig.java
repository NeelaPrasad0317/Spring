package com.nnp.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.nnp.dao")
@PropertySource(value = { "/com/nnp/commons/jdbc.properties" })
public class PersistenceConfig {
	@Autowired
	private Environment env;
	
	@Bean
	public JdbcTemplate getjt() {
		return new JdbcTemplate(getDs());
	}
	
	@Bean
	public DataSource getDs() {
		HikariDataSource ds=new HikariDataSource();
		ds.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		ds.setJdbcUrl(env.getRequiredProperty("jdbc.url"));
		ds.setUsername(env.getRequiredProperty("jdbc.user"));
		ds.setPassword(env.getRequiredProperty("jdbc.pass"));
		ds.setMaximumPoolSize(env.getRequiredProperty("jdbc.max",Integer.class));
		ds.setMinimumIdle(env.getRequiredProperty("jdbc.minIdle",Integer.class));
		return ds;
	}
}
