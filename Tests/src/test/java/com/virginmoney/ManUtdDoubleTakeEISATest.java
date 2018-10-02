package com.virginmoney;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ManUtdDoubleTakeEISATest {

	@Test
	public void canGoToManUtdDoubleTakeEISAPage() {
		Pages.manutddoubletakeeisa().goTo();
		Assert.assertTrue(Pages.manutddoubletakeeisa().isAt());
	}

	@AfterMethod
	public void cleanUp() {
		Browser.close();
	}

}
