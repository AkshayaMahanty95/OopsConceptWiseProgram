package com.ojas;

public class Test {

	public static void main(String[] args) {
	
		Account account = new Account();
		
		Customer customer = new Customer("Akshaya","Mahanty");
		
		account.customer=customer;
		account.setAccountNo(102010);
		account.setBalance(5000.00);
		account.setInterestRate(3);
		System.out.println(account.toString());
		System.out.println(customer.toString());
	account.deposite(2000.00);
	account.withdraw(4000);
	
	}

}
