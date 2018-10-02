package com.virginmoney;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class OneYrFixedRateEBondTest {

	@Test
	public void canGoToOneYrFixedRateEBondPage() {
		Pages.oneyrfixedrateebond().goTo();
		Assert.assertTrue(Pages.oneyrfixedrateebond().isAt());
	}

	@AfterMethod
	public void cleanUp() {
		Browser.close();
	}

}
