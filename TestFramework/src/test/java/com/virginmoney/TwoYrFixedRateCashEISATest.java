package com.virginmoney;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TwoYrFixedRateCashEISATest{

	@Test
	public void canGoTo2YrFRCEISAPage() {
		Pages.twoyrfrceisa().goTo();
		Assert.assertTrue(Pages.twoyrfrceisa().isAt());
	}

	@AfterMethod
	public void cleanUp() {
		Browser.close();
	}

}
