
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

	static void typeCasting() {
		
		System.out.println("\nInside typeCasting ...");
		// Explicit casting
		long y = 42;
		// int x = y;
		int x = (int) y;

		// Information loss due to out-of-range assignment
		byte narrowdByte = (byte) 123456;
		System.out.println("narrowdByte: " + narrowdByte);

		// Truncation
		int iTruncated = (int) 0.99;
		System.out.println("iTruncated: " + iTruncated);

		// Implicit cast (int to long)
		y = x;

		// Implicit cast (char to int)
		char cChar = 'A';
		int iInt = cChar;
		System.out.println("iInt: " + iInt);

		// byte to char using an explicit cast
		byte bByte = 65;
		cChar = (char) bByte; // special conversion (widening from byte --> int followed by narrowing from int
								// --> char)
		System.out.println("cChar: " + cChar);
	}

	public static void main(String[] args) {
		// Language Basics 1
		// print();
		primitives();
	}
}
