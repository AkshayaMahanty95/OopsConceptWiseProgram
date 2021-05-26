package com.ojas;

public class Employee {

	// variable
	int employeeId;
	String employeeName;
	double basicSalary;
    double grossSalary;

	// default constructor
	public Employee() {
		super();
	}

	// Parameterised constructor( empid, empname, basicSalary)
	public Employee(int employeeId, String employeeName, double basicSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
	}

	// setter and getter method for basic salary
	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	// setter and getter for grossSal
	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	// disp method
	public String dispDetails() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary=" + basicSalary
				+ ", grossSalary=" + grossSalary + "]";
	}

	// calculate sal
	public void calculateSalary() {
		grossSalary = basicSalary;
	}

}
