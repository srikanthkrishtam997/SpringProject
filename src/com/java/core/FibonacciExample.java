package com.java.core;

public class FibonacciExample {
	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 2;
		int n3 = 0;
		int c = 5;
		for (int i = 0; i < c; i++) {
    n3=n1+n2;
    n1=n2;
    n2=n3;
		}
	}
}
