package com.java.core.comparableandcomparator;

public class PersonComparable implements Comparable<PersonComparable> { 
	String name;
	int age;
	double weight;

	public PersonComparable(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "PersonV2 [name=" + name + ", age=" + age + ", weight=" + weight + " kgs]";
	}

	@Override
	public int compareTo(PersonComparable other) {
		return this.age - other.age;
	}

}
