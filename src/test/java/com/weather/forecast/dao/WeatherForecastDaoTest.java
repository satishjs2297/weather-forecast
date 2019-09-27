package com.weather.forecast.dao;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.web.client.RestTemplate;

public class WeatherForecastDaoTest {

	@Mock
	private RestTemplate restTemplateMock;

	@InjectMocks
	private WeatherForecastDaoImpl weatherForecastDao;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		ReflectionTestUtils.setField(weatherForecastDao, "openWeatherMapUrl", "http://localhost:8080/weatherReport");
	}

	@Test
	public void testgetWeatherForecastByCities() {

		Mockito.when(restTemplateMock.getForObject(Mockito.any(String.class), Mockito.eq(String.class)))
				.thenReturn("{code:123, temp:400}");
		List<String> weatherReportsByCities = weatherForecastDao
				.getWeatherForecastByCities(Arrays.asList("USA", "London"));
		Assert.assertNotNull(weatherReportsByCities);
		Assert.assertEquals(2, weatherReportsByCities.size());
	}
}
