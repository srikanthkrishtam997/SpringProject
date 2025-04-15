package com.java.core.java8eatures;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Today: " + today);

		// Adding 5 days
		LocalDate futureDate = today.plusDays(5);
		System.out.println("Future Date: " + futureDate);

		// Formatting the future date
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String f = dtf.format(futureDate);
		System.out.println("After format::" + f);
		DateTimeFormatter parser = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		// Parse the string to a LocalDate
		LocalDate date = LocalDate.parse("2025-10-04", parser);

		System.out.println("Parsed date: " + date);
	}
}
