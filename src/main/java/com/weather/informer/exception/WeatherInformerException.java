package com.weather.informer.exception;

public class WeatherInformerException extends RuntimeException {
	private static final long serialVersionUID = -6219997046198578409L;

	public WeatherInformerException(Exception ex) {
		super(ex);
	}

	public WeatherInformerException(String message) {
		super(message);
	}
}
