package com.weather.forecast.dao;

import java.util.List;

import com.weather.forecast.model.WeatherReport;

public interface WeatherForecastDao {

	List<WeatherReport> getWeatherForecastByCities(List<String> cities);
}
