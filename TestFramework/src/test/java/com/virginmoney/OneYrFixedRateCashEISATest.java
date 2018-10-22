package com.virginmoney;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class OneYrFixedRateCashEISATest {

	// Checking the Page exists or not -- by verifying the page title
	@Test(priority = 1)
	public void canGoTo1YrFRCEISAPage() {
		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().isAt(), "Title mismatched");
		System.out.println("One Year Fixed Rate Page exists");
	}

	// Verifying the shortIntro of the Page
	@Test(priority = 2)
	public void canValidateShortIntro() {
		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().validateShortIntro());
		System.out.println("shortIntroStrapline is displying properly");
	}

	// Verifying Interest Rate on Card
	@Test(priority = 3)
	public void canValidateRateCard() {
		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().validateInterestOnRateCard());
		System.out.println("Interest Rate displayed on Card is Correct");
	}

	// Clicking on ApplyButton
	@Test(priority = 4)
	public void canValidateApplyButton() throws InterruptedException {
		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().validateApplyButton());
		System.out.println("Apply Button on Rate Card is clicked");
	}

	// Opening the Summarybox pdf and veriying it by url of the pdf
	@Test(priority = 5)
	public void canValidateSummaryBoxPdf() throws InterruptedException {
		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().validateSummaryBoxLink());
		System.out.println("Summary Box Print link is clicked and its opened");
	}

	// Opening the ISA key facts pdf and veriying it by url of the pdf
	@Test(priority = 6)
	public void canValidatePdf() throws InterruptedException {
		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().validatePdfLink());
		System.out.println("ISA Key Facts Pdf link is clicked and pdf is opened");
	}

	// Opening the T&C pdf and veriying it by url of the pdf
	@Test(priority = 7)
	public void canValidateTCPdf() throws InterruptedException {
		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().validateTCPdf());
		System.out.println("T&C Pdf link is clicked and pdf is opened");
	}

	// Opening the FSCS pdf and veriying it by url of the pdf
	@Test(priority = 8)
	public void canValidateFscsPdf() throws InterruptedException {
		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().validateFscsPdf());
		System.out.println("FSCS Pdf link is clicked and pdf is opened");
	}

	// Checking the content of the page by comparing screenshot
	@Test(priority = 9)
	public void canValidateContent() throws IOException, InterruptedException {
		Pages.oneyrfrceisa().goTo();
		Thread.sleep(1000);
		Assert.assertTrue(Pages.oneyrfrceisa().validateContent());
		System.out.println("Whole Page content is matching");
	}

	@AfterMethod
	public void cleanUp() {
		Browser.close();
	}

}
