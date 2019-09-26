package com.weather.forecast.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.weather.forecast.model.WeatherReport;

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
	public List<WeatherReport> getWeatherForecastByCities(List<String> cities) {
		List<WeatherReport> weathers = cities.parallelStream().map(this::getOpenWeatherForecast)
				.collect(Collectors.toList());
		LOG.info("weathers :: {}", weathers);
		return weathers;
	}

	private WeatherReport getOpenWeatherForecast(String city) {
		return restTemplate.getForObject(openWeatherMapUrl.concat(city.trim()), WeatherReport.class);
	}

}
