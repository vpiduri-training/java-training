  class BasicsDemoIntRobertZizo {
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
    }

    public static void main(String[] args) {
	  primitives();
    }
  }
