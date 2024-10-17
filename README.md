# Personal Finance Management System

This Java-based console application helps users manage their income, expenses, and view categorized expenses. It allows users to input their financial data, track transaction history, and get an overview of their financial health.

## Features

1. **Add Income:**
   - Allows users to add an income transaction. The system automatically updates the balance.

2. **Add Expense:**
   - Allows users to add an expense transaction, categorize it, and updates the balance accordingly.

3. **View Balance:**
   - Displays the total income, total expenses, and the current balance. It also provides feedback on financial health (e.g., "You're saving well!" or "You're in debt. Try to cut down on expenses.").

4. **View Transactions:**
   - Displays a full list of all transactions (income and expenses) along with the date, type, amount, and category.

5. **Categorized Expenses:**
   - Allows users to categorize their expenses and view all expenses grouped by category.

6. **Transaction History:**
   - The system stores each transaction with details such as the date, type (income/expense), amount, and category.

## How to Use

### 1. Compile the Program

First, make sure you have Java installed on your machine.

1. Open a terminal/command prompt and navigate to the `src` folder in your project directory.
2. Run the following command to compile the Java files:

   ```bash
   javac src/com/app/*.java -d bin
   ```

### 2. Run the Program

1. After compiling, run the main class `Main.java` using:

   ```bash
   cd bin
   java com.app.Main
   ```

2. Follow the prompts in the console to:
   - Input your name and initial income.
   - Choose from the following options:
     1. Add Income
     2. Add Expense
     3. View Balance
     4. View Transactions
     5. View Categorized Expenses
     6. Exit

### 3. User Interaction

- You will be prompted to enter income or expenses, along with their respective categories (for expenses).
- The system will display the balance, transaction history, or categorized expenses as requested.

### Sample Output

```
-- Hello, welcome to Personal Finance Management System! --
Enter your name: John Doe
Enter your initial income: 5000

---------------------------
Main Menu:
1. Add Income
2. Add Expense
3. View Balance
4. View Transactions
5. View Categorized Expenses
6. Exit
----------------------------
Choose an option: 1
Enter income amount: 2000
Income added successfully.

Main Menu:
1. Add Income
2. Add Expense
...
```

## Project Tutorial

## Technologies Used

- Java (Core)
- Object-Oriented Programming (OOP) Concepts
  - Classes: `User`, `Account`, `Transaction`
  - Data Structures: `ArrayList`, `HashMap`
  - Streams for filtering and summarizing transactions

## Author

- **Name:** Harshal Khandalkar
- **Email:** <harshalk2022@gmail.com>

This project is created by Harshal Khandalkar as part of learning and practicing Java development with object-oriented programming. It is a basic yet functional personal finance management system to help users track and categorize their income and expenses.
