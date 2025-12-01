package com.neha;


public class BankAccount {
	private String accountNumber;
	private String accountHolder;
	private double balance;
	private int pin;
	
	//Getter and Setter for accountNumber
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber= accountNumber;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	//Getter and Setter for accountHolder
	public void setAccountHolder(String accountHolder) {
		this.accountHolder=accountHolder;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	
	//Getter and Setter for balance
	
	public void setBalance1(double balance) {
		if(balance>=0) {
			this.balance=balance;
		}else {
			System.out.println("Balance cannot be negtive!");
		}
	}
	//Getter and Setter for balance
	
	public void setBalance(double balance) {
		if(balance>=0) {
			this.balance=balance;
		}
		else {
			System.out.println("Blance cannot negative!");
		}
		
	}
	
	public double getBalance() {
		return balance;
	}
	//Setter for PIN
	public void setPin(int pin) {
		this.pin=pin;
	}
	
	//validate PIN
	private boolean validationPin(int enteredPin) {
		return this.pin==enteredPin;
	}
	
	//deposit money(no pin needed) 
	public void deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println("Deposite:"+amount);
		}else {
			System.out.println("Invalid deposite ammount!");
		}
	}
	//	withdraw money(require pin)
	public void withdraw(double amount,int enteredPin) {
		if(!validationPin(enteredPin)) {
			
				System.out.println("Invalid PIN!withdrawal failed.");
				return;
			}
			if(amount>0&&amount<=balance) {
				balance=balance-amount;
				System.out.println("Withdraw:"+amount);
			}else {
				System.out.println("Insufficient balance or invalid ammount!");
			}
			
		}
		//Check Balance(require pin)
		public void checkBalance(int enteredPin) {
			if(!validationPin(enteredPin)) {
				System.out.println("Invalid PIN!Cannot display balance.");
				return;
			}
			System.out.println("current balance:"+balance);
		
	
		
	
		
		
	}
}
	
	


