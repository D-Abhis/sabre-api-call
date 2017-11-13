package com.sabre.api.sacs.rest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sabre.api.sacs.config.ConfigurationConfig;
import com.sabre.api.sacs.rest.common.context.SharedContext;
import com.sabre.api.sacs.rest.domain.leadpricecalendar.LeadPriceCalendarResponse;

/**
 * Module configuration an main class for running test flow.
 */
@SpringBootApplication
@ComponentScan
public class Application {
	
	private static final Logger LOG = LogManager.getLogger(Application.class);
	private static final ObjectMapper mapper = new ObjectMapper();

	public ApplicationContext getApplicationContext(String... args) throws Exception {
		return SpringApplication.run(new Object[] { ConfigurationConfig.class, Application.class }, args);
	}
	
	public static void main (String [] args) throws Exception{
		final ApplicationContext ctx = new Application().getApplicationContext();
		final LeadPriceCalendar bean = ctx.getBean(LeadPriceCalendar.class);
		final SharedContext context = new SharedContext();
		final LeadPriceCalendarResponse run = bean.doCalendarPricing(context);
		LOG.debug(mapper.writeValueAsString(run));
		LOG.error(context.getError());
	}

}
