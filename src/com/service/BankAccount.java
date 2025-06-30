package com.service;

public class BankAccount {
	
	private String name;
	
	private int accNo;
	
	private int balance;

	
	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", accNo=" + accNo + ", balance=" + balance + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAccNo() {
		return accNo;
	}


	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	BankAccount(){
		
	}


	public BankAccount(String name, int accNo, int balance) {
		super();
		this.name = name;
		this.accNo = accNo;
		this.balance = balance;
	}

}
