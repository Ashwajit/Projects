package com.virginmoney;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;
import com.qa.util.TestUtil;

public class OneYrFRCEISA {

	// OR

	@FindBy(xpath = "//span[contains(text(),'1.51%')]")
	WebElement interestRateOnCard;

	@FindBy(xpath = "//p[contains(text(),'Watch your money grow tax-free')]")
	WebElement shortIntro;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement applyButton;

	@FindBy(xpath = "//div[@id='apply-box']//a[2]")
	WebElement isaPdfLink;

	@FindBy(xpath = "//div[@id='apply-box']//p//a[1]")
	WebElement summaryBoxLink;

	@FindBy(xpath = "//div[@id='apply-box']//a[3]")
	WebElement tandCLink;

	@FindBy(xpath = "//div[@id='apply-box']//a[4]")
	WebElement fSCSLink;

	public OneYrFRCEISA() {
		PageFactory.initElements(Browser.driver, this);
	}

	// static String url =
	// "https://uk.virginmoney.com/savings/products/1_year_fixed_rate_cash_e_isa_issue_347/";
	static String title = "1 Year Fixed Rate Cash E-ISA | ISAs | Savings | Virgin Money UK";
	static String isapdfurl = "isa_key_facts.pdf";
	static String tcpdfurl = "uk.virginmoney.com/virgin/assets/pdf/terms_conditions.pdf";
	static String fscspdfurl = "uk.virginmoney.com/virgin/assets/pdf/fscs-guide.pdf";
	static String summaryboxprinturl = "uk.virginmoney.com/savings/products/1_year_fixed_rate_cash_e_isa_issue_347/print";
	static String shortIntroStrapline = "Watch your money grow tax-free";

	public void goTo() {
		try {
			Browser.goTo(TestUtil.oneyr_frc_eisa_url);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

	public boolean validateInterestOnRateCard() {

		String shh = interestRateOnCard.getText();
		System.out.println(shh);
		return interestRateOnCard.getText().contains("1.51%");

	}

	public boolean validateShortIntro() {
		// String sh = shortIntro.getText();
		// System.out.println(sh);
		return shortIntro.getText().contains(shortIntroStrapline);
	}

	public boolean validateApplyButton() throws InterruptedException {
		String test = applyButton.getText();
		System.out.println(test);
		applyButton.click();
		Thread.sleep(1000);
		return true;
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
		return Browser.driver.getCurrentUrl().contains(isapdfurl);
	}

	public boolean validateContent() throws IOException, InterruptedException {

		// Shutterbug.shootPage(Browser.driver, ScrollStrategy.BOTH_DIRECTIONS, 500,
		// true)
		// .withName("oneyrFixedRateCashEISAImage").save();
		// Thread.sleep(3000);

		File file = new File(
				"C:\\Users\\ashwajit\\git\\Projects\\TestFramework\\screenshots\\oneyrFixedRateCashEISAImage.png");
		BufferedImage oneyrFixedRateCashEISAImage = ImageIO.read(file);
		Thread.sleep(1000);
		return Shutterbug.shootPage(Browser.driver, ScrollStrategy.BOTH_DIRECTIONS, 500, true).withName("Actual")
				.equals(oneyrFixedRateCashEISAImage, 0.1);

	}

	public boolean validateTCPdf() throws InterruptedException {

		tandCLink.click();
		Thread.sleep(2000);
		String parent = Browser.driver.getWindowHandle();
		Set<String> allWindows = Browser.driver.getWindowHandles();

		for (String child : allWindows) {
			if (!parent.equalsIgnoreCase(child)) {
				Browser.driver.switchTo().window(child);
			}
		}
		System.out.println(Browser.driver.getCurrentUrl());
		return Browser.driver.getCurrentUrl().contains(tcpdfurl);
	}

	public boolean validateFscsPdf() throws InterruptedException {

		fSCSLink.click();
		Thread.sleep(2000);
		String parent = Browser.driver.getWindowHandle();
		Set<String> allWindows = Browser.driver.getWindowHandles();

		for (String child : allWindows) {
			if (!parent.equalsIgnoreCase(child)) {
				Browser.driver.switchTo().window(child);
			}
		}
		System.out.println(Browser.driver.getCurrentUrl());
		return Browser.driver.getCurrentUrl().contains(fscspdfurl);

	}

	public boolean validateSummaryBoxLink() throws InterruptedException {
		summaryBoxLink.click();
		Thread.sleep(2000);
		String parent = Browser.driver.getWindowHandle();
		Set<String> allWindows = Browser.driver.getWindowHandles();

		for (String child : allWindows) {
			if (!parent.equalsIgnoreCase(child)) {
				Browser.driver.switchTo().window(child);
			}
		}
		System.out.println(Browser.driver.getCurrentUrl());
		return Browser.driver.getCurrentUrl().contains(summaryboxprinturl);
	}

}
