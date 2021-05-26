package com.ojas;

public class Trainee extends Employee {

	public Trainee() {
		
	}

	public Trainee(int employeeId, String employeeName, double basicSalary) {
		super(employeeId, employeeName, basicSalary);
		
	}

	@Override
	public void calculateSalary() {
		grossSalary=basicSalary+((10 * basicSalary)/100);
		super.calculateSalary();
	}

	
	public String dispDetails() {
		return "Manager [grossSalary=" + grossSalary + ", employeeId=" + employeeId + ", employeeName=" + employeeName
				+ ", basicSalary=" + basicSalary + "]";
	}
	
	
	
}
