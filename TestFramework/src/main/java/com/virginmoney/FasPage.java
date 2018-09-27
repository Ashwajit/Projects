package com.virginmoney;

public class FasPage {

	static String url = "https://uk.virginmoney.com/savings/find/results/online";
	static String title = "Savings Range | Virgin Money UK";

	public void goTo() {
		Browser.goTo(url);
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

}
