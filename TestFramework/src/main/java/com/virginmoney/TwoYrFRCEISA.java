package com.virginmoney;

import java.io.IOException;

public class TwoYrFRCEISA {

	static String url = "https://uk.virginmoney.com/savings/products/2_year_fixed_rate_cash_e_isa_issue_348/";
	static String title = "2 Year Fixed Rate Cash E-ISA | ISAs | Savings | Virgin Money UK";

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
