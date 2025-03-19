package com.java.core;

public class BaseExponent {
	// Driver Code
	public static void main(String[] args) {
		int base = 5;
		int exp = 2;
		int d = 1;
		while (exp > 0) {
			d = d * base;
			exp--;
		}
System.out.println(d);
	}

}
