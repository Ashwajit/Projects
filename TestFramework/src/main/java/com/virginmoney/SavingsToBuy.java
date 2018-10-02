package com.virginmoney;

import java.io.IOException;

public class SavingsToBuy {

	static String url = "https://uk.virginmoney.com/savings/find/saving_to_buy_issue_7/overview/";
	static String title = "Saving to Buy | Easy Access | Savings | Virgin Money UK";

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
