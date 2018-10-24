package com.virginmoney;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;
import com.qa.util.TestUtil;

public class OneYrFRCEISA {

	// Object Repository ---OR

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

	@FindBy(xpath = "//h1[@class='h1 display-2']")
	WebElement productName;

	@FindBy(xpath = "//img[@class='fscs-sme']")
	WebElement fscsImage;

	@FindBy(xpath = "//img[@src='/virgin/assets/img/product_help_guides.jpg']")
	WebElement help_GuideImage;

	@FindBy(xpath = "//a[contains(text(),'Apply online')]")
	WebElement applyOnlineButton;

	@FindBy(xpath = "//a[contains(text(),'Sign in and apply')]")
	WebElement signInAndApplyButton;

	@FindBy(xpath = "//a[@class='btn btn-link product-info__summary-link']")
	WebElement readTheSummaryBoxLink;

	@FindBy(xpath = "//div[@id='accordion-tab-1-1-title']")
	WebElement accordion_one;

	@FindBy(xpath = "//div[@id='accordion-tab-1-2-title']")
	WebElement accordion_two;

	@FindBy(xpath = "//div[@id='accordion-tab-1-3-title']")
	WebElement accordion_three;

	@FindBy(xpath = "//div[@id='accordion-tab-1-4-title']")
	WebElement accordion_four;

	@FindBy(xpath = "//div[@id='accordion-tab-1-5-title']")
	WebElement accordion_five;

	@FindBy(xpath = "//div[@id='accordion-tab-1-6-title']")
	WebElement accordion_six;

	@FindBy(xpath = "//div[@id='accordion-tab-1-7-title']")
	WebElement accordion_seven;

	@FindBy(xpath = "//div[@id='accordion-tab-1-8-title']")
	WebElement accordion_eight;

	public OneYrFRCEISA() {
		PageFactory.initElements(Browser.driver, this);
	}

	static String title = "1 Year Fixed Rate Cash E-ISA | ISAs | Savings | Virgin Money UK";
	// static String applyonlineurl =
	// "https://online.virginmoney.com/SSO/SSO/PersonalDetailsView.jsf";
	// static String signinandapplyurl =
	// "https://online.virginmoney.com/SSO/SSO/CustomerIdView.jsf";
	static String isapdfurl = "isa_key_facts.pdf";
	static String tcpdfurl = "uk.virginmoney.com/virgin/assets/pdf/terms_conditions.pdf";
	static String fscspdfurl = "uk.virginmoney.com/virgin/assets/pdf/fscs-guide.pdf";
	static String summaryboxprinturl = "uk.virginmoney.com/savings/products/1_year_fixed_rate_cash_e_isa_issue_353/print";

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

	public boolean validateProductName() {
		String prodName = productName.getText();
		System.out.println(prodName);
		return productName.getText().contains("1 Year Fixed Rate Cash E");

	}

	public boolean validateFSCSImage() {

		return (Boolean) ((JavascriptExecutor) Browser.driver).executeScript(
				"return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
				fscsImage);
	}

	public boolean validateInterestOnRateCard() {

		String shh = interestRateOnCard.getText();
		System.out.println(shh);
		return interestRateOnCard.getText().contains("1.51%");

	}

	public boolean validateShortIntro() {
		// String si = shortIntro.getText();
		// System.out.println(si);
		return shortIntro.getText().contains("Watch your money grow tax-free");
	}

	public boolean validateApplyButton() throws InterruptedException {
		String test = applyButton.getText();
		System.out.println(test);
		applyButton.click();
		Thread.sleep(2000);
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

	public boolean validateHelpGuideImage() {
		return (Boolean) ((JavascriptExecutor) Browser.driver).executeScript(
				"return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
				help_GuideImage);
	}

	public boolean validateApplyNow() throws InterruptedException {

		applyOnlineButton.click();
		Thread.sleep(3000);
		System.out.println(Browser.driver.getCurrentUrl());
		return Browser.driver.getCurrentUrl()
				.contains("https://online.virginmoney.com/SSO/SSO/PersonalDetailsView.jsf");

	}

	public boolean validateSignInAndApply() throws InterruptedException {
		signInAndApplyButton.click();
		Thread.sleep(3000);
		System.out.println(Browser.driver.getCurrentUrl());
		return Browser.driver.getCurrentUrl().contains("https://online.virginmoney.com/SSO/SSO/CustomerIdView.jsf");

	}

	public boolean validateReadSummaryBoxLink() throws InterruptedException {

		readTheSummaryBoxLink.click();
		Thread.sleep(2000);
		accordion_one.click();
		Thread.sleep(1000);
		accordion_two.click();
		Thread.sleep(1000);
		accordion_three.click();
		Thread.sleep(1000);
		accordion_four.click();
		Thread.sleep(1000);
		accordion_five.click();
		Thread.sleep(1000);
		accordion_six.click();
		Thread.sleep(1000);
		accordion_seven.click();
		Thread.sleep(1000);
		accordion_eight.click();
		Thread.sleep(1000);
		return readTheSummaryBoxLink.isEnabled();
	}

}