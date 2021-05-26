package com.ojas.student;



public class StudentMain {

	public static void main(String[] args) {
		
		Student s=  new ScienceStudent(55,45,12);
		System.out.println(s.getPercentage());
		
		Student s1 =  new HistoryStudent(45,25);
		System.out.println(s1.getPercentage());
	}

}
