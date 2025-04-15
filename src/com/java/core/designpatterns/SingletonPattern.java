package com.java.core.designpatterns;

public class SingletonPattern {

	// The Singleton Design Pattern ensures that a class has only one instance and
	// provides a global point of access to it
	// This pattern is commonly used when you want to control access to a resource,
	// such as a database connection
	// 2 ways to create Singleton objects eager or early

	// Steps to create Object

	// Step 1: Create a static instance of the class (eager initialization)
	private static final SingletonPattern singletonPattern = new SingletonPattern();

	// Step 2: Private constructor to prevent instantiation from outside the class
	private SingletonPattern() {

	}

	// Step 3: Provide a global access point for the instance
	public static SingletonPattern getInstance() {
		return singletonPattern;
	}

	// Example method
	public void showMessage() {
		System.out.println("Hello from Singleton!");
	}

	public static void main(String[] args) {

		SingletonPattern single = SingletonPattern.getInstance();
		single.showMessage();
	}
}
