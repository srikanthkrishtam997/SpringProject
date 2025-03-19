package com.java.core.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUppercases {
public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<String> upper=     words.stream().map(n ->n.toUpperCase()).collect(Collectors.toList());
        System.out.println(upper);
}
}
