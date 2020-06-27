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
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_buy_signals_5Mins_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);
	
		if(response.getStatusLine().getStatusCode() == 200) {
		execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/15MinsBuy/start", method = RequestMethod.GET)
	public boolean ukbuy15Min() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(7);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_buy_signals_15Mins_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);
		

		if(response.getStatusLine().getStatusCode() == 200) {
		execution_result = true;
		}	
		return execution_result;

	}
	
	@RequestMapping(value = "/UK_LSE/30MinsBuy/start", method = RequestMethod.GET)
	public boolean ukbuy30Min() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(10);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_buy_signals_30Mins_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);
	
		if(response.getStatusLine().getStatusCode() == 200) {
		execution_result = true;
		}
		return execution_result;

	}

	
	@RequestMapping(value = "/UK_LSE/HourlyBuy/start", method = RequestMethod.GET)
	public boolean ukbuyHourly() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(14);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_buy_signals_Hourly_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);
	
		if(response.getStatusLine().getStatusCode() == 200) {
		execution_result = true;
		}
		return execution_result;

	}

	
	@RequestMapping(value = "/UK_LSE/DailyBuy/start", method = RequestMethod.GET)
	public boolean ukbuyDaily() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(30);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_buy_signals_Daily_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);
	
		if(response.getStatusLine().getStatusCode() == 200) {
		execution_result = true;
		}
		return execution_result;

	}

	
	@RequestMapping(value = "/UK_LSE/WeeklyBuy/start", method = RequestMethod.GET)
	public boolean ukbuyWeekly() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(90);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_buy_signals_Weekly_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);
	
		if(response.getStatusLine().getStatusCode() == 200) {
		execution_result = true;
		}
		return execution_result;

	}

	
	@RequestMapping(value = "/UK_LSE/MonthlyBuy/start", method = RequestMethod.GET)
	public boolean ukbuyMonthly() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(180);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_buy_signals_Monthly_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);
	
		if(response.getStatusLine().getStatusCode() == 200) {
		execution_result = true;
		}
		return execution_result;

	}


}
