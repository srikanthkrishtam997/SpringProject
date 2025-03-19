package com.java.core.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedOrFrequencyOfWord {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
		Map<String, Long> wordFrequency = words.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		wordFrequency.forEach((word, count) -> System.out.println(word + ": " + count));
		
		
		// Set
		List<String> wordsSet = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");

//		Set<String> set=wordsSet.stream().collect(Collectors.toSet());
		Set<String> set=wordsSet.stream().distinct().collect(Collectors.toSet());
		System.out.println(set);
	}
}
