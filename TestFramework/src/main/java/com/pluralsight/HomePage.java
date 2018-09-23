package com.pluralsight;

import org.openqa.selenium.By;

public class HomePage {

	static String url = "https://pluralsight.com";
	static String title = "Pluralsight | Role IQ | Pluralsight";

	public void goTo() {
		Browser.goTo(url);
	}

	public void goToRoleIQ() throws InterruptedException {

		Browser.driver.findElement(By.xpath("//a[contains(text(),'Get your FREE Role IQ')]")).click();
		Thread.sleep(2000);

	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

}
