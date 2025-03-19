package com.java.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondMaxMinElements {
	public static int SecondMaxElement(int[] a) {
		
		List<Integer> l=Arrays.asList(2,8,5,99,55);
		
		return  l.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().orElse(0);
		
	}
	
	 static int SecondMinElement() {
			List<Integer> l=Arrays.asList(2,8,5,99,55);
			return l.stream().distinct().sorted().skip(1).findFirst().orElse(0);
		}
	
	
	public static void main(String[] args) {
		int a[]= {2,5,9,4,6};
//		System.out.println("SecondMaxMinElements.max:::"+SecondMaxElement(a));
//		System.out.println("SecondMaxMinElements.min::::"+SecondMinElement());
		
		for(int i=0;i<a.length;i++) {
			if(a.length-1 >i && a[i]>a[i+1]) {
				a[i]=a[i+1];
				a[i+1]=a[i];
			}
		}
for(Integer i:a) {
	System.out.println(i);
}
	}




	

	

}
