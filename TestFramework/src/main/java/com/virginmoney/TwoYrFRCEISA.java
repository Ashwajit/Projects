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

public class TwoYrFRCEISA {

	// OR

	@FindBy(xpath = "//span[contains(text(),'1.61%')]")
	WebElement interestRateOnCard;

	@FindBy(xpath = "//p[contains(text(),'Watch your money grow tax-free')]")
	WebElement shortIntro;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement applyButton;

	@FindBy(xpath = "//div[@id='apply-box']//a[2]")
	WebElement isaPdfLink;

	public TwoYrFRCEISA() {
		PageFactory.initElements(Browser.driver, this);
	}

	// static String url =
	// "https://uk.virginmoney.com/savings/products/2_year_fixed_rate_cash_e_isa_issue_348/";
	static String title = "2 Year Fixed Rate Cash E-ISA | ISAs | Savings | Virgin Money UK";
	static String s = "isa_key_facts.pdf";
	static String shortIntroStrapline = "Watch your money grow tax-free";

	public void goTo() {
		try {
			Browser.goTo(TestUtil.twoyr_frc_eisa_url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

	public boolean validateInterestOnRateCard() {

		String shh = interestRateOnCard.getText();
		System.out.println(shh);
		return interestRateOnCard.getText().contains("1.61%");

	}

	public boolean validateShortIntro() throws InterruptedException {
		String sh = shortIntro.getText();
		System.out.println(sh);
		Thread.sleep(1000);
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
		return Browser.driver.getCurrentUrl().contains(s);
	}

	public boolean validateContent() throws IOException, InterruptedException {

		// Shutterbug.shootPage(Browser.driver, ScrollStrategy.BOTH_DIRECTIONS, 500,
		// true)
		// .withName("twoyrFixedRateCashEISAImage").save();
		// Thread.sleep(3000);

		File file = new File(
				"C:\\Users\\ashwajit\\git\\Projects\\TestFramework\\screenshots\\twoyrFixedRateCashEISAImage.png");
		BufferedImage twoyrFixedRateCashEISAImage = ImageIO.read(file);
		Thread.sleep(1000);
		return Shutterbug.shootPage(Browser.driver, ScrollStrategy.BOTH_DIRECTIONS, 500, true).withName("Actual")
				.equals(twoyrFixedRateCashEISAImage, 0.1);

	}

}
