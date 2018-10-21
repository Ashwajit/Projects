package com.virginmoney;

import java.io.IOException;

public class OneYrFixedRateEBond {

	static String url = "https://uk.virginmoney.com/savings/products/1_year_fixed_rate_e_bond_issue_355/";
	static String title = "1 Year Fixed Rate E-Bond | Bonds | Savings | Virgin Money UK";

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
