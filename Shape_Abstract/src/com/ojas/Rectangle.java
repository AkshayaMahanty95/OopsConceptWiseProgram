package com.ojas;

public class Rectangle extends Shape {
	// variable
	float length;
	float breadth;

	// parameter constructor
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	// Default constructor
	public Rectangle() {
		super();
	}

	// setter and getter
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}

	@Override
	void getPerimeter() {
		float Peremiter = 2 * (length + breadth);
		System.out.println("Peremeter of the Rectange is " + Peremiter);

	}

	@Override
	void getArea() {
		float Area = length * breadth;
		System.out.println("Area of the Rectangle is " + Area);

	}

}
