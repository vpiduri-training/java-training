package com.training.homework1;

public class BasicDemoEgression {

	static void print() {   //method declaration
		System.out.println(" Sample Print:");
		System.out.print("Printing a solid, "); //Part 1 of a print, details filler space as intentional
		System.out.print("continuous line between lines 2 and 3. Filler space below."); //Part 2 of a print
		System.out.println(" "); //Empty Line
		System.out.println(" "); //Empty Line
		System.out.println(" "); //Empty Line
		System.out.println(" "); //Empty Line
		System.out.print("Next segment is an identical sequence of characters, both using print and println"); //Explanation of following process. 
		System.out.println(" ");//Empty Line
		System.out.print("Printing sequence...|");
		System.out.print("|");
		System.out.print("|");
		System.out.println(" ");
		System.out.println("Printing sequence...|||");
		System.out.print("...Done.");
	}
		
		public static void main(String[] args) {
		
			print(); // calling the method
		}
}