package com.sabre.api.sacs.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.sabre.api.sacs.config.ConfigurationConfig;

/**
 * Module configuration an main class for running test flow.
 */
@SpringBootApplication
@ComponentScan
public class Application {

	public ApplicationContext getApplicationContext(String... args) throws Exception {
		return SpringApplication.run(new Object[] { ConfigurationConfig.class, Application.class }, args);
	}
	
	public static void main (String [] args) {
		SpringApplication.run(new Object[] { ConfigurationConfig.class, Application.class }, args);
	}

}
