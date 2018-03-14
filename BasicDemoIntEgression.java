
package com.training.homework1;

public class BasicDemoIntEgression {

	static void primitiveints() {
		  System.out.println("Working ...");
		  int intBase =  68; //base number set to 68, input from keyboard
		  int intHex = 0x0044; //defining ineger using it's hexadecimal equivalent
		  System.out.println("Hexadecimal: " + intHex + "= 0x0044"); //prints intHex as integer, and prints its actual value in plain text.
		  int intBinary = 0b01000100; // defining integer using it's binary equivalent
		  System.out.println("Binary: " + intBinary + " = 0b01000100"); //prints intBinary as integer, and prints its actual value in plain text
		  int intChar = 'D'; // defining integer by it's character equivalent
		  System.out.println("Chracter: " + intChar + " = D"); //prints Character equivalent of D, and prints D
		  System.out.println(" "); //Empty Line
		  System.out.println("All numbers are different primitives of 68."); //Explanation of following process using println 
		  System.out.println("The following are the addition, multiplication, ");
		  System.out.println("and subtraction of the three variables.");
		  System.out.println("Addition: " + (intBase + intHex + intBinary + intChar)); //simple addition of all variables
		  System.out.println("Multiplication: " + (intBase * intHex * intBinary * intChar)); //simple multiplication of all variables
		  System.out.println("Subtractoin: " + (intBase - intHex - intBinary - intChar)); //simple subtraction of all variables
		  int intUnder_Score = 6_8; //defining integer once more, only to show the properties of Underscore
		  System.out.println(intUnder_Score + "is my assigned number."); //prints intUnderScore, value is identical with other variables.
	}
	
	public static void main(String[] args) {
		
		primitiveints(); //calling method
		
	}
}
