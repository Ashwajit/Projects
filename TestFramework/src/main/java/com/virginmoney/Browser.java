package com.virginmoney;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static WebDriver driver;
	public static String browserName;
	static Properties prop = new Properties();

	public static void goTo(String url) throws IOException {

		InputStream ip = new FileInputStream(
				"C:\\Users\\ashwajit\\git\\Projects\\TestFramework\\src\\main\\java\\com\\virginmoney\\config.properties");
		prop.load(ip);
		browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/Appium/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:/Appium/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);

	}

	public static String title() {
		return driver.getTitle();
	}

	public static void close() {
		driver.quit();
	}

}
