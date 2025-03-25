package com.java.core.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SqureEachElement {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> numberSqure = numbers.stream().map(n -> n * n).collect(Collectors.toList());
		List<Integer> n = numbers.stream().filter(m -> m > 3).collect(Collectors.toList());
		System.out.println(n);
	}

}
