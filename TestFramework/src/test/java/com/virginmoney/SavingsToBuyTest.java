package com.virginmoney;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SavingsToBuyTest {

	@Test
	public void canGoToSavingsToBuyPage() throws IOException {
		Pages.savingstobuy().goTo();
		Assert.assertTrue(Pages.savingstobuy().isAt());
	}

	@AfterMethod
	public void cleanUp() throws IOException {
		Browser.close();
	}

}
