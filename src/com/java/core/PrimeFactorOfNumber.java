package com.java.core;

import java.util.ArrayList;
import java.util.List;

// prime factor means a number if we multiply produces number is primenumber
public class PrimeFactorOfNumber {
	public static void main(String k[]) {

		
		int n = 6;
		List l=new ArrayList<>() ;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
			l.add(i);
				n = n / i;
			}
		}
		if (n >= 2)
			System.out.println(";" +l+""+  n);

		//new
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
	            System.out.println(i + " is a prime number.");

			}
		}
	}
	
	

}
