
public class BasicsDemoPrimitiveSopikzu {
	
	static void print() {
		System.out.println("\n\nInside print ...");
		System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
		System.out.println(); // Print empty line
		System.out.print("Hello, world!!"); // Cursor stayed after the printed string
		System.out.println("Hello,");
		System.out.print(" "); // Print a space
		System.out.print("world!!");
	}

	static void primitives() {
		System.out.println("\n\nInside primitives ...");
		// literals demo
		int intHex = 0x0042;
		System.out.println("intHex: " + intHex); // Print statement to print out hex code in Integer format.
		int intBinary = 0b1000010; // Holds binary equivalent of 66.
		System.out.println("intBinary: " + intBinary); // Print statement to print out Binary code and convert to
														// integer
		int intChar = 'B'; // holds integer equivalent of B, which is 66.
		System.out.println("intChar: " + intChar); // Print statement for Char value to integer.
		int intUnderscore = 6_6; // Underscore value for 66.
		System.out.println("intUnderscore: " + intUnderscore); // Print statement for Underscore value converted to Int.
		
		char charB = 'B';
		System.out.println("charB: " + charB);
		char charInt = 66;
		System.out.println("charInt: " + charInt);
		char charUnicode1 = '\u0042'; 
		System.out.println("charUnicode1: " + charUnicode1);
		char charUnicode2 = 0x42;     
		System.out.println("charUnicode2: " + charUnicode2);
		char charBinary = 0b1000010; // binary corresponding to decimal 66
		System.out.println("charBinary: " + charBinary);
	    }

	public static void main(String[] args) {
		// Language Basics 1
		// print();
		primitives();
	}
}
