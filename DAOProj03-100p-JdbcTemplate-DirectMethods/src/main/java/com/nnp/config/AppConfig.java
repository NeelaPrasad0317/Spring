package com.nnp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(value = {"com/nnp/config/applicationContext.xml"})
public class AppConfig {

}
