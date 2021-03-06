package com.virginmoney;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.qa.util.TestUtil;

public class Browser {

	public static WebDriver driver;
	public static String browserName;
	static Properties prop = new Properties();

	public static void goTo(String url) throws IOException {

		InputStream ip = new FileInputStream(
				"C:\\Users\\ashwa\\git\\Projects\\TestFramework\\src\\main\\java\\config\\properties");
		prop.load(ip);
		browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashwa\\Downloads\\D Drive\\Ashwajit Thukral\\Testing Tools\\Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ashwa\\Downloads\\D Drive\\Ashwajit Thukral\\Testing Tools\\Jars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (browserName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\ashwa\\Downloads\\D Drive\\Ashwajit Thukral\\Testing Tools\\Jars\\MicrosoftWebDriver.exe");
			driver = new InternetExplorerDriver();
		}

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICITLY_WAIT, TimeUnit.SECONDS);
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
