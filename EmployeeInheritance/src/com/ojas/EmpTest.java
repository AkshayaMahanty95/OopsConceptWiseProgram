package com.ojas;

public class EmpTest {

	public static void main(String[] args) {
		Manager mgr = new Manager("Akshay", 1, 50000, ManagerType.HR);
		System.out.println(mgr.toString());
		Clerk clk = new Clerk("Dinesh", 10, 20000.00, 70, 80, 0);
		System.out.println(clk.toString());
		clk.setAccuracy(85);
		clk.setSalary();
		System.out.println(clk.toString());

	}

}
