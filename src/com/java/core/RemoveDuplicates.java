package com.java.core;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
public static void main(String[] args) {
	// JAVA 8 Streams
	List<Integer> l=Arrays.asList(1,5,3,6,5,2,7,1);
	
	  List<Integer> unique=l.stream().distinct().collect(Collectors.toList());
	  System.out.println(unique);
	 
	// --------------------------------------------
	// Without Streams
	Set s=new HashSet();
	for (Integer i : l) {
		s.add(i);
		
	}
	System.out.println(s);
}
}
