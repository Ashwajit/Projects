package com.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotHandle {

	public static WebDriver driver = null;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Appium\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.google.co.uk");
		takeScreenshot("2nd Pic");

	}

	public static void takeScreenshot(String fileName) throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,
				new File("C:\\Users\\ashwajit\\git\\Projects\\TestFramework\\src\\main\\java\\com\\screenshots\\"
						+ fileName + ".jpg"));

	}
}
