package com.semanticsquare.oop;

public class StaffPolymorphism extends UserPolymorphism {
	public void printUserType() {
		System.out.println("Staff");
	}

	public void postAReview() {
	   System.out.println("Staff: postAReview");
	}
}
