package w3_38_45.interfaces;

import java.security.spec.PSSParameterSpec;

import w3_38_45.polymorphism.CustometManager;

public class Main {

	public static void main(String[] args) {
		
		ICustomerDal customerDal = new OracleCustomerDal(); // interface can hold the data of the class that implements it
		                                                     // OracleCustometDal implements ICustomerDal interface
														     // therefore object of customerDal can hold OracleCustomerDal's reference.
		
		
		
//		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
//		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		CustomerManager customerManager = new CustomerManager(new PostgreSQLCustomerDal());

		customerManager.add(); // Added to PostgreSQL DB, Added to MySql DB,  Added to Oracle DB
	
	}

}

/**


https://web.mit.edu/6.005/www/fa15/classes/14-interfaces/
Generally implements used for implementing an interface and extends used for extension of base class behaviour or abstract class.
extends: A derived class can extend a base class. You may redefine the behaviour of an established relation. Derived class "is a" base class type
implements: You are implementing a contract. The class implementing the interface "has a" capability.
With java 8 release, interface can have default methods in interface, which provides implementation in interface itself.
https://www.javatpoint.com/interface-in-java
https://techvidvan.com/tutorials/java-extends-vs-implements/
https://www.baeldung.com/java-implements-vs-extends
https://data-flair.training/blogs/java-extends-vs-implements/
*/
