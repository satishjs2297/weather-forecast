package com.weather.forecast.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weather.forecast.dao.WeatherForecastDao;

@Service
public class WeatherForecastServiceImpl implements WeatherForecastService {
	private static final Logger LOG = LogManager.getLogger(WeatherForecastServiceImpl.class);

	@Autowired
	private WeatherForecastDao weatherForecastDao;

	@Autowired
	public WeatherForecastServiceImpl(WeatherForecastDao weatherForecastDao) {
		this.weatherForecastDao = weatherForecastDao;
	}

	@Override
	public List<String> getWeatherForecastByCities(List<String> cities) {
		long strTime = System.currentTimeMillis();
		LOG.info("cities :: {}", cities);
		List<String> reports = weatherForecastDao.getWeatherForecastByCities(cities);
		LOG.info("Forecast Report Size :: {} :: TT :: {}", reports.size(), (System.currentTimeMillis() - strTime));
		return reports;
	}

}
