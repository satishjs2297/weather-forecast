package com.weather.forecast.service;

import java.util.List;

public interface WeatherForecastService {

	List<String> getWeatherForecastByCities(List<String> cities);

}
