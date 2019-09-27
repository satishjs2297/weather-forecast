package com.weather.forecast.dao;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class WeatherForecastDaoImpl implements WeatherForecastDao {

	private static final Logger LOG = LogManager.getLogger(WeatherForecastDaoImpl.class);

	private RestTemplate restTemplate;

	@Value("${openweathermapUrl}")
	private String openWeatherMapUrl;

	@Autowired
	public WeatherForecastDaoImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public List<String> getWeatherForecastByCities(List<String> cities) {
		List<String> weathers = cities.parallelStream().map(this::getOpenWeatherForecast).filter(Objects::nonNull)
				.collect(Collectors.toList());
		LOG.info("weathers :: {}", weathers);
		return weathers;
	}

	private String getOpenWeatherForecast(String city) {
		try {
			return restTemplate.getForObject(openWeatherMapUrl.concat(city.trim()), String.class);
		} catch (Exception e) {
			LOG.error("Failed to get WeatherForecast report:: {}", e.getMessage());
		}
		return null;
	}

}
