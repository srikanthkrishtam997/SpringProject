package com.java.core.designpatterns;

public class FactoryClass {
	// A Factory Pattern says that just define an
	// interface s for creating an object but let the subclasses
	// decide which class to instantiate. In other words, subclasses are responsible
	// to create the instance of the class.
	// Advantages loose-coupling

	public FactorySim createSimObject(String sim) {

		if (sim.equals("Airtel")) {
			return new FactoryAirtel();
		} else if (sim.equals("Jio")) {
			return new FactoryJio();
		} else {
			return null;

		}

	}

	public static void main(String[] args) {
		FactoryClass factoryClass = new FactoryClass();
		FactorySim factory1 = factoryClass.createSimObject("Jio");
		FactorySim factory2 = factoryClass.createSimObject("Airtel");
		System.out.println("factory1:::" + factory1.simCardName());
		System.out.println("factory2:::" + factory2.simCardName());

	}
}
