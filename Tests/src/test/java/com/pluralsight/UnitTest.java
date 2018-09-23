package com.pluralsight;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class UnitTest {

	@Test
	public void canGoToHomePage() throws InterruptedException {
		Pages.homepage().goTo();
		Pages.homepage().goToRoleIQ();
		Assert.assertTrue(Pages.homepage().isAt());
	}

	@Test
	public void canGoToLoginPage() {
		Pages.loginpage().goTo();
		Assert.assertTrue(Pages.loginpage().isAt());
	}

	@Test
	public void canGoToGetStarted() {
		Pages.getstarted().goTo();
		Assert.assertTrue(Pages.getstarted().isAt());
	}

	@After
	public void cleanUp() {
		Browser.close();
	}

}
