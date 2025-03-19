package com.java.core;

public class PalindromeOrNot {
	public static void main(String[] args) {

		int r, sum = 0, temp;
		int n = 454;// It is the number variable to be checked for palindrome

		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			System.out.println(r);
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");

		/*
		 * String s="sas"; String r=""; for (int i = s.length()-1;i>=0;i--) {
		 * r=r+s.charAt(i); } if(s.equals(r)) { System.out.println("palindrome"); }
		 */
	}
}
