package com.virginmoney;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.virginmoney.Browser;
import com.virginmoney.Pages;

public class UnitTest {

	@Test
	public void canGoToFasPage() {
		Pages.faspage().goTo();
		Assert.assertTrue(Pages.faspage().isAt());
	}

	@Test
	public void canGoTo1YrFRCEISAPage() {
		Pages.oneyrfrceisa().goTo();
		Assert.assertTrue(Pages.oneyrfrceisa().isAt());
	}

	@Test
	public void canGoTo2YrFRCEISAPage() {
		Pages.twoyrfrceisa().goTo();
		Assert.assertTrue(Pages.twoyrfrceisa().isAt());
	}

	@Test
	public void canGoTo5YrFRCEISAPage() {
		Pages.fiveyrfrceisa().goTo();
		Assert.assertTrue(Pages.fiveyrfrceisa().isAt());
	}

	@AfterMethod
	public void cleanUp() {
		Browser.close();
	}

}
