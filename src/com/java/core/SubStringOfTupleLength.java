package com.java.core;

import java.util.ArrayList;
import java.util.List;

public class SubStringOfTupleLength {
	public static void main(String[] args) {
		String s = "abacdhdjjkj";
		int l = 2;
		List list = new ArrayList<>();
		for (int i = 0; i < s.length()-1; i++) {
			list.add(s.substring(i, i + 2));
		}
		System.out.println(list);
	}
	
}
