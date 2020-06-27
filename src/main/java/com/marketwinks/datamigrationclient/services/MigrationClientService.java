package com.marketwinks.datamigrationclient.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MigrationClientService {

	@RequestMapping(value = "/UK_LSE/5MinsBuy/start", method = RequestMethod.GET)
	public boolean ukbuy5Min() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(4);
		String dateString = dtf.format(inputdate).toString();
		String url = "http://datamigration-client.herokuapp.com/baseURL/uk_buy_signals_5Mins_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/15MinsBuy/start", method = RequestMethod.GET)
	public boolean ukbuy15Min() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(7);
		String dateString = dtf.format(inputdate).toString();
		String url = "http://datamigration-client.herokuapp.com/baseURL/uk_buy_signals_15Mins_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);
		return execution_result;

	}

}
