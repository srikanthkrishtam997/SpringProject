package com.java.core.loosecoupling;

public class PostPaid implements PlanInterface{

	@Override
	public String customerPlan(String planName) {
		return planName;
	}

}
