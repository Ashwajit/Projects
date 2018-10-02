package com.virginmoney;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ManUtdDoubleTakeESaverTest {

	@Test
	public void canGoToManUtdDoubleTakeESaverPage() {
		Pages.manutddoubletakeesaver().goTo();
		Assert.assertTrue(Pages.manutddoubletakeesaver().isAt());
	}

	@AfterMethod
	public void cleanUp() {
		Browser.close();
	}

}
