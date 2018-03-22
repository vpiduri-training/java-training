
public class FizzBuzzSopikzu {

	public static void main(String[] args) {
		// Making an array with length of 100.
		int[] myArray = new int[100];
		/*
		 *  Starting the logic loop to make many iterations of increasing increment
		 *  that will tell us if numbers are multiples of 5 and 3, or if they are
		 *  just multiples of 3 or multiples 5 singularly, Has a block at the end to make sure 
		 */
	
		for (int i = 1; i < 101; i++) {
			if (i < 99 ) {
				/*
				 * Here we have a block that basically has the logic flow of 
				 * If it's Fizzbuzz first, Print it out, and add a value to the 
				 * array variable i, and to continue back through for more interations,
				 * otherwise, to continue to the next else if, which checks to see if
				 * it's a multiple of 3, and if it is, print's it out, and adds one more value
				 * to the array variable i, and to continue back through the original if statement,
				 * otherwise, to continue to the next else if, etc etc.
				 */
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " FizzBuzz");
					myArray[i] = i + 1;
				} else if (i % 3 == 0) {
					System.out.println(i + " fizz");
					myArray[i] = i + 1;
				} else if (i % 5 == 0) {
					System.out.println(i + " buzz");
					myArray[i] = i + 1;
				} else {
					System.out.println(i);
					myArray[i] = i + 1;
				}
				/*
				 *  Here we have a block of code to catch any errors
				 *  that could be thrown from the original statement for increasing
				 *  the original array index too much. Basically, a catch error Block of code!
				 */
			} else if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println(i + " fizz");
			} else if (i % 5 == 0) {
				System.out.println(i + " buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}