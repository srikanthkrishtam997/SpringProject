package com.java.core.java8eatures;

import java.util.Arrays;
import java.util.List;

public class ForEach {
	// Java provides a new method forEach() to iterate the elements. It is defined
	// in Iterable collections  and Stream interfaces.
	// This method takes a single parameter which is a functional interface. So, you
	// can pass lambda expression as an argument.
	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");
		names.forEach(n -> System.out.println(n));
	}
}
