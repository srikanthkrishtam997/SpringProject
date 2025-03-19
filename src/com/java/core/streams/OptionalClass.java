package com.java.core.streams;

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {

		Optional<String> nonNullOptional = Optional.of("Hello");

		System.out.println(nonNullOptional.empty());
		if(nonNullOptional.isPresent())
			nonNullOptional.ifPresent(v -> v.startsWith("H"));
        System.out.println(nonNullOptional.get()); // Output: Hello
		System.out.println("99"+nonNullOptional.of("Srikanth"));
		nonNullOptional.of("Srikanth");
System.out.println(nonNullOptional.orElse("Default Value"));
	}
}
