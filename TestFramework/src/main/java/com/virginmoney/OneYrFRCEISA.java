package com.virginmoney;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OneYrFRCEISA {

	// OR

	@FindBy(className = "headline-rate")
	WebElement rateCard;

	@FindBy(xpath = "//div//div//div//div//h1[@class='vm-red']")
	WebElement shortintro;

	@FindBy(xpath = "//a[text()='Double Take E-ISA']")
	WebElement doubleTakeEISALink;

	@FindBy(xpath = "//a[text()='ISA transfer service']")
	WebElement isaTransferLink;

	@FindBy(xpath = "//section[@id='apply-now']/div[1]/div/div[1]/p/a")
	WebElement isaPdfLink;

	public OneYrFRCEISA() {
		PageFactory.initElements(Browser.driver, this);
	}

	static String url = "https://uk.virginmoney.com/savings/find/1_year_fixed_rate_cash_e_isa_issue_347/overview/";
	static String title = "1 Year Fixed Rate Cash E-ISA | ISAs | Savings | Virgin Money UK";
	static String doubleTakeEISAtitle = "Double Take E-ISA | ISAs | Savings | Virgin Money UK";
	static String isaTransferServicetitle = "The Virgin ISA Transfer Service | Savings | Virgin Money";
	static String s = "isa_key_facts.pdf";

	public void goTo() {
		try {
			Browser.goTo(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

	public boolean rateLogo() {
		return rateCard.isDisplayed();
	}

	public boolean shortIntro() {
		return shortintro.isDisplayed();
	}

	public boolean validateDoubleTakeEISALink() {
		doubleTakeEISALink.click();
		return Browser.title().equals(doubleTakeEISAtitle);
	}

	public boolean validateIsaTransferLink() {
		isaTransferLink.click();
		return Browser.title().equals(isaTransferServicetitle);
	}

	public boolean validatePdfLink() throws InterruptedException {

		isaPdfLink.click();
		Thread.sleep(2000);
		String parent = Browser.driver.getWindowHandle();
		Set<String> allWindows = Browser.driver.getWindowHandles();

		for (String child : allWindows) {
			if (!parent.equalsIgnoreCase(child)) {
				Browser.driver.switchTo().window(child);
			}
		}

		System.out.println(Browser.driver.getCurrentUrl());
		return Browser.driver.getCurrentUrl().contains(s);
	}
}