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

	// Opening the Summarybox pdf and veriying it by url of the pdf

	@Test(priority = 2)
	public void canValidateSummaryBoxPdf() throws InterruptedException {
		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().validateSummaryBoxLink());
		System.out.println("Summary Box Print link is clicked and its opened");
	}

	// Opening the ISA key facts pdf and veriying it by url of the pdf

	@Test(priority = 3)
	public void canValidatePdf() throws InterruptedException {
		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().validatePdfLink());
		System.out.println("ISA Key Facts Pdf link is clicked and pdf is opened");
	}

	// Opening the T&C pdf and veriying it by url of the pdf

	@Test(priority = 4)
	public void canValidateTCPdf() throws InterruptedException {
		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().validateTCPdf());
		System.out.println("T&C Pdf link is clicked and pdf is opened");
	}

	// Opening the FSCS pdf and veriying it by url of the pdf

	@Test(priority = 5)
	public void canValidateFscsPdf() throws InterruptedException {
		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().validateFscsPdf());
		System.out.println("FSCS Pdf link is clicked and pdf is opened");
	}

	// verifying the FSCS Image
	@Test(priority = 6)
	public void canValidateFSCSImage() throws Exception {

		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().validateFSCSImage());
		System.out.println("FSCS Image Displayed");
	}

	// verifying the Help and Guide Image
	@Test(priority = 7)
	public void canValidateHelp_GuideImage() throws Exception {

		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().validateHelpGuideImage());
		System.out.println("Help and Guide Image Displayed");
	}

	// clicking the Apply now button for ETS2 check
	@Test(priority = 8)
	public void canValidateApplyNow() throws InterruptedException {

		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().validateApplyNow());
		System.out.println("Apply now button is clicked and ETS2 page is opened");
	}

	@Test(priority = 9)
	public void canValidateReadSummaryBoxLink() throws InterruptedException {

		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().validateReadSummaryBoxLink());
		System.out.println(
				"Clicked on Please read the summary box link on Rate card and now all 8 accordions are clicked");

	}

	// clicking the Apply now button for ETS2 check
	@Test(priority = 10)
	public void canValidateSignInAndApply() throws InterruptedException {

		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().validateSignInAndApply());
		System.out.println("SignIn and Apply button is clicked and ETS2 page is opened");
	}

	// Checking the content of the page by comparing screenshot

	@Test(priority = 11)
	public void canValidateContent() throws InterruptedException, IOException {
		Pages.oneyrfrceisa().goTo();
		Thread.sleep(1000);
		Assert.assertTrue(Pages.oneyrfrceisa().validateContent());
		System.out.println("Page content is matching");
	}

	// Clicking the ApplyButton on Rate card

	@Test(priority = 12)
	public void canValidateApplyButton() throws InterruptedException {
		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().validateApplyButton());
		System.out.println("Apply Button on Rate Card is clicked");
	}

	// Verifying Interest Rate on Card

	@Test(priority = 13)
	public void canValidateRateCard() {
		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().validateInterestOnRateCard());
		System.out.println("Interest Rate displayed on Card is Correct");
	}

	// Verifying the shortIntro of the Page

	@Test(priority = 14)
	public void canValidateShortIntro() {
		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().validateShortIntro());
		System.out.println("shortIntroStrapline is displying properly");
	}

	// Verifying the Product Name
	@Test(priority = 15)
	public void canValidateProductName() {
		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().validateProductName());
		System.out.println("Product name is displying properly");
	}

	@AfterMethod
	public void cleanUp() {
		Browser.close();

	}

}
