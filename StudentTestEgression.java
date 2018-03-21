class StudentTestEgression {
	
	public static void main(String[] args) {
		// Initializing student variables inside of the main method for quick understanding of variables within this class

		
		//Testing code, line 10 for a filled array, line 11 for a null array.
		//int[] studentIds = new int[] { 1001, 1002, 1003 };
		int[] studentIds = null;
		
		/*if conditional; if the studentId array is NOT empty, updateReferences method will execute
		else, emptyArrayException will be thrown, print a line explaining the problem.*/
		if (studentIds != null) {
			updateReferences(studentIds);
			}else{
				//Calling a separate method that will throw a println instead of a compilation error.
				emptyArrayException();
			}
			
		}

	static void updateReferences(int[] studentIds) {
		// Assigning values and object initializations to the students
		Student student1 = null;
		student1 = new Student(studentIds[0], "joan");
		student1.gender = "male";
		
		Student student2 = null;
		student2 = new Student(studentIds[1], "raj");
		student2.gender = "male";
		
		Student student3 = null;
		 //if conditional; will only execute if the length of the array is equal to 4.
		if (studentIds.length == 4) {
			student3 = new Student(studentIds[4], "anita");
			student3.gender = "female";
			}

		// Print statements
		System.out.println("Name of student1: " + student1.name);

		System.out.println("Name of student2: " + student2.name);
		// If conditional that will only print student3 if the value is not null.
		if (student3 != null) {
		System.out.println("Name of student3: " + student3.name);
			}
		}
	
		private static void emptyArrayException() {
			
			//Method that will print a error message that will state the array being empty.
			System.out.println("Array is currently empty and will return no values.");
			System.out.println("If you are seeing this message after ");
			System.out.println("nulling the array, it is working correctly.");
		}


	}


