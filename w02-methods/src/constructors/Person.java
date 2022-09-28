package constructors;

//creating class named Person
class Person{
	// creating instance variables
	int number;
	String name;
	Person(){
		System.out.println("This is default constructor!");
	}


	// Java main method
	public static void main(String[] args){
		// Creating new object of type person
		Person object = new Person();
		// Printing the default values of the instance variables
		System.out.println(object.name);
		System.out.println(object.number);
}
}