package com.virginmoney;

import java.io.IOException;

public class ManUtdDoubleTakeEISA {

	static String url = "https://uk.virginmoney.com/savings/find/man_utd_double_take_e_isa_issue_1/overview/";
	static String title = "Man Utd Double Take E-ISA | ISAs | Savings | Virgin Money UK";

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
