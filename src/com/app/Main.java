package com.app;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Printing Welcome message
		System.out.println("			-- Hello, welcome to Personal Finance Management System! --");

		// Take user info
		System.out.print("Enter your name: ");
		String name = sc.nextLine();

		System.out.print("Enter your initial income: ");
		double initialIncome = sc.nextDouble();
		sc.nextLine(); 

		User user = new User(name, initialIncome);

		boolean exit = false;
		while (!exit) {

			// Showing Menu 
			System.out.println("\n---------------------------");
			System.out.println("Main Menu:");
			System.out.println("1. Add Income");
			System.out.println("2. Add Expense");
			System.out.println("3. View Balance");
			System.out.println("4. View Transactions");
			System.out.println("5. View Categorized Expenses");
			System.out.println("6. Exit");
			System.out.println("----------------------------");

			System.out.print("Choose an option: ");
			int choice = sc.nextInt();
			sc.nextLine(); 

			switch (choice) {
			case 1 -> {
				// Code For Add Income
				System.out.print("Enter income amount: ");
				double incomeAmount = sc.nextDouble();
				sc.nextLine(); // consume newline
				String incomeDate = getCurrentDate();
				Transaction incomeTransaction = new Transaction("income", incomeAmount, "Income", incomeDate);
				user.getAccount().addTransaction(incomeTransaction);
				System.out.println("Income added successfully.");
			}

			case 2 -> {
				// Code For Add Expense
				System.out.print("Enter expense amount: ");
				double expenseAmount = sc.nextDouble();
				sc.nextLine(); 

				System.out.print("Enter expense category: ");
				String category = sc.nextLine();
				String expenseDate = getCurrentDate();
				Transaction expenseTransaction = new Transaction("expense", expenseAmount, category, expenseDate);
				user.getAccount().addTransaction(expenseTransaction);
				System.out.println("Expense added successfully.");
			}

			case 3 -> // View Balance and Summary 
				user.getAccount().displaySummary();

			case 4 -> // View Transactions
				user.getAccount().displayTransactions();

			case 5 -> // View Categorized Expenses
				user.getAccount().displayCategorizedExpenses();

			case 6 -> {
				// Exit
				exit = true;
				System.out.println("Exiting the system. Goodbye!");
			}

			default -> System.out.println("Invalid choice. Please try again.");
			}
		}

		sc.close();
	}

	public static String getCurrentDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(new Date());
	}
}
