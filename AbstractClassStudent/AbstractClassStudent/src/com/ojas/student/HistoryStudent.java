package com.ojas.student;
public class HistoryStudent extends Student {

	//variable
	private int historyMarks;
	private int civicsMarks;
	//default constructor
	public HistoryStudent() {
		super();
	}
	//param constructor
	public HistoryStudent(int historyMarks, int civicsMarks) {
		super();
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}
	//abstract method
	double getPercentage() {
		int total = historyMarks + civicsMarks ;
		double Percentage = total/2;
		return Percentage;
	}
}
