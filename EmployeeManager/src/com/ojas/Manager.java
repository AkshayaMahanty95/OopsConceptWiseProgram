package com.ojas;

public class Manager extends Employee {

	double grossSalary;
	
	//default constructor
	public Manager() {
		super();
	}

	//param constructor
	public Manager(int employeeId, String employeeName, double basicSalary) {
		super(employeeId, employeeName, basicSalary);
		
	}

	@Override
	public void calculateSalary() {
		grossSalary = basicSalary+((15*basicSalary)/100);
		super.calculateSalary();
	}

	
	public String dispDetails() {
		return "Manager [grossSalary=" + grossSalary + ", employeeId=" + employeeId + ", employeeName=" + employeeName
				+ ", basicSalary=" + basicSalary + "]";
	}
	
	
	
	
}
