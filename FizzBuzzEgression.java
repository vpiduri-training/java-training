public class FizzBuzzEgression {	
	
	public static void main(String[] args) {
		
		FizzBuzzTest();
	}
		
		private static void FizzBuzzTest() {
		
		//initialize array with 100 cells
		int[] sampleArray = new int[100];
		
			// for loop that will increment array one time per loop until 100
			for(int i = 0; i < 100; i++) {
				
				sampleArray[i] = i+1;
				
			/*segment of if conditionals, first set will check 
			if a number is a multiple of 15 using remainder operand, print value*/
			if (sampleArray[i] % 15 == 0) 
				
				System.out.println("FizzBuzz / Value of Number: " + sampleArray[i]);
				
			//second segment will check for a multiple of 3, print value
			else if(sampleArray[i] % 3 == 0)
				
				System.out.println("Fizz / Value of Number: " + sampleArray[i]);
			
			//third segment will check for a multiple of 5, print value
			
			else if(sampleArray[i] % 5 == 0)
				System.out.println("Buzz / Value of Number: " + sampleArray[i]);
			
			//last else will print every number that does not fit within the above, and print that value
			else {
				
				System.out.println(sampleArray[i]);
				
			}
		}
	}
}