package com.ojas;

public class Manager extends Employee {
	
	//instance variable
	ManagerType type;

	//default constructor
	public Manager() {
		super();
	}

	//param constructor
	public Manager(String name, int employeeId, double salary, ManagerType type) {
		super(name, employeeId, salary);
		this.type = type;
		setSalary();
	}

	//setsalary method
	void setSalary() {
		if(this.type==ManagerType.HR) {
			salary+=10000;
		}
		else {
			salary+=5000;
		}
	}

	@Override
	public String toString() {
		return "Manager [type=" + type + ", name=" + name + ", employeeId=" + employeeId + ", salary=" + salary + "]";
	}

	
	
	
	
}
