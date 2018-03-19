  class BasicsDemoPrimitiveEgression {
    // Adapted from http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html
    static void print() {
      System.out.println("\n\nInside print ...");
      System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
      System.out.println();                 // Print empty line
      System.out.print("Hello, world!!");   // Cursor stayed after the printed string
      System.out.println("Hello,");
      System.out.print(" ");                // Print a space
      System.out.print("world!!");
    }

	static void primitives() {
	  System.out.println("\n\nInside primitives ...");
	  // literals demo
	  int intHex = 0x0044; // hex value for 68
	  System.out.println("intHex: " + intHex); //prints intHex
	  int intBinary = 0b01000100; //binary value for 68
	  System.out.println("intBinary: " + intBinary); //prints intChar
	  int intChar = 'D'; // holds decimal equivalent, which is 68
	  System.out.println("intChar: " + intChar); //prints intChar

	  char charD = 'D';
	  System.out.println("charD: " + charD);
	  char charInt = 68; //integer value of character D
	  System.out.println("charInt: " + charInt);
	  char charUnicode1 = '\u0044'; //unicode value of character DD
	  System.out.println("charUnicode1: " + charUnicode1);
	  char charUnicode2 = 0x44; //alternate unicode value of D
	  System.out.println("charUnicode2: " + charUnicode2);
	  char charBinary = 0b01000100; // binary corresponding to character D
	  System.out.println("charBinary: " + charBinary);
    }

    public static void main(String[] args) {
	  //print();
	  primitives();
    }
  }
