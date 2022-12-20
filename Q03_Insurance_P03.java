// Java Assignment 12 Q.(03)
// Siddiqui Huzefa Muzammil (Group-I)
// Velocity Java Development Batch 2022.
// Date : 26th November 2022.

/*
* Assignment 12
* Program-3
*/
package com.velocity.assignment12;

import java.util.Scanner;

//Multilevel Inheritance
//Parent Class
public class Q03_Insurance_P03 {

	// Declare
	int id;
	String personName;
	String insuranceCompany;
	
	// Use Getter Setter Method
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public String getInsuranceCompany() {
		return insuranceCompany;
	}
	public void setInsuranceCompany(String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}
	
	// Create Method
	public void getInsuranceDetails() {
	
		System.out.println("Enter the insurance details >>>");
		
		// Create Scanner Object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter insurance person name");
		personName = sc.nextLine();
		
		System.out.println("Enter insurance company");
		insuranceCompany = sc.nextLine();
		
		System.out.println("Enter the id of insurance person");
		id = sc.nextInt();
		
		 // Create an Object
		Q03_Insurance_P03 insurance = new Q03_Insurance_P03();
		
		insurance.setId(id);
		insurance.setPersonName(personName);
		insurance.setInsuranceCompany(insuranceCompany);
		
		getInsuranceInformation(insurance);
		
	}
	
	public void getInsuranceInformation(Q03_Insurance_P03 insurance) {
		
		System.out.println("Insurance Id >>> " + insurance.getId());
		System.out.println("Insurance Person Name >>> " + insurance.getPersonName());
		System.out.println("Insurance Company >>> " + insurance.getInsuranceCompany());
	}
	
}
