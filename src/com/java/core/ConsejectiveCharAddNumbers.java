package com.java.core;

import java.util.Iterator;

public class ConsejectiveCharAddNumbers {
	public static void main(String[] args) {

		String n="aaaaaaaabbceedhh"; int c=1; StringBuilder sb=new StringBuilder();
		for(int i=0;i<n.length();i++) {
			if(i<n.length()-1 && n.charAt(i)==n.charAt(i+1)) {
				c++;
			}else {
				sb.append(n.charAt(i)).append(c);
				c=1;
			}
		}
		
		System.out.println(sb.toString());
	}
}
