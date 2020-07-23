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
		LocalDateTime inputdate = LocalDateTime.now().minusDays(1);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_buy_signals_5Mins_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/15MinsBuy/start", method = RequestMethod.GET)
	public boolean ukbuy15Min() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(2);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_buy_signals_15Mins_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/30MinsBuy/start", method = RequestMethod.GET)
	public boolean ukbuy30Min() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(3);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_buy_signals_30Mins_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/HourlyBuy/start", method = RequestMethod.GET)
	public boolean ukbuyHourly() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(4);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_buy_signals_Hourly_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/DailyBuy/start", method = RequestMethod.GET)
	public boolean ukbuyDaily() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(5);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_buy_signals_Daily_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/WeeklyBuy/start", method = RequestMethod.GET)
	public boolean ukbuyWeekly() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(10);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_buy_signals_Weekly_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/MonthlyBuy/start", method = RequestMethod.GET)
	public boolean ukbuyMonthly() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(20);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_buy_signals_Monthly_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/5MinsSell/start", method = RequestMethod.GET)
	public boolean uksell5Min() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(1);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_sell_signals_5Mins_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/15MinsSell/start", method = RequestMethod.GET)
	public boolean uksell15Min() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(2);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_sell_signals_15Mins_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/30MinsSell/start", method = RequestMethod.GET)
	public boolean uksell30Min() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(3);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_sell_signals_30Mins_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/HourlySell/start", method = RequestMethod.GET)
	public boolean uksellHourly() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(4);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_sell_signals_Hourly_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/DailySell/start", method = RequestMethod.GET)
	public boolean uksellDaily() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(5);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_sell_signals_Daily_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/WeeklySell/start", method = RequestMethod.GET)
	public boolean uksellWeekly() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(10);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_sell_signals_Weekly_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/MonthlySell/start", method = RequestMethod.GET)
	public boolean uksellMonthly() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(20);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_sell_signals_Monthly_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/5MinsMacd/start", method = RequestMethod.GET)
	public boolean ukmacd5Min() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(4);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_lse_5mins_macd_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/15MinsMacd/start", method = RequestMethod.GET)
	public boolean ukmacd15Min() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(7);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_lse_15mins_macd_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/30MinsMacd/start", method = RequestMethod.GET)
	public boolean ukmacd30Min() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(10);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_lse_30mins_macd_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/HourlyMacd/start", method = RequestMethod.GET)
	public boolean ukmacdHourly() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(14);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_lse_hourly_macd_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/DailyMacd/start", method = RequestMethod.GET)
	public boolean ukmacdDaily() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(30);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_lse_daily_macd_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/WeeklyMacd/start", method = RequestMethod.GET)
	public boolean ukmacdWeekly() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(90);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_lse_daily_macd_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/MonthlyMacd/start", method = RequestMethod.GET)
	public boolean ukmacdMonthly() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(180);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_lse_monthly_macd_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/5MinsPrice/start", method = RequestMethod.GET)
	public boolean ukprice5Min() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(4);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_lse_5mins_price_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/15MinsPrice/start", method = RequestMethod.GET)
	public boolean ukprice15Min() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(7);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_lse_15mins_price_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/30MinsPrice/start", method = RequestMethod.GET)
	public boolean ukprice30Min() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(10);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_lse_30mins_price_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/HourlyPrice/start", method = RequestMethod.GET)
	public boolean ukpriceHourly() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(14);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_lse_hourly_price_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/DailyPrice/start", method = RequestMethod.GET)
	public boolean ukpriceDaily() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(30);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_lse_daily_price_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/WeeklyPrice/start", method = RequestMethod.GET)
	public boolean ukpriceWeekly() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(90);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_lse_daily_price_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/UK_LSE/MonthlyPrice/start", method = RequestMethod.GET)
	public boolean ukpriceMonthly() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now().minusDays(180);
		String dateString = dtf.format(inputdate).toString();
		String url = "https://datamigration-mw.herokuapp.com/baseURL/uk_lse_monthly_price_datamigrate/" + dateString
				+ "/migrate";
		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

	@RequestMapping(value = "/RSSFeedNewsArticlesMigrate/start", method = RequestMethod.GET)
	public boolean RSSFeedNewsArticlesMigrate() throws Exception {

		boolean execution_result = false;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime inputdate = LocalDateTime.now();
		String dateString = dtf.format(inputdate).toString();
		int timeInHour = 0;
//		if (LocalDateTime.now().getHour() > 4) {
//			timeInHour = LocalDateTime.now().getHour() - 4;
//		}
		if (LocalDateTime.now().getHour() > 2) {
			timeInHour = LocalDateTime.now().getHour() - 2;
		}
		String timeInHourStr = null;
		if (timeInHour < 10) {
			timeInHourStr = "0" + Integer.toString(timeInHour);
		} else {
			timeInHourStr = Integer.toString(timeInHour);
		}
		String url = "https://datamigration-mw.herokuapp.com/baseURL/rssfeednewsarticle_datamigrate/" + dateString + "/"
				+ timeInHourStr + "/migrate";

		Thread.sleep(500);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		if (response.getStatusLine().getStatusCode() == 200) {
			execution_result = true;
		}
		return execution_result;

	}

}
