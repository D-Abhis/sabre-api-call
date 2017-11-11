package com.sabre.api.sacs.rest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sabre.api.sacs.rest.Application;
import com.sabre.api.sacs.rest.LeadPriceCalendar;
import com.sabre.api.sacs.rest.common.context.SharedContext;
import com.sabre.api.sacs.rest.domain.leadpricecalendar.LeadPriceCalendarResponse;

/**
 * Module configuration an main class for running test flow.
 */
public class LeadPriceCalendarTest {

	private static final Logger LOG = LogManager.getLogger(LeadPriceCalendarTest.class);
	private final ObjectMapper mapper = new ObjectMapper();

	@Test
	public void testDoCalendarPricing() throws Exception {
		final ApplicationContext ctx = new Application().getApplicationContext();
		final LeadPriceCalendar bean = ctx.getBean(LeadPriceCalendar.class);
		final SharedContext context = new SharedContext();
		final LeadPriceCalendarResponse run = bean.doCalendarPricing(context);
		LOG.debug(mapper.writeValueAsString(run));
		LOG.error(context.getError());
	}

}
