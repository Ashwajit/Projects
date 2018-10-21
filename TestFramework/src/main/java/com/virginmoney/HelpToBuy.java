package com.virginmoney;

import java.io.IOException;

public class HelpToBuy {

	static String url = "https://uk.virginmoney.com/savings/products/help_to_buy_isa/";
	static String title = "Help to Buy: ISA | Savings | Virgin Money UK";

	public void goTo() throws InterruptedException {
		try {
			Browser.goTo(url);
			Thread.sleep(1000);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

}
