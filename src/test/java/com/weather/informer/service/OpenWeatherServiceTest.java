package com.weather.informer.service;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.weather.informer.service.OpenWeatherService;
import com.weather.informer.service.OpenWeatherServiceImpl;

public class OpenWeatherServiceTest {

	private OpenWeatherService openWeatherService;

	@Before
	public void setUp() {
		openWeatherService = new OpenWeatherServiceImpl();
	}

	@Test
	public void testgetWeatherForecastByCities() {
		List<String> weatherInfoByCities = openWeatherService
				.getWeatherInfoByCities(Arrays.asList("Chicago", "Houston", "Los Angeles"));
		Assert.assertNotNull(weatherInfoByCities);
		Assert.assertEquals(3, weatherInfoByCities.size());
	}
}
