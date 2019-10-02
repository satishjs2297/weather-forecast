package com.weather.informer.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WeatherController {
	private static final Logger LOG = LogManager.getLogger(WeatherController.class);

	@RequestMapping(value = "/")
	public String landingPage() {
		LOG.debug("homePage Begin...");
		return "weatherForecast";
	}

}
