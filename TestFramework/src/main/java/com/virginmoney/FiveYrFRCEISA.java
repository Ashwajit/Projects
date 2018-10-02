package com.virginmoney;

import java.io.IOException;

public class FiveYrFRCEISA {

	static String url = "https://uk.virginmoney.com/savings/find/5_year_fixed_rate_cash_e_isa_issue_349/overview/";
	static String title = "5 Year Fixed Rate Cash E-ISA | ISAs | Savings | Virgin Money UK";

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
