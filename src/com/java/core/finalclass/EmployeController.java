package com.java.core.finalclass;

public class EmployeController {
	public static void main(String ar[])  
	{  
		EmployeDto e = new EmployeDto("ABC123");  
	String s1 = e.getPancardNumber();  
	System.out.println("Pancard Number: " + s1);  
	EmployeDto e1 = new EmployeDto("ABC456");  
	String s2 = e1.getPancardNumber();  
	System.out.println("Pancard Number: " + s2); 
	}   
}
