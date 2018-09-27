package com.pluralsight;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

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

	@AfterMethod
	public void cleanUp() {
		Browser.close();
	}

}
