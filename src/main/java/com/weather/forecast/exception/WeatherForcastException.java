package com.weather.forecast.exception;

public class WeatherForcastException extends RuntimeException {
	private static final long serialVersionUID = -6219997046198578409L;

	public WeatherForcastException(Exception ex) {
		super(ex);
	}

	public WeatherForcastException(String message) {
		super(message);
	}
}
