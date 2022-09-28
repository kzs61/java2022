package constructors;

class Student {

	// instance variables
	String name;
	int id;
	String major;

	// parameterized java constructor
	Student(int id, String name, String major) {
		this.name = name;
		this.id = id;
		this.major = major;
	}

	public static void main(String[] args) {

		// create new object of type student and provide arguments
		Student object = new Student(1157, "Lale", "Computer Science");

		System.out.println("Id: " + object.id);
		System.out.println("Name: " + object.name);
		System.out.println("Major: " + object.major);

	}
}