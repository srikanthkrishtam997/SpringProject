package com.java.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCountUsingStream {

	public static void main(String[] args) {
		 List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple", "kiwi");

	        Map<String, Long> duplicates = list.stream()
	            .collect(Collectors.groupingBy(s -> s, Collectors.counting())) // Group and count each string
	            .entrySet().stream() // Stream over the map entries (string -> count)
	            .filter(entry -> entry.getValue() > 1) // Filter those with count > 1 (duplicates)
	            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)); // Collect duplicates into a map

	        // Total count of duplicated strings
	        long duplicatedCount = duplicates.size();

//	         Output the repeated strings and their counts
	        System.out.println("Repeated strings and their counts: " + duplicates);
	        System.out.println("Total number of duplicated strings: " + duplicatedCount);
	        
	        
//	       new DuplicateCountUsingStream(). printFrequencyNumbers();
	        
	        // Second Max
       System.out.println(list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().orElse("ss"));
	        // Second min
       System.out.println(list.stream().distinct().sorted().skip(1).findFirst().orElse("ss"));
       
       list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().orElse("");

	        
	        
	        
	        
	        
	        
	}
	
	public  void printFrequencyNumbers() {
		List<String> myList = Arrays.asList("black","blue","red","blue","red");
		HashSet<Object> duplicates = new HashSet<Object>(myList);

		for (Object duplicate : duplicates) {
		  System.out.print(duplicate +"   ");
//		  System.out.print(" Occurrences: ");
		  System.out.println(Collections.frequency(myList, duplicate));
		}
	}
	
}
