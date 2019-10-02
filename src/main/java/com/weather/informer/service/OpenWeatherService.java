package com.weather.informer.service;

import java.util.List;

public interface OpenWeatherService {

	List<String> getWeatherInfoByCities(List<String> cities);

}
