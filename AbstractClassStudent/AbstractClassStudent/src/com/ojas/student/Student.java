package com.ojas.student;

public abstract class Student {
	//variable
	private String studentName;
	private String studentClass;
	protected static int totalNoOfStudent;
	//abstract method
	abstract double getPercentage();
	
	public static void getTotalStudent() {
		
	}
	//default constructor
	public Student() {
		super();
	}

	//param constructor
	public Student(String studentName, String studentClass) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
	}
	
	
	
}
