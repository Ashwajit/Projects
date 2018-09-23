package com.pluralsight;

public class GetStarted {

	static String url = "https://www.pluralsight.com/pricing";
	static String title = "Pricing and plans | Pluralsight";

	public void goTo() {
		Browser.goTo(url);

	}

	public boolean isAt() {

		return Browser.title().equals(title);
	}

}
