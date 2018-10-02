package com.virginmoney;

import java.io.IOException;

public class ManUtdDoubleTakeESaver {

	static String url = "https://uk.virginmoney.com/savings/find/man_utd_double_take_e_saver_issue_2/overview/";
	static String title = "Man Utd Double Take E-Saver | Limited | Savings | Virgin Money UK";

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
