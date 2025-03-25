package com.java.core.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindLargestString {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");
		Optional<String> longestString = strings.stream().max(Comparator.comparingInt(String::length));
		System.out.println("longestString:::"+longestString);
		
		 List<Integer> wordLengths=strings.stream().map(n -> n.length()).collect(Collectors.toList());
		 System.out.println("wordLengths:::::"+wordLengths);
		 
		 
		 // Using for loop
		 int l=0;
		 String maxS="";
		 int first=strings.get(0).length();
			for (String n : strings) {
				if (first <= n.length()) {
					l = n.length();
					first = n.length();
					maxS = n;
				}
			}
			System.out.println("Max S::"+maxS);
		 
	}
}
