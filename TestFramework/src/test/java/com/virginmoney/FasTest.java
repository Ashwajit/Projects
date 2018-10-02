package com.virginmoney;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FasTest {

	@Test
	public void canGoToFasPage() {
		Pages.faspage().goTo();
		Assert.assertTrue(Pages.faspage().isAt());
	}

	@AfterMethod
	public void cleanUp() {
		Browser.close();
	}

}
