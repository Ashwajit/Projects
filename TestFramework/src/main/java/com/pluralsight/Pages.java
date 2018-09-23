package com.pluralsight;

public class Pages {

	public static HomePage homepage() {
		HomePage homepage = new HomePage();
		return homepage;
	}

	public static LoginPage loginpage() {
		LoginPage loginpage = new LoginPage();
		return new LoginPage();
	}

	public static GetStarted getstarted() {
		GetStarted getstarted = new GetStarted();
		return new GetStarted();
	}

}
