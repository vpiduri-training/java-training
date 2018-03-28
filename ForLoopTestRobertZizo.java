
public class ForLoopTestRobertZizo {

	public static void main(String[] args) {
		String numbers[] = new String[101];
		for (int i = 0; i < 101; i++) {
			if (i % 3 == 0 && i % 5 == 0 && i != 0) {
				System.out.print("FizzBuzz, ");
				numbers[i] = "FizzBuzz";
			} else if (i % 3 == 0 && i != 0) {
				System.out.print("Fizz, ");
				numbers[i] = "Fizz";
			} else if (i % 5 == 0 && i != 0 && i == 100) {
				System.out.print("Buzz");
				numbers[i] = "Buzz";
			} else if (i % 5 == 0 && i != 0 && i != 100) {
				System.out.print("Buzz, ");
				numbers[i] = "Buzz";
			} else if (i < 101) {
				System.out.print(i + ", ");
				numbers[i] = (i + 1) + "";
			}
		}
		System.out.println(" ");
		if (numbers.length == 101) {
			System.out.println("Last Element in the Array is: " + numbers[100]);
		}
	}
}
