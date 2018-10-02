package com.virginmoney;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FiveYrFixedRateCashEISATest {

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
