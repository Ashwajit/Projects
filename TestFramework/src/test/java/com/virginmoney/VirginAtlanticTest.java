package com.virginmoney;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class VirginAtlanticTest {

	@Test
	public void canGoToVirginAtlanticPage() throws IOException {
		Pages.virginAtlantic().goTo();
		Assert.assertTrue(Pages.virginAtlantic().isAt());
	}

	@AfterMethod
	public void cleanUp() {
		Browser.close();

	}

}
