package com.nnp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {com.nnp.config.PersistenceConfig.class,
								com.nnp.config.ServiceConfig.class,
								com.nnp.config.ControllerConfig.class})	
public class AppConfig {

}
