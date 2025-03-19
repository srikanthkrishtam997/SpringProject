package com.java.core.loosecoupling;

public class CustomerController {
	public static void main(String[] args) {
		PlanInterface plan;
		Customer c;
		String planN;
		String planName = "prepaid";
		switch (planName) {
		case "prepaid":
			plan = new Prepaid();
			c = new Customer(plan);
			 planN=c.getCustomerPlan(planName);
			 System.out.println("Plan Name:"+planN);

			break;
		case "postpaid":
			plan = new PostPaid();
			c = new Customer(plan);
		 planN=	c.getCustomerPlan(planName);
		 System.out.println("Plan Name:"+planN);
			break;
		default:

		}
	}
}
