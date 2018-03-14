package com.training.homework1;

public class BasicDemoIntEgression {

	static void primitiveints() {
		  System.out.println("Working ...");
		  int intBase =  68; //base number set to 68, input from keyboard
		  int intHex = 0x0044; //base number converted into hexadecimal
		  System.out.println("Hexadecimal: " + intHex + "= 0x0044");
		  int intBinary = 0b01000100; // base number converted into binary
		  System.out.println("Binary: " + intBinary + " = 0b01000100");
		  int intChar = 'D'; // holds decimal equivalent, which is 65 Character equivalent of base number
		  System.out.println("Chracter: " + intChar + " = D");
		  System.out.println(" "); //Empty Space
		  System.out.println("All numbers are different primitives of 68."); 
		  System.out.println("The following are the addition, multiplication, ");
		  System.out.println("and subtraction of the three variables.");
		  System.out.println("Addition: " + (intBase + intHex + intBinary + intChar)); //simple addition of all variables
		  System.out.println("Multiplication: " + (intBase * intHex * intBinary * intChar)); //simple multiplication of all variables
		  System.out.println("Subtractoin: " + (intBase - intHex - intBinary - intChar)); //simple subtraction of all variables
	}
	
	public static void main(String[] args) {
		
		primitiveints(); //calling method
		
	}
}
