package com.weather.informer.constants;

public interface WeatherConstants {

	// view resolver prefix and suffix
	String VIEW_PREFIX = "/WEB-INF/views/";
	String VIEW_SUFFIX = ".jsp";

	// End points:
	String GET_WEATHER_INFO = "/getWeatherInfoByCities/{cities}";

	// Open weather url
	String OPEN_WEATHER_URL = "https://api.openweathermap.org/data/2.5/weather?APPID=b1ae276535f95b4c18183f92b7e3e6a6&q=";

}
