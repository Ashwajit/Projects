package com.virginmoney;

import java.io.IOException;

public class FasPage {

	static String url = "https://uk.virginmoney.com/savings/find/results/online";
	static String title = "Savings Range | Virgin Money UK";

	public void goTo() {
		try {
			Browser.goTo(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

}
