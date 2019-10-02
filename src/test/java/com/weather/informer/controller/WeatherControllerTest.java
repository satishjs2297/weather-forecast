package com.weather.informer.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.weather.informer.controller.WeatherController;

public class WeatherControllerTest {

	@InjectMocks
	private WeatherController weatherController;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testLandingPage() {
		String landingPage = weatherController.landingPage();
		Assert.assertNotNull(landingPage);
	}

}
