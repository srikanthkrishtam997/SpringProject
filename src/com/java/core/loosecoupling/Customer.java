package com.java.core.loosecoupling;

public class Customer {

	private PlanInterface plan;

	public Customer(PlanInterface plan) {
		this.plan = plan;
	}
	public String getCustomerPlan(String plan) {
		
		return this.plan.customerPlan(plan);
		
	}
}
