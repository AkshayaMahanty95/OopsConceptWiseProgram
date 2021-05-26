package com.ojas;

public class Hosteller extends Student {

	//variable
	double hostleFee;
	
	//default constructor
	public Hosteller() {
		double hostelFee = 0.00d;
	}
	//param constructor
	public Hosteller(int studentId, String name, double examFee, double hostleFee) {
		super(studentId, name, examFee);
		this.hostleFee = hostleFee;
	}
	
	@Override
	public String toString() {
		return "Hosteller [hostleFee=" + hostleFee + "]";
	}
	public String displayDetails(){
		return  "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]" + "Hosteller [hostleFee=" + hostleFee + "]";
	}
	double payFee(double amount)
	{
		return  super.payFee(amount) + hostleFee ;
	}
}
