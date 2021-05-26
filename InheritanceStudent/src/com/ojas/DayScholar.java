package com.ojas;

public class DayScholar extends Student {

	// variable
	double transportFee;

	// default Constructor
	public DayScholar() {

	}
	
	// param constructor
	public DayScholar(int studentId, String name, double examFee, double transportFee) {
		super(studentId, name, examFee);
		this.transportFee = transportFee;
	}

	@Override
	public String toString() {
		return "DayScholar [transportFee=" + transportFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}

	// display details
	public String displayDetails() {
		return "DaysScholar [StudentId=" + studentId + ", name=" + name + ", examfee=" + examFee + ", TransportFee=" + transportFee + "]";
	}
	
	double payFee(double amount)
	{
		return super.payFee(amount) + transportFee;
	}	
}
