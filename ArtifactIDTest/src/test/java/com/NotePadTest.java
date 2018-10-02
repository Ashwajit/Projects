package com;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class NotePadTest {

	public static WindowsDriver driver = null;

	@BeforeClass
	public void init() {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
		try {
			driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), cap);
			driver.manage().window().maximize();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testNotePad() {
		driver.findElement(By.className("Edit")).sendKeys("Hi...This is WinAppDriver");
	}

}