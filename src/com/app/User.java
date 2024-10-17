package com.app;

public class User {
	private String name;
	private double initialIncome;
	private Account account;

	public User(String name, double initialIncome) {
		this.name = name;
		this.initialIncome = initialIncome;
		this.account = new Account(initialIncome);
	}

	public String getName() {
		return name;
	}

	public double getInitialIncome() {
		return initialIncome;
	}

	public Account getAccount() {
		return account;
	}

	public void displayUserInfo() {
		System.out.println("User: " + name);
		System.out.println("Initial Income: Rs." + initialIncome);
	}
}
