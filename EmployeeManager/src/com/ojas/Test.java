package com.ojas;

public class Test {

	public static void main(String[] args) {
		Employee e = new Employee(10, "Akshay", 12000.00);
		e.calculateSalary();
		System.out.println(e.dispDetails());
		System.out.println();
		
		Manager manager = new Manager(11, "Dhanus", 45000.00);
		manager.calculateSalary();
		System.out.println(manager.dispDetails());
		System.out.println();
		
		Trainee trainee = new Trainee(12, "sai", 20000.00);
		trainee.calculateSalary();
		System.out.println(trainee.dispDetails());
		

	}

}
