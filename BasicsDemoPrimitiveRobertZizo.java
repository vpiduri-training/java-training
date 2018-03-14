  class BasicsDemoPrimitiveRobertZizo {
 
	static void primitives() {
		System.out.println("\n\nInside primitives ...");
		  // literals demo
		  int intHex = 0x0045;
		  System.out.println("intHex: " + intHex);
		  int intBinary = 0b01000101;
		  System.out.println("intBinary: " + intBinary);
		  int intChar = 'E'; // holds decimal equivalent, which is 65
		  System.out.println("intChar: " + intChar);
		  int intUnderscore = 6_9;
		  System.out.println("intUnderscore: " + intUnderscore);

	  char charA = 'E';
	  System.out.println("charA: " + charA);
	  char charInt = 69;
	  System.out.println("charInt: " + charInt);
	  char charUnicode1 = '\u0045'; // 4 * (16 power 1 )+ 1 * (16 power 0)
	  System.out.println("charUnicode1: " + charUnicode1);
	  char charUnicode2 = 0x45;     // 4 * (16 power 1 )+ 1 * (16 power 0)
	  System.out.println("charUnicode2: " + charUnicode2);
	  char charBinary = 0b01000101; // binary corresponding to decimal 65
	  System.out.println("charBinary: " + charBinary);
    }

    public static void main(String[] args) {
	  // Language Basics 1
	  //print();
	  primitives();
    }
  }
