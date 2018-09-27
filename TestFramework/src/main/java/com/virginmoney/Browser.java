package com.pluralsight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	static WebDriver driver = null;

	public static void goTo(String url) {
		System.setProperty("webdriver.chrome.driver", "C:/Appium/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}

	public static String title() {
		return driver.getTitle();
	}

	public static void close() {
		driver.quit();
	}

}
