package com.ojas;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class AgeCalculator {

	public static void calculateAge() {
		LocalDate start = LocalDate.of(1995, Month.APRIL, 20);
		LocalDate end = LocalDate.of(2021, Month.APRIL, 20);
		double month = ChronoUnit.MONTHS.between(start, end);
		
		double age = month/12;
		System.out.println("Age :"+age);
	}
	public static void main(String[] args) {
		
		calculateAge();
		
	}
}
