package com.weather.forecast.service;

import java.util.List;

import com.weather.forecast.model.WeatherReport;

public interface WeatherForecastService {

	List<WeatherReport> getWeatherForecastByCities(List<String> cities);

}
