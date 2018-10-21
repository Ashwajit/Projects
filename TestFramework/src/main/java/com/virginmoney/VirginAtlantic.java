package com.virginmoney;

import java.io.IOException;

public class VirginAtlantic {

	static String url = "https://uk.virginmoney.com/savings/products/virgin_atlantic_1_year_flying_club_savings_account_issue_4";
	static String title = "Virgin Atlantic 1 Year Flying Club Savings Account | Bonds | Savings | Virgin Money UK";

	public void goTo() throws IOException {
		Browser.goTo(url);
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

}
