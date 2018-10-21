package com.virginmoney;

import java.io.IOException;

public class FiveYrFixedRateEBond {

	static String url = "https://uk.virginmoney.com/savings/products/5_year_fixed_rate_e_bond_issue_351/";
	static String title = "5 Year Fixed Rate E-Bond | Bonds | Savings | Virgin Money UK";

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
