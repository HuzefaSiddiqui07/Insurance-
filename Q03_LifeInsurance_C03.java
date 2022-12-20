package com.velocity.assignment12;

import java.util.Scanner;

// Child Class of Insurance Parent Class 
public class Q03_LifeInsurance_C03 extends Q03_Insurance_P03{
	
	// Declare
	int premiumAmount;
	
     // Getter Setter Method Use
	public int getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(int premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	
	// Create Method
	public void getLifeInsuranceDetails() {
		
		System.out.println("Enter the life insurance details");
		
		// Create Scanner Object
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Premium Amount");
		premiumAmount = scan.nextInt();
		
		// Create an Object
		Q03_LifeInsurance_C03 lifeInsurance = new Q03_LifeInsurance_C03();
		
		lifeInsurance.setPremiumAmount(premiumAmount);
		
		getLifeInsuranceInformation(lifeInsurance);
	}

	// Create Method
	public void getLifeInsuranceInformation(Q03_LifeInsurance_C03 lifeInsurance) {
		
		System.out.println("Premium Amount Is >>> " + lifeInsurance.getPremiumAmount());
	}
}
