package com.app;

public class Transaction {
	private String type; // "income" or "expense"
	private double amount;
	private String category;
	private String date;

	public Transaction(String type, double amount, String category, String date) {
		this.type = type;
		this.amount = type.equals("expense") ? -amount : amount;
		this.category = category;
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}

	public String getCategory() {
		return category;
	}

	@Override
	public String toString() {
		return "Date: " + date + " | Type: " + type + " | Amount: Rs. " + Math.abs(amount) + " | Category: " + category;
	}
}
