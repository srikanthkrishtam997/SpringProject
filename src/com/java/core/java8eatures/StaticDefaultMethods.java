package com.java.core.java8eatures;

public interface StaticDefaultMethods {

	public static void staticMethod() {
		System.out.println("Static Method");
	}

	public default void defaultMethod() {
		System.out.println("Default Method");
	}
}
