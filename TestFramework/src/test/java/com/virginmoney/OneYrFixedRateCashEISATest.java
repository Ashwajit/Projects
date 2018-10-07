package com.virginmoney;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class OneYrFixedRateCashEISATest {

	@Test
	public void canGoTo1YrFRCEISAPage() {
		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().isAt(), "Title mismatched");
		System.out.println("One Year Fixed Rate Page exists");
	}

	@Test
	public void canValidateRateCard() {
		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().rateLogo(),
				"Rate card logo not displaying on 1 Year Fixed Rate Cash EISA");
		System.out.println("Rate Card for 1 Year Fixed Rate is displaying");
	}

	@Test
	public void canValidateShortIntro() {
		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().shortIntro(), "Short intro changed");
		System.out.println("Short Intro is displaying");
	}

	@Test
	public void canValidateDoubleTakeEISALink() {
		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().validateDoubleTakeEISALink());
		System.out.println("Double Take EISA link is clicked");
	}

	@Test
	public void canValidateIsaTransferLink() {
		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().validateIsaTransferLink());
		System.out.println("ISA Transfer link is clicked");
	}

	@Test
	public void canValidatePdf() throws InterruptedException {
		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().validatePdfLink());
		System.out.println("ISA Key Facts Pdf link is clicked and pdf is opened");
	}

	@AfterMethod
	public void cleanUp() {
		Browser.close();
	}

}
