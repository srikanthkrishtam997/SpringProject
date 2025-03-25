package com.java.core.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUppercases {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		List<String> upper = words.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
		System.out.println(upper);

		
		// can we call a method inside method without creating object
		ConvertToUppercases c = new ConvertToUppercases();
		c.set();
	}

	public void get() {
		System.out.println("Get method");
	}

	public void set() {
		get();
		System.out.println("Set method");
	}
}
