package com.java.core.comparableandcomparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonComparatorController {
	 public static void main(String[] args) {
	        List<Person> people = new ArrayList<>(Arrays.asList(
	                new Person("Alice", 30, 65.5),
	                
	                new Person("Charlie", 35, 80.0),
	                new Person("Bob", 25, 75.0)
	        ));
	        System.out.println("Original people list: " + people);

//	        Collections.sort(people, new PersonNameComparator());
//	        System.out.println("Sorted people list by name: " + people);
	        
	        Collections.sort(people, new PersonAgeComparator());
	        System.out.println("Sorted people list by age: " + people);
}
}