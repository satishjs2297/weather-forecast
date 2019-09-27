package com.weather.forecast.controller;

import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.weather.forecast.service.WeatherForecastService;

public class WeatherForecastControllerTest {

	@Mock
	private WeatherForecastService weatherReportServiceMock;

	@InjectMocks
	private WeatherForecastController weatherForecastController;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testHomePage() {
		String homePage = weatherForecastController.homePage();
		Assert.assertNotNull(homePage);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testGetWeathersByCities() {
		Mockito.when(weatherReportServiceMock.getWeatherForecastByCities(Mockito.any(List.class)))
				.thenReturn(Collections.singletonList("{test:value}"));
		List<String> weathersByCities = weatherForecastController.getWeatherForecastByCities(Collections.emptyList())
				.getBody();
		Assert.assertNotNull(weathersByCities);
	}

}
