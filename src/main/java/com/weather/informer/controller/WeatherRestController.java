package com.weather.informer.controller;

import static com.weather.informer.constants.WeatherConstants.GET_WEATHER_INFO;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.weather.informer.service.OpenWeatherService;

@RestController
public class WeatherRestController {
	private static final Logger LOG = LogManager.getLogger(WeatherRestController.class);

	private OpenWeatherService openWeatherService;

	@Autowired
	public WeatherRestController(OpenWeatherService weatherReportService) {
		this.openWeatherService = weatherReportService;
	}

	@GetMapping(value = GET_WEATHER_INFO)
	public ResponseEntity<List<String>> getWeatherInfoByCities(@PathVariable List<String> cities) {
		LOG.info("Input City Names :: {}", cities);
		return ResponseEntity.ok(openWeatherService.getWeatherInfoByCities(cities));
	}

}
