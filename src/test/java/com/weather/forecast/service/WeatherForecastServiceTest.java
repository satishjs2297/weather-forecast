package com.weather.forecast.service;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.weather.forecast.dao.WeatherForecastDao;

public class WeatherForecastServiceTest {
	
	@Mock
	private WeatherForecastDao weatherForecastDaoMock;

	@InjectMocks
	private WeatherForecastServiceImpl weatherForecastDao;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	public void testGetWeatherForecastByCities() {
		weatherForecastDao.getWeatherForecastByCities(Arrays.asList("USA", "London"));
	}


}
