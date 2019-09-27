package com.weather.forecast.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.weather.forecast.service.WeatherForecastService;

@Controller
public class WeatherForecastController {
	private static final Logger LOG = LogManager.getLogger(WeatherForecastController.class);

	private WeatherForecastService weatherForecastService;

	@Autowired
	public WeatherForecastController(WeatherForecastService weatherReportService) {
		this.weatherForecastService = weatherReportService;
	}

	@RequestMapping(value = "/home")
	public String homePage() {
		LOG.debug("homePage Begin...");
		return "weatherForecast";
	}

	@RequestMapping(value = "/getWeatherForecastByCities/{cities}")
	public @ResponseBody ResponseEntity<List<String>> getWeatherForecastByCities(@PathVariable List<String> cities) {
		LOG.debug("Selected Cities :: {}", cities);
		return ResponseEntity.ok(weatherForecastService.getWeatherForecastByCities(cities));
	}

}
