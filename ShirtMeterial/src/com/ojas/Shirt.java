package com.ojas;

enum ShirtMateria {Cotton, Linen, Polyester};

public class Shirt {
	//variable
	float collarSize;
	float length;
	String meterial;
	
	//default constructor
	public Shirt() {
		this.collarSize = 0;
		this.length = 0;
		this.meterial = null;
		
	}

	//param constructor
	public Shirt(float collarSize, float length, String meterial) {
		super();
		this.collarSize = collarSize;
		this.length = length;
		this.meterial = meterial;
	}
	
	//setter and getter
	public float getCollarSize() {
		return collarSize;
	}

	public void setCollarSize(float collarSize) {
		this.collarSize = collarSize;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public String getMeterial() {
		return meterial;
	}

	public void setMeterial(String meterial) {
		this.meterial = meterial;
	}
	
	//toString
	@Override
	public String toString() {
		return "Shirt [collarSize=" + collarSize + ", length=" + length + ", meterial=" + meterial + "]";
	}
	
	//display method
	public String displayDetails() {
		return "Shirt [collarSize=" + collarSize + ", length=" + length + ", meterial=" + meterial + "]";
	}

	
	
	
}
