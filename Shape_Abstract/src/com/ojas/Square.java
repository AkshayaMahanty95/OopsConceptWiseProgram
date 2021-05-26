package com.ojas;

public class Square extends Shape {

	// variable
	float side;

	// Default Constructor
	public Square() {
		super();
	}

	// param constructor
	public Square(float side) {
		super();
		this.side = side;
	}

	// getter and setter
	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

	@Override
	void getArea() {
		float area = side * side;
		System.out.println("Area of the square is" + area);

	}

	@Override
	void getPerimeter() {
		float Perimeter = 4 * side;
		System.out.println("Peremeter of the Square is " + Perimeter);
	}

}
