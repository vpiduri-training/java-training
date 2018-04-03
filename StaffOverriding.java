package com.semanticsquare.oop;

public class StaffOverriding extends UserOverriding {
	public int id = 2;	
	public void printId() {
		System.out.println("id: " + id);
		System.out.println("super.id: " + super.id);
	}
	
	public void printUserType() {
		System.out.println("Staff");
	}
	
	public Review postAReview(String reviewText) {
	   System.out.println("Staff: postAReview");
	   Review review = super.postAReview(reviewText);
	   review.setApproved(true);
	   return review;
	}
}
