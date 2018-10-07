package com.qa.util;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Appium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.get("https://uk.virginmoney.com/savings/find/1_year_fixed_rate_cash_e_isa_issue_347/overview/");
		// driver.get("https://uk.virginmoney.com/savings/find/1_year_fixed_rate_cash_e_isa_issue_347/overview/");
		// driver.get("https://uk.virginmoney.com/savings/find/2_year_fixed_rate_cash_e_isa_issue_348/overview/");
		// driver.get("https://uk.virginmoney.com/savings/find/5_year_fixed_rate_cash_e_isa_issue_349/overview/");
		// driver.get("https://uk.virginmoney.com/savings/find/double_take_e_isa_issue_2/overview/");
		// Offline Products
		// driver.get("https://uk.virginmoney.com/savings/find/1_year_fixed_rate_cash_isa_issue_382/overview/");
		// driver.get("https://uk.virginmoney.com/savings/find/3_year_fixed_rate_cash_isa_issue_383/overview/");
		// driver.get("https://uk.virginmoney.com/savings/find/virgin_easy_access_cash_isa_issue_25/overview/");
		// driver.get("https://uk.virginmoney.com/savings/find/regular_saver_issue_13/overview/");
		driver.get("https://www.google.co.uk");
		// 1. get the list of all links and images
		List<WebElement> links = driver.findElements(By.tagName("a"));
		links.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Size of full links and images---->" + links.size());

		List<WebElement> activelinks = new ArrayList<WebElement>();

		// 2. Iterate links: exclude all the links/images - doesn't have href attribute
		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getAttribute("href"));
			if (links.get(i).getAttribute("href") != null
					&& (!links.get(i).getAttribute("href").contains("cardchecker"))
					&& (!links.get(i).getAttribute("href").contains("javascript"))
					&& (!links.get(i).getAttribute("href").contains("mailto"))) {
				activelinks.add(links.get(i));
			}
		}

		System.out.println("Size of active links and images--->" + activelinks.size());
		// 3. check the href url, with httpconnection api:
		// 200 --Ok
		// 404 --not found
		// 500 -- internal error
		// 400 -- bad request

		for (int j = 0; j < activelinks.size(); j++) {
			HttpURLConnection connection = (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href"))
					.openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activelinks.get(j).getAttribute("href") + "----->" + response);
		}

	}
}
