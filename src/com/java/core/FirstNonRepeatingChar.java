package com.java.core;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		String n = "apple";
		LinkedHashMap<Character, Integer> l = new LinkedHashMap<>();

		for (int i = 0; i < n.length(); i++) {
			Character c = n.charAt(i);
			if (l.containsKey(c)) {
				l.put(c, l.get(c) + 1);
			} else {
				l.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> ll : l.entrySet()) {
			if (ll.getValue() == 1) {
				System.out.println(ll.getKey());
				break;
			}
		}

	}
}