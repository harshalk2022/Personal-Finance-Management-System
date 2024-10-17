package com.app;

import java.util.ArrayList;
import java.util.HashMap;

public class Account {
	private double balance;
	private ArrayList<Transaction> transactions;
	private HashMap<String, ArrayList<Transaction>> categorizedExpenses;

	public Account(double initialIncome) {
		this.balance = initialIncome;
		this.transactions = new ArrayList<>();
		this.categorizedExpenses = new HashMap<>();
	}

	public double getBalance() {
		return balance;
	}

	public void addTransaction(Transaction transaction) {
		transactions.add(transaction);
		balance += transaction.getAmount(); // income will be positive, expenses negative

		// Add to categorized expenses
		if (transaction.getType().equals("expense")) {
			categorizedExpenses.computeIfAbsent(transaction.getCategory(), k -> new ArrayList<>()).add(transaction);
		}
	}

	public void displayTransactions() {
		System.out.println("\nTransaction History:");
		for (Transaction t : transactions) {
			System.out.println(t);
		}
	}

	public void displaySummary() {
		double totalIncome = transactions.stream().filter(t -> t.getType().equals("income"))
				.mapToDouble(Transaction::getAmount).sum();
		double totalExpenses = transactions.stream().filter(t -> t.getType().equals("expense"))
				.mapToDouble(t -> -t.getAmount()).sum();

		System.out.println("\nFinancial Summary:");
		System.out.println("Total Income: Rs." + totalIncome);
		System.out.println("Total Expenses: Rs." + totalExpenses);
		System.out.println("Current Balance: Rs." + balance);

		if (balance > 0) {
			System.out.println("You're saving well!");
		} else {
			System.out.println("You're in debt. Try to cut down on expenses.");
		}
	}

	public void displayCategorizedExpenses() {
		System.out.println("\nCategorized Expenses:");
		for (String category : categorizedExpenses.keySet()) {
			System.out.println("Category: " + category);
			for (Transaction t : categorizedExpenses.get(category)) {
				System.out.println(t);
			}
		}
	}
}
