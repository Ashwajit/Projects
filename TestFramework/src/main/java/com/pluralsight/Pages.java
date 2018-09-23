package com.pluralsight;

public class Pages {

	public static HomePage homepage() {
		return new HomePage();
	}

	public static LoginPage loginpage() {
		return new LoginPage();
	}

	public static GetStarted getstarted() {
		return new GetStarted();
	}

}
