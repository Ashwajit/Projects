package com.virginmoney;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FiveYrFixedRateEBondTest {

	@Test
	public void canGoToFiveYrFixedRateEBondPage() {

		Pages.fiveyrfixedrateebond().goTo();
		Assert.assertTrue(Pages.fiveyrfixedrateebond().isAt());
	}

	@AfterMethod
	public void cleanUp() {
		Browser.close();
	}

}
