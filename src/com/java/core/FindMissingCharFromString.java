package com.java.core;

public class FindMissingCharFromString {
public static void main(String[] args) {
	String s1="The quick own fox jumps ove the lazy dog";
	String s2="abcdefghijklmnopqrstuvwxyz";
	String s3=""; int c=0;
	for (int i = 0; i < s2.length(); i++) {
		if(s2.length()>i && !s1.contains(Character.toString(s2.charAt(i)))) {
			s3=s3+s2.charAt(i); c++;
		}
		
	}
	System.out.println("Missing Char:"+s3 +":;"+c);
}
}
