package com.ojas;

public class ShapeTest {

	public static void main(String[] args) {
		
		Circle c = new Circle(2.0f);
		c.getArea();
		c.getPerimeter();
		
		System.out.println("---------------------------------");
		
		Square s = new Square(3.0f);
		s.getArea();
		s.getPerimeter();
		
		System.out.println("-------------------------------");

		
		Rectangle r = new Rectangle(1.1f, 3.0f);
		r.getArea();
		r.getPerimeter();
	}

}
