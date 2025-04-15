package com.java.core.designpatterns;

public interface FactorySim {

	// A Factory Pattern says that just define an
	// interface s for creating an object but let the subclasses
	// decide which class to instantiate. In other words, subclasses are responsible
	// to create the instance of the class.
	// Advantages loose-coupling

	public String simCardName();
}
