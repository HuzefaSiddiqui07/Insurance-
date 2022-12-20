package com.velocity.assignment12;

import java.util.Scanner;

//Child Class of LifeInsurance Parent Class 

public class Q03_TermPolicy_C03 extends Q03_LifeInsurance_C03 {
	
	// Declare
	int duration;

	// Use Getter Setter Method
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	// Create a method 
	public void getTermPolicyDetails() {
		
		System.out.println("Enter the term policy details >>>");
		
		// Create an Object
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the policy duration");
		duration = scanner.nextInt();
		
		// Create an Object
		Q03_TermPolicy_C03 termPolicy = new Q03_TermPolicy_C03();
		
		termPolicy.setDuration(duration);
		
		getTermPolicyInformation(termPolicy);
		
	}
	
	// Create Method
	public void getTermPolicyInformation(Q03_TermPolicy_C03 termPolicy) {
		
		System.out.println("Term Policy duration is >>> " + termPolicy.getDuration());
		
	}
	
}
