package com.pluralsight;

public class LoginPage {

	static String url = "https://app.pluralsight.com/library/";
	static String title = "Sign In - Pluralsight";

	public void goTo() {
		Browser.goTo(url);
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

}
