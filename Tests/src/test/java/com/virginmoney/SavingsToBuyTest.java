package com.virginmoney;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SavingsToBuyTest {

	@Test
	public void canGoToSavingsToBuyPage() {
		Pages.savingstobuy().goTo();
		Assert.assertTrue(Pages.savingstobuy().isAt());
	}

	@AfterMethod
	public void cleanUp() {
		Browser.close();
	}

}
