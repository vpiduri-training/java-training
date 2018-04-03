package com.semanticsquare.oop;

public class ReviewOverriding {
	private String reviewText;
	private boolean approved;
	
	public Review (String reviewText) {
		this.reviewText = reviewText;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
}
