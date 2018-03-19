  class BasicsDemoTypeCastEgression {
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
	  int intHex = 0x0041;
	  System.out.println("intHex: " + intHex);
	  int intBinary = 0b01000001;
	  System.out.println("intBinary: " + intBinary);
	  int intChar = 'A'; // holds decimal equivalent, which is 65
	  System.out.println("intChar: " + intChar);
	  int intUnderscore = 1_23_456;
	  System.out.println("intUnderscore: " + intUnderscore);

	  char charA = 'A';
	  System.out.println("charA: " + charA);
	  char charInt = 65;
	  System.out.println("charInt: " + charInt);
	  char charUnicode1 = '\u0041'; // 4 * (16 power 1 )+ 1 * (16 power 0)
	  System.out.println("charUnicode1: " + charUnicode1);
	  char charUnicode2 = 0x41;     // 4 * (16 power 1 )+ 1 * (16 power 0)
	  System.out.println("charUnicode2: " + charUnicode2);
	  char charBinary = 0b01000001; // binary corresponding to decimal 65
	  System.out.println("charBinary: " + charBinary);
    }

    static void typeCasting() {
      System.out.println("\nInside typeCasting ...");
      // Explicit casting
      long y = 68;
      //int x = y;
      int x = (int)y;

      // Information loss due to out-of-range assignment    
      //in this particular case, overflows past +127, going into negatives and counting up
      byte narrowdByte = (byte)160;	
	  System.out.println("An overflowed byte integer: " + narrowdByte);

	  // Truncating 
	  int iTruncated = (int)67.99; //removes decimal places. This does not round down, but rather removes the decimals from the value entirely
	  System.out.println("Truncated integer: " + iTruncated);

	  // Implicit cast (char to int)
	  char cChar = 'D';  //set cChar as char datatype
	  int iInt = cChar; //converts char datatype to int
	  System.out.println("iInt: " + iInt);

	  // byte to char using an explicit cast
	  byte bByte = 68;
	  cChar = (char)bByte; //converting byte value into char value 
	  System.out.println("cChar: " + cChar);
    }

	public static void main(String[] args) {
	  // Language Basics 1
	  //print();
	  //primitives();
	  typeCasting();
    }
  }
