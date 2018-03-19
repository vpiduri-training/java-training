
public class PersonSopikzu {
	int id;
	String name;
	String gender = "male";
	/*
	 * I am unsure why it is common practice to immediately assign a gender here to
	 * the value instead of assigning it as within our constructors.
	 */

	PersonSopikzu(int id, String name) {
		this(name); // Calls overloaded Constructor to invoke statement to
		this.id = id; // Whatever the operator assigns variables to will return for individual users
						// from Array later on.
	}

	// This next line is a constructor that returns the value of name to our class
	// variable.
	PersonSopikzu(String name) {
		this.name = name;
	}
	// This next statement is a copy constructor for our person object instances that invokes the other constructors.
	PersonSopikzu(String name, int id, String gender) {
		this.name = name;
		this.id = id;
		this.gender = gender;
	}
	public PersonSopikzu(PersonSopikzu original) {
		this(original.name , original.id , original.gender);
	}

	// This next line is a constructor for the variable of just name with a return condition of True.
	boolean updatePerson(String name) {
		this.name = name;
		return true;
	}
	// This next line is an overloaded constructor for the variables String name and int id.
	boolean updatePerson(String name, int id) {
		this.name = name;
		this.id = id;
		return true;
	}
	// This next line is an overloaded constructor as well and uses all of our local class variables.
	boolean updatePerson(String name, int id, String gender) {
		this.name = name;
		this.id = id;
		this.gender = gender;
		return true;
	}

}
