package com.java.core.java8eatures;

import java.util.Optional;

public class OptionalClass {
	// It is a public final class which is used to deal with NullPointerException in
	// Java application.
	public static void main(String[] args) {
		Optional<String> obj = Optional.ofNullable("Srikanth");
		if (obj.isPresent()) {
			System.out.println("obj:" + obj.get());
		} else {
			System.out.println("Empty Object");
		}
	}
}
