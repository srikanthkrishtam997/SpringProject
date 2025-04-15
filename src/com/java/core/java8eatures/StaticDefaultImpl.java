package com.java.core.java8eatures;

public class StaticDefaultImpl implements StaticDefaultMethods {

	public  void defaultMethod() {
		System.out.println("Default Method111");
	}
	
	public static void main(String[] args) {
		StaticDefaultMethods.staticMethod();
		StaticDefaultMethods s = new StaticDefaultImpl();
		s.defaultMethod();

	}
}
