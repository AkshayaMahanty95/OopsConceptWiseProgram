package com.ojas;

public class Account {

	// reference variable
	Customer customer;
	// variable
	private double balance;
	private int accountNo;
	private float interestRate;
	
	//default constructor
	public Account() {
		super();
	}

	//getter and setter
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	//param constructor
	public Account(Customer customer, double balance, int accountNo, float interestRate) {
		super();
		this.customer = customer;
		this.balance = balance;
		this.accountNo = accountNo;
		this.interestRate = interestRate;
	}

	//tostring
	@Override
	public String toString() {
		return "Account [customer=" + customer + ", balance=" + balance + ", accountNo=" + accountNo + ", interestRate="
				+ interestRate + "]";
	}

	// method
	public void deposite(double amount) {
		System.out.println("Balance is " + balance);
		System.out.println("Diposite is " + amount);
		balance = balance + amount;
		System.out.println("Total is :" +balance);
		
	}
	
	//withdraw method
	public void withdraw(double amount) {
		if (balance > amount) {
			System.out.println("Balance is "+balance);
			System.out.println("Withdraw balance is "+ amount);
					balance = balance - amount;
			System.out.println("Total Balance is "+ balance);
		} else {
			System.out.println("Insuffcient balance");
		}
	}
}
