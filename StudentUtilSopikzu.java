public class StudentUtilSopikzu {
	static int[] studentIDList = new int[] { 1001, 1002 };
	static char[][] studentsGrades = new char[][] { { 'A', 'A', 'A', 'B' }, 
												   { 'A', 'B', 'B' },
												 };

	public static void main(String[] args) {
		
		int[] x = getStudentsByGPA(3.2, 3.5, studentIDList, studentsGrades);
		for (int i : x) {
			System.out.println(i);
		}
	}

	public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
		double[] gpaCalculated = new double[studentIdList.length];
		for (int i = 0; i < studentsGrades.length; i++) {
			char[] grades = studentsGrades[i];
			double sumValue = 0;
			for (char grade : grades) {
				switch (grade) {
				case 'A':
					sumValue += 4;
					break;
				case 'B':
					sumValue += 3;
					break;
				case 'C':
					sumValue += 2;
					break;
				default:
					System.out.println("Not expected Value.");
					break;
				}
			}
			gpaCalculated[i] = sumValue / grades.length;
		}
		return gpaCalculated;
	}

	public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
		if (lower > higher 
				|| studentIdList == null 
				|| studentsGrades == null 
				|| lower < 0 
				|| higher < 0) {
			return null;
		}
		double[] gpaArray = calculateGPA(studentIdList, studentsGrades);
		int filtStudentSize = 0;
		for (int c = 0; c < gpaArray.length; c++) {
			// Develop logic for higher and lower variables
			if (gpaArray[c] < higher && gpaArray[c] > lower) {
				filtStudentSize++;
			}
		}
		int filteredStudents[] = new int[filtStudentSize];
		int filtStudentIndex = 0;
		for (int c = 0; c < gpaArray.length; c++) {
			if (gpaArray[c] < higher && gpaArray[c] > lower) {
				filteredStudents[filtStudentIndex] = studentIDList[c];
				filtStudentIndex++;
			}
		}
		return filteredStudents;
	}

}