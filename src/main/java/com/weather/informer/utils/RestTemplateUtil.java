package com.weather.informer.utils;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Objects;

import javax.net.ssl.SSLContext;

import org.apache.http.client.HttpClient;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.weather.informer.exception.WeatherInformerException;

public class RestTemplateUtil {

	private static RestTemplate restTemplate;

	private RestTemplateUtil() {

	}

	public static RestTemplate getInstance() {
		if (Objects.isNull(restTemplate)) {
			HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
			requestFactory.setHttpClient(httpClient());
			restTemplate = new RestTemplate(requestFactory);
		}
		return restTemplate;
	}

	public static HttpClient httpClient() {
		try {
			TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;
			SSLContext sslContext = SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build();
			SSLConnectionSocketFactory socketFactory = new SSLConnectionSocketFactory(sslContext);
			return HttpClients.custom().setSSLSocketFactory(socketFactory).build();
		} catch (KeyManagementException | NoSuchAlgorithmException | KeyStoreException e) {
			throw new WeatherInformerException(e);
		}
	}
}
