package com.virginmoney;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SmokeTest {

	/*
	 * Testing Online Products
	 */
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

	@Test
	public void canGoTo2YrFRCEISAPage() {
		Pages.twoyrfrceisa().goTo();
		Assert.assertTrue(Pages.twoyrfrceisa().isAt());
	}

	@Test
	public void canGoTo5YrFRCEISAPage() {
		Pages.fiveyrfrceisa().goTo();
		Assert.assertTrue(Pages.fiveyrfrceisa().isAt());
	}

	@Test
	public void canGoToDoubleTakeEISAPage() {
		Pages.doubletakeeisa().goTo();
		Assert.assertTrue(Pages.doubletakeeisa().isAt());
	}

	@Test
	public void canGoToManUtdDoubleTakeEISAPage() {
		Pages.manutddoubletakeeisa().goTo();
		Assert.assertTrue(Pages.manutddoubletakeeisa().isAt());
	}

	@Test
	public void canGoToHelpToBuyPage() {
		Pages.helptobuy().goTo();
		Assert.assertTrue(Pages.helptobuy().isAt());
	}

	@Test
	public void canGoToSavingsToBuyPage() {
		Pages.savingstobuy().goTo();
		Assert.assertTrue(Pages.savingstobuy().isAt());
	}

	@Test
	public void canGoToDoubleTakeESaverPage() {
		Pages.doubletakeesaver().goTo();
		Assert.assertTrue(Pages.doubletakeesaver().isAt());

	}

	@Test
	public void canGoToManUtdDoubleTakeESaverPage() {
		Pages.manutddoubletakeesaver().goTo();
		Assert.assertTrue(Pages.manutddoubletakeesaver().isAt());
	}

	@Test
	public void canGoToOneYrFixedRateEBondPage() {
		Pages.oneyrfixedrateebond().goTo();
		Assert.assertTrue(Pages.oneyrfixedrateebond().isAt());
	}

	@Test
	public void canGoToFiveYrFixedRateEBondPage() {
		Pages.fiveyrfixedrateebond().goTo();
		Assert.assertTrue(Pages.fiveyrfixedrateebond().isAt());
	}

	@AfterMethod
	public void cleanUp() {
		Browser.close();
	}

}
