package com.ojas;

public class Circle extends Shape {

	// variable
	float radius;

	// Default constructor
	public Circle() {
		super();
	}

	// param constructor
	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	// getter and setter
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	void getArea() {
		double Area = 3.14 * radius * radius;
		System.out.println("Area of the circle is" + Area);

	}

	@Override
	void getPerimeter() {
		double Peremeter = 2 * 3.14 * radius;
		System.out.println("Peremeter of the circle is:" + Peremeter);
	}

}
