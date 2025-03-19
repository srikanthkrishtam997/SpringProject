package com.java.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		List<String> l2 = new ArrayList<>();
		int a[] = { 4, 2, 7, 1, 5, 8, 22 };
		l.add(4);
		l.add(2);
		l.add(7);

		Map<Integer, Integer> m = new HashMap<>();
		String n = "aabddcg";
		int c = 1;
		StringBuffer sb = new StringBuffer();
        String string1 = "Great responsibility";    
        
        List<Character> list =new ArrayList<>();
        for(int i=0;i<string1.length();i++) {
        	 for(int j=i+1;j<string1.length();j++) {
             	if(string1.charAt(i)==string1.charAt(j)) {
             		if(list.contains(string1.charAt(j))) {
             			continue;
             		}else {
             			list.add(string1.charAt(i));
             		}
             	}
             }
        }
        System.out.println(list);
        

	}
}
