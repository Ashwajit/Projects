package com.virginmoney;

import java.io.IOException;

public class HelpToBuy {

	static String url = "https://uk.virginmoney.com/savings/products/help_to_buy_isa/";
	static String title = "Help to Buy: ISA | Savings | Virgin Money UK";

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
