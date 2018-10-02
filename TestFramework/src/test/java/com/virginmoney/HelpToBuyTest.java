package com.virginmoney;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class HelpToBuyTest {

	@Test
	public void canGoToHelpToBuyPage() {
		Pages.helptobuy().goTo();
		Assert.assertTrue(Pages.helptobuy().isAt());
	}

	@AfterMethod
	public void cleanUp() {
		Browser.close();
	}

}
