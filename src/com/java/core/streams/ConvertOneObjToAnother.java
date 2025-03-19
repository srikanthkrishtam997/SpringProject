package com.java.core.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertOneObjToAnother {
	public static void main(String[] args) {

		Obj1 ob1=new Obj1("srikanth","hyderabad");
		Obj1 ob2=new Obj1("ganesh","hyderabad");
		
		List<Obj1> l=new ArrayList<>();
		l.add(ob1);
		l.add(ob2);
		List<Obj2> newObj=  l.stream().map(n -> new Obj2(n.getName(),n.getLocation())).collect(Collectors.toList());
		newObj.forEach(System.out::println);
	}
}
