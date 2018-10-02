package com.virginmoney;

import java.io.IOException;

public class DoubleTakeEISA {

	static String url = "https://uk.virginmoney.com/savings/find/double_take_e_isa_issue_2/overview/";
	static String title = "Double Take E-ISA | ISAs | Savings | Virgin Money UK";

	public void goTo() {
		try {
			Browser.goTo(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean isAt() {

		return Browser.title().equals(title);
	}

}
