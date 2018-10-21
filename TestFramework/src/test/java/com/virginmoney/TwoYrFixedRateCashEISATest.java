package com.virginmoney;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TwoYrFixedRateCashEISATest {

	@Test(priority = 1)
	public void canGoTo2YrFRCEISAPage() {
		Pages.twoyrfrceisa().goTo();
		Assert.assertTrue(Pages.twoyrfrceisa().isAt());
	}

	// Verifying the shortIntro of the Page
	@Test(priority = 2)
	public void canValidateShortIntro() throws InterruptedException {
		Pages.twoyrfrceisa().goTo();
		Assert.assertTrue(Pages.twoyrfrceisa().validateShortIntro());
		System.out.println("shortIntroStrapline is displying properly");
	}

	// Verifying Interest Rate on Card
	@Test(priority = 3)
	public void canValidateRateCard() {
		Pages.twoyrfrceisa().goTo();
		Assert.assertTrue(Pages.twoyrfrceisa().validateInterestOnRateCard());
		System.out.println("Interest Rate displayed on Card is Correct");
	}

	// Clicking on ApplyButton
	@Test(priority = 4)
	public void canValidateApplyButton() throws InterruptedException {
		Pages.twoyrfrceisa().goTo();
		Assert.assertTrue(Pages.twoyrfrceisa().validateApplyButton());
		System.out.println("Apply Button on Rate Card is clicked");
	}

	// Opening the ISA key facts pdf and veriying it by url of the pdf
	@Test(priority = 5)
	public void canValidatePdf() throws InterruptedException {
		Pages.twoyrfrceisa().goTo();
		Assert.assertTrue(Pages.twoyrfrceisa().validatePdfLink());
		System.out.println("ISA Key Facts Pdf link is clicked and pdf is opened");
	}

	// Checking the content of the page by comparing screenshot
	@Test(priority = 6)
	public void canValidateContent() throws IOException, InterruptedException {
		Pages.twoyrfrceisa().goTo();
		Assert.assertTrue(Pages.twoyrfrceisa().validateContent());
		System.out.println("Whole Page content is matching");
	}

	@AfterMethod
	public void cleanUp() {
		Browser.close();
	}

}
