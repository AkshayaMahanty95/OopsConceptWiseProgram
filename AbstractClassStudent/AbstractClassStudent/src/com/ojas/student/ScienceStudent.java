package com.ojas.student;

public class ScienceStudent extends Student {
	//variable
	private int physicsMark, chemistryMarks, mathsMarks;
	//default constructor
	public ScienceStudent() {
		super();
	}
	//param constructor
	public ScienceStudent(int physicsMark, int chemistryMarks, int mathsMarks) {
		super();
		this.physicsMark = physicsMark;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}
	//abstract method
	double getPercentage() {	
		int total = physicsMark + chemistryMarks + mathsMarks;
		double Percentage = total/3;
		return Percentage;
	}
}
