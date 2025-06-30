package com.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class AccountManagement {
	
	Scanner sc= new Scanner(System.in);
	
	LocalDate date = LocalDate.now();
	LocalTime time = LocalTime.now();
	
	File file=new File("C:\\Users\\doula\\Documents\\NotesApp\\Transactions.txt");
	
	FileOutputStream records = null;
	
	public String deposit(BankAccount a) {
		String transaction = null;
		try {
			System.out.println("Please enter the amount to deposit: ");
			int amt=sc.nextInt();
			int dept=a.getBalance()+amt;
			a.setBalance(dept);
			
			records=new FileOutputStream(file);
			
			 transaction = "Transaction of "+amt+" is successful at "+time+" on "+date+" Your current balance is "+a.getBalance();
			
			records.write(transaction.getBytes());
			
			return transaction;
			
		}
		catch(Exception e) {
			return  transaction ;
		}
	
	}
	
	public void withdraw(BankAccount a) {
		try {
		System.out.println("Please enter the amount to withdraw: ");
		int amt=sc.nextInt();
		if(amt>a.getBalance()) {
			System.out.println("Insufficient balance");
		}
		else {
			System.out.println("Withdraw of "+amt+" successful");
			int availableBalance = a.getBalance()-amt;
			System.out.println("Current available balance is "+availableBalance);
			
            records=new FileOutputStream(file);
			
			String withdraw = "Withdraw of "+amt+" is successful at "+time+" on "+date;
			
			records.write(withdraw.getBytes());
		}
		
		}
		catch (Exception e) {
			System.out.println("Please enter a proper amount");
			
		}
		
	}
	
	
	public void getTransaction() {
		FileInputStream history =null;
		try {
			history	= new FileInputStream(file);
			int temp=0;
			while((temp!=-1)) {
				temp=history.read();
				System.out.print((char)temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	

}
