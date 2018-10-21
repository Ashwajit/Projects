package com.virginmoney;

import java.io.IOException;

public class SavingsToBuy {

	static String url = "https://uk.virginmoney.com/savings/products/saving_to_buy_issue_7/";
	static String title = "Saving to Buy | Easy Access | Savings | Virgin Money UK";

	public void goTo() {
		try {
			Browser.goTo(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean isAt() throws InterruptedException {
		Thread.sleep(1000);
		return Browser.title().equals(title);
	}

}
