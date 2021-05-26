package com.ojas;

public class TestStudent {

	public static void main(String[] args) {
		
		DayScholar s1 = new DayScholar(1, "aks", 10, 40);
		
		
		System.out.println(s1.displayDetails());
		System.out.println(s1.payFee(500.0d));
	
	}

}
