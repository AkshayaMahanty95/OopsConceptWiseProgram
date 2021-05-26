package com.ojas;

public class Student {
	// variable
	int studentId;
	String name;
	double examFee;

	// default constructor
	public Student() {
		int StudentId = 0;
		String name = null;
		double examfee = 0.00d;
	}

	// param constructor
	public Student(int studentId, String name, double examFee) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}

	// display method
	String displayDetails() {
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}

	// payfee method
	double payFee(double amount) {
		return examFee - amount;
	}

	

}
