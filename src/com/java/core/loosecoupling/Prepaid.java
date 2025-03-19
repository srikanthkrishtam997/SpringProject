package com.java.core.loosecoupling;

public class Prepaid implements PlanInterface{

	@Override
	public String customerPlan(String planName) {
		
		return planName;
	}

}
