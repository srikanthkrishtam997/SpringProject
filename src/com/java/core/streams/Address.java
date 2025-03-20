package com.java.core.streams;

public class Address {
	// Srikanth Added
	// Pull from sts
	private String location;
	private String State;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public Address(String location, String state) {
		super();
		this.location = location;
		State = state;
	}
	// Change

}
