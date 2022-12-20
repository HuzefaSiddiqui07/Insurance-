package com.velocity.assignment12;
// Main Class

public class Q03_MainInsuranceClass_M03 {

	public static void main(String[] args) {
		
 // Create an Object of Child Class LifeInsurance to call Child & Parent Class Method
		Q03_LifeInsurance_C03 li = new Q03_LifeInsurance_C03();
		
		li.getInsuranceDetails();
		li.getLifeInsuranceDetails();
		
 // Create an Object of Child Class TermPolicy to Call Child Class Method
		Q03_TermPolicy_C03 tp = new Q03_TermPolicy_C03();
		
		tp.getTermPolicyDetails();
	}

}
