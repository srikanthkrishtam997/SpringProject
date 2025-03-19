package com.java.core.comparableandcomparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://ashutoshkrris.medium.com/comparable-vs-comparator-explained-in-java-0aabaedf8d47
public class PersonComparableController {

	public static void main(String[] args) {
		List<PersonComparable> people = new ArrayList<>(Arrays.asList(new PersonComparable("Alice", 30, 65.5),
				new PersonComparable("Bob", 25, 75.0), new PersonComparable("Charlie", 35, 80.0)));
		System.out.println("Original people list: " + people);

		Collections.sort(people);
		System.out.println("Sorted people list: " + people);
	}
}
