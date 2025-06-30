package com.service;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		AccountManagement obj=new AccountManagement();
		
		BankAccount user=new BankAccount();
		user.setAccNo(1234);
		user.setName("Nikhil");
		user.setBalance(2000);
		
		System.out.println("* Welcome to London Bank *");
		System.out.println(" ");
		
		System.out.println("Press 1 to deposit: ");
		System.out.println("Press 2 to withdraw: ");
		System.out.println("Press 3 to check transactions: ");
		
		int option=sc.nextInt();
		
		switch(option) {
		
		case 1 :
			String a=obj.deposit(user);
			System.out.println(a);
			break;
			
		case 2 :
			obj.withdraw(user);
			break;
			
		case 3 :
			obj.getTransaction();
			System.out.println(" ");
			break;
		}
		
		System.out.println("Thank you!");
		sc.close();
		
	}

}
