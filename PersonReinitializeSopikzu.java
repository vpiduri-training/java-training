
public class PersonReinitializeSopikzu {

	public static void main(String[] args) {
		int[] personIds = new int[] {1001, 1002, 1003, 1004, 1005, 1006, 1007};
		// Making a new object of class PersonSopikzu named Eddy, ID set to 1001, and is male.
		PersonSopikzu person1 = new PersonSopikzu(personIds[0], "Eddy");
		person1.gender = "Male";
		// Making a second object of class PersonSopikzu named Alaric, id set to 1002, and is male.
		PersonSopikzu person2 = new PersonSopikzu(personIds[1], "Alaric");
		person2.gender = "Male";
		// Making a third object of class PersonSopikzu named Maddie, id set to 1003, and is female.
		PersonSopikzu person3 = new PersonSopikzu(personIds[2], "Maddie");
		person3.gender = "Female";
		// Print line of current People within our test case.
		System.out.println("First person is: " + person1.name + ".");
		System.out.println("Second person is: " + person2.name + ".");
		System.out.println("Third person is: " + person3.name + ".");
		// Reinitializing the first object as a new object and invoking updatePerson(Name, ArrayID) to change the value of String Name and position on Array.
		PersonSopikzu person4 = new PersonSopikzu(person1);
		person4.updatePerson("Nick", personIds[3]);
		System.out.println("Fourth person is: " + person4.name + ".");
		// Reinitializing the third object as a new object and invoking updatePerson(Name, ArrayID, Gender) to change every variable entirely since person3 is a Female by reference.
		PersonSopikzu person5 = new PersonSopikzu(person1); // Making a new object instance based upon the values of person1 which will be passed to a copy constructor.
		person5.updatePerson("Preston", personIds[4], "Male"); // Assigning new variables to person5 to reflect Preston, new ID position in Array, and is Male instead of Female.
		System.out.println("Fifth person is: " + person5.name + ", and is: " + person5.gender + "."); // Println for fifth person to reflect the fact the gender has been changed.
		System.out.println("We essentially deep copied the variables of Person3, Maddie, and made that into Person 5,changed the values to reflect Preston, Male, and a new ID#");
		// Reinitializing the second Object as a new deep copied object and invoked Update Person(Name, ArrayID) to change the value of string name and position on Array.
		PersonSopikzu person6 = new PersonSopikzu(person2);
		person6.updatePerson("Thomas", personIds[5]);
		System.out.println("Sixth person is: " + person6.name + ".");
		// Reinitializing the first Object and using it's original values as variables, invoking update Person and changing all variables, then println.
		PersonSopikzu person7 = new PersonSopikzu(person1);
		person7.updatePerson("Megan", personIds[6], "Female");
		System.out.println("Seventh person is: " + person7.name + ".");
		
		// Println statement block for every individual in array to show every value is separate.
		System.out.println("The First person is: " + person1.name + ", the id number is: " + person1.id + ", and their gender is: " + person1.gender + ".");
		System.out.println("The Second person is: " + person2.name + ", the id number is: " + person2.id + ", and their gender is: " + person2.gender + ".");
		System.out.println("The Third person is: " + person3.name + ", the id number is: " + person3.id + ", and their gender is: " + person3.gender + ".");
		System.out.println("The Fourth person is: " + person4.name + ", the id number is: " + person4.id + ", and their gender is: " + person4.gender + ".");
		System.out.println("The Fifth person is: " + person5.name + ", the id number is: " + person5.id + ", and their gender is: " + person5.gender + ".");
		System.out.println("The Sixth person is: " + person6.name + ", the id number is: " + person6.id + ", and their gender is: " + person6.gender + ".");
		System.out.println("The Seventh person is: " + person7.name + ", the id number is: " + person7.id + ", and their gender is: " + person7.gender + ".");
	}
		
}
