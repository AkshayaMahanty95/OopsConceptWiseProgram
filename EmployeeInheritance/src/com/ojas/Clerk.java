package com.ojas;

public class Clerk extends Employee {
	int speed;
	int accuracy;
	int increment = 0;

	public Clerk(String name, int employeeId, double salary, int speed, int accuracy, int increment) {
		super(name, employeeId, salary);
		this.speed = speed;
		this.accuracy = accuracy;
		this.increment = increment;
		setSalary();
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public int getIncrement() {
		return increment;
	}

	public void setIncrement(int increment) {
		this.increment = increment;
	}
	
	void setSalary() {
    	if(increment==0) {
			if(speed>=70&&accuracy<=80) {
				salary+=1000;
				increment++;
			}
		}
	}

	@Override
	public String toString() {
		return "Clerk [speed=" + speed + ", accuracy=" + accuracy + ", increment=" + increment + ", name=" + name
				+ ", employeeId=" + employeeId + ", salary=" + salary + "]";
	}

	
	
	
	
}
