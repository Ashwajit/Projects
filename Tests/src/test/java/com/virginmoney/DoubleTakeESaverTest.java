package com.virginmoney;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DoubleTakeESaverTest {

	@Test
	public void canGoToDoubleTakeESaverPage() {
		Pages.doubletakeesaver().goTo();
		Assert.assertTrue(Pages.doubletakeesaver().isAt());

	}

	@AfterMethod
	public void cleanUp() {
		Browser.close();
	}

}
