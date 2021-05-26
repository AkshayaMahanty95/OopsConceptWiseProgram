package com.ojas;

public class TestShirt {

	public static void main(String[] args) {
		
		ShirtMateria sm = ShirtMateria.Cotton;
		
		//create object shirt
		Shirt s = new Shirt(16.5f, 42f ,"" +sm);
		System.out.println(s.displayDetails());
	}

}
