package com.weather.forecast.dao;

import java.util.List;

public interface WeatherForecastDao {

	List<String> getWeatherForecastByCities(List<String> cities);
}
