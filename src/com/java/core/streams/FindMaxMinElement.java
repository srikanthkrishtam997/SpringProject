package com.java.core.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindMaxMinElement {
public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(10, 20, 35, 50, 5, 80, 15);
    int i=numbers.stream().max(Integer::compareTo).orElse(0);
    
    System.out.println(numbers.stream().sorted(Collections.reverseOrder()).skip(0).findFirst().orElse(0));
}
}
