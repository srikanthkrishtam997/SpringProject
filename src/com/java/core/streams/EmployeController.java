package com.java.core.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeController {
	public static void main(String[] args) {
		Address ad1 = new Address("KPHB", "TG");
		Address ad2 = new Address("Madhapur", "TG");
		Employe e1 = new Employe("srikanth", 1, ad1);

		Employe e2 = new Employe("Ganesh", 2, ad2);
		List<Employe> emp = new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
//		e1.setEmpName("Dhana");
		System.out.println("Before::"+e1.getEmpName());
		List<String> l = emp.stream().map(n -> n.getAddress().getLocation()).collect(Collectors.toList());
		System.out.println("All Address Location:"+l);
		System.out.println("List Of Emp::"+emp);
	}
}
