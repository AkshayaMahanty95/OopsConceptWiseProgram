package com.ojas;

public class Student {

	public int studentId;
	public String studentName;
	private int smarks;
	private char grade;

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, int smarks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.smarks = smarks;
		calculateGrade();
	}

	public void displayDetails() {

		System.out.println("Student [studentId=" + studentId + ", studentName=" + studentName + ", smarks=" + smarks
				+ ", grade=" + grade + "]");

	}

	public void calculateGrade() {

		if (smarks > 90) {
			grade = 'A';
		} else if (smarks > 80 && smarks <= 90) {
			grade = 'B';
		} else if (smarks > 70 && smarks <= 80) {
			grade = 'C';
		} else if (smarks > 70 && smarks <= 80) {
			grade = 'D';
		} else {
			grade = 'E';
		}
	}

}
