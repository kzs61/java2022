package constructors;

class City {
	  private String city;

	  
	  City() { // constructor created. 

	    System.out.println("Constructor Called:");
	    city = "Izmir"; //Inside the constructor city variable initialized.
	  }

	  public static void main(String[] args) {

//	    constructor is invoked while creating an object of the Main class
//		when the object is created, the City() constructor is called. And, the value of the name variable is initialized.
	    City obj = new City();
	    
	    System.out.println("The city is " + obj.city);
	  }
	  
	  
	  
	  
	

	  
	  
	}


