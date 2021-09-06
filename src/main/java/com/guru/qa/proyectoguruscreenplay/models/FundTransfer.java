package com.guru.qa.proyectoguruscreenplay.models;

public class FundTransfer {

	private String payersAccount;
	private String payeesAccount;
	private String amount;
	private String description;

	public FundTransfer(String payersAccount, String payeesAccount, String amount, String description) {
		this.payersAccount = payersAccount;
		this.payeesAccount = payeesAccount;
		this.amount = amount;
		this.description = description;
	}

	public String getPayersAccount() {
		return payersAccount;
	}

	public void setPayersAccount(String payersAccount) {
		this.payersAccount = payersAccount;
	}

	public String getPayeesAccount() {
		return payeesAccount;
	}

	public void setPayeesAccount(String payeesAccount) {
		this.payeesAccount = payeesAccount;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
