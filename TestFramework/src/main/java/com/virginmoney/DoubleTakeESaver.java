package com.virginmoney;

import java.io.IOException;

public class DoubleTakeESaver {

	static String url = "https://uk.virginmoney.com/savings/products/double_take_e_saver_issue_7/";
	static String title = "Double Take E-Saver | Limited | Savings | Virgin Money UK";

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
