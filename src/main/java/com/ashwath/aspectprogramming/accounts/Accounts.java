package com.ashwath.aspectprogramming.accounts;

public class Accounts {

	private String accountId;

	private String currency;

	public Accounts(String accountId, String currency) {
		this.accountId = accountId;
		this.currency = currency;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
