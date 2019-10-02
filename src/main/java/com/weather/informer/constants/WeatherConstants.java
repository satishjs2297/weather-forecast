package com.weather.informer.constants;

public interface WeatherConstants {

	// view resolver prefix and suffix
	String VIEW_PREFIX = "/WEB-INF/views/";
	String VIEW_SUFFIX = ".jsp";

	// End points:
	String GET_WEATHER_INFO = "/getWeatherInfoByCities/{cities}";

	// Open weather url
	String OPEN_WEATHER_URL = "https://api.openweathermap.org/data/2.5/weather?APPID=1de37415bca57f4bc3e119bb810ade0d&q=";

}
