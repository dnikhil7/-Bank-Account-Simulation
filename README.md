# Bank Account Simulation
Overview
This project is a simple Core Java-based simulation of basic banking operations. It demonstrates object-oriented programming (OOP) concepts such as encapsulation, class structure, and method interactions, without relying on a database. The application allows a single user to deposit money, withdraw funds, and view transaction history, with all transactions stored in a local text file.

# Features
Create a bank account with an account number, holder name, and initial balance

Deposit amount and update balance

Withdraw amount with insufficient funds check

View transaction history

Store all transaction logs in a local text file using file handling

# Technologies Used
Java (Core)

File Handling (FileInputStream and FileOutputStream)

java.time API for date and time tracking

Command-line interface using Scanner

# Project Structure
BankAccount.java
Defines the account holder's details and manages balance through getters and setters.

AccountManagement.java
Contains the business logic for deposit, withdrawal, and transaction logging.

Test.java
Main driver class to interact with the user and simulate operations.

# How It Works
User starts the application and selects one of the available operations:

Deposit

Withdraw

View Transactions

Each transaction is timestamped and saved in a local file (Transactions.txt).

The program terminates after completing one operation (can be enhanced to run in a loop for multiple operations).

# Purpose
This project was built as a practice exercise to strengthen understanding of:

Object-oriented programming principles in Java

File I/O for data persistence

Basic CLI user interaction

Structuring a simple Java application with multiple classes

# Limitations
Only supports a single hardcoded user (no authentication or user accounts)

File overwriting issue resolved by appending new entries

No database integration (intentionally excluded for Core Java practice)
