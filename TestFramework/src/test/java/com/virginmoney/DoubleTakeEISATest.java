package com.virginmoney;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DoubleTakeEISATest {

	@Test
	public void canGoToDoubleTakeEISAPage() {
		Pages.doubletakeeisa().goTo();
		Assert.assertTrue(Pages.doubletakeeisa().isAt());
	}

	@AfterMethod
	public void cleanUp() {
		Browser.close();
	}

}
