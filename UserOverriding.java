package com.semanticsquare.oop;

public class UserOverriding {
   public int id = 1;
	
   public void printUserType() {
	   System.out.println("User");
   }
   
   public void saveWebLink() {
	   System.out.println("User: saveWebLink");
	   //postAReview();
   }
   public Review postAReview(String reviewText) {
	   System.out.println("User: postAReview");
	   Review review = new Review(reviewText);
	   return review;
   }
}
