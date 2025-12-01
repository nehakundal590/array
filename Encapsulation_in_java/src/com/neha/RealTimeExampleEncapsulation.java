package com.neha;
import java.util.Scanner;

public class RealTimeExampleEncapsulation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		BankAccount account=new BankAccount();
		 
		//Setting data using setters
		account.setAccountNumber("IFCE:122897235");
		account.setAccountHolder("Neha");
	     account.setBalance(500);
	     account.setPin(1233);  //setting PIN
	
	//Accessing data using getters
	System.out.println("Account Number:"+account.getAccountNumber());
	System.out.println("Account Holder:"+account.getAccountHolder());
	
	//User input for deposit
	System.out.println("Enter amount to deposit:");
	double depositAmount=sc.nextDouble();
	account.deposit(depositAmount);
	
	//User input for withdraw
	System.out.println("Entered amount to withdraw:");
	double withdrawAmount=sc.nextDouble();
	System.out.println("Entered PIN:");
	int pin=sc.nextInt();
	((BankAccount) account).withdraw(withdrawAmount, pin);
	
	//User input for balance check
	System.out.println("Entered PIN to check balance");
	int pinCheck=sc.nextInt();
	account.checkBalance(pinCheck);
	sc.close();
	
	
	
	
	
	} 

}
