class StudentTestSopikzu {

	static void updateReferences(int[] studentIds) {
		/* Initializing variables student 1-3 and equating to null
		 * so that we can initialize it later on in the code.
		 */
		Student student1 = null;
		Student student2 = null;
		Student student3 = null;
		// Here we assigned values to our first two students, Joan and Raj.
		student1 = new Student(studentIds[0], "joan");
		student1.gender = "male";

		student2 = new Student(studentIds[1], "raj");
		student2.gender = "male";



		/*
		 * Here in this block exactly, we have an If statement that says If our length is equal to 4, we call
		 * the student3 object instance and Reinitialize with variables to the object, but since the Length is
		 * not equal to 4, This code section will not run UNTIL that condition is met.
		 */
		if (studentIds.length == 4) {
			student3 = new Student(studentIds[4], "anita");
			student3.gender = "female";
			}

		// Here in this block we have a basic print statement for the users
		System.out.println("Name of student1: " + student1.name);

		System.out.println("Name of student2: " + student2.name);
		// This next section is a if condition that states if student3 is not equal to null, than go ahead and print it out.
		if (student3 != null) {
		System.out.println("Name of student3: " + student3.name);
		}
		// Update student1's name from joan to john by invoking updateProfile method
		student1.updateProfile("john");
		System.out.println("Updated name of student1: " + student1.name);
	}

	public static void main(String[] args) {
		int[] studentIds = new int[] { 1001, 1002, 1003 };
		// int[] studentIds = null;
		// This next line puts an If condition on our method entirely stating that if the Id
		// Array is not null, than invoke the updateReferences method.
		if (studentIds != null) {
			updateReferences(studentIds);
		}
	}

}