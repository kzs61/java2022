package constructors;



//Parameterized constructors. Constructor can also accept one or more parameters.

public class Vehicle {

		  // constructor accepting single value
		  Vehicle(String car) {

		    System.out.println(car + " Sport car");
		  }

		  public static void main(String[] args) {

		    // call constructor by passing a single value
			 // passing the single value to the constructor. Based on the argument passed, the language variable is initialized inside the constructor.
			  Vehicle object1 = new Vehicle("Ferrari");
			  Vehicle object2 = new Vehicle("Lamborghini");
			  Vehicle object4 = new Vehicle("McLaren");
			  Vehicle object3 = new Vehicle("Kartal");
		  }
		}
