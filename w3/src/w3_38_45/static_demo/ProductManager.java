package w3_38_45.static_demo;

import java.lang.reflect.Constructor;

import javax.swing.text.ChangedCharSetException;
import javax.swing.tree.AbstractLayoutCache;

// ProductManager class records the product to db if product validation is true

public class ProductManager {
	
	public void add(Product product) {
		
		//at first used to ProductValidator by instantiating the class (see below commented out whole code) but, 
//		Product validator can also be used by making the isValid() method as a static method in ProductValidator class
//		this way you can call isVAlid methow with Class name ProductValidator. No need to instantiate the class with new
//		just make the methods "static" inside the class ProductValidator class
//		use static methods in utility classes.
		
//		when we instantiate a class with "new" keyword the object of the class will be deleted from the memory when
//		the use of the object is done. However, when we use the method without instantiating the class and define its methods as static
//		they will not be deleted until the application stops (like web application)
//		This means when the object created first time by a user rest of the user will use the same object until the app stops.
//		Manager classses shouldn't be static but you can call static methods from other classes as below.
//		Finally, when we define a static method the method can be called by its Class name. No need to instantiate its class with new keyword.
		
//		calling non static method will make the compiler complain.
//		AbstractLayoutCache wilLayoutCache get sugesstion as:
//			1. Change something() to static
//			2. Create a new instance of ProductValidator class
//		ProductValidator.something()
		
//		ProductValidator productValidator = new ProductValidator();
//		productValidator.something();
		
		
		
		if(ProductValidator.isValid(product)) {
			
			System.out.println("Product is eligible and recorded/added to the database");
			
		}else {
			
			System.out.println("Product is NOT eligible and rejected to be recorded/added to the database");
			
		}
	
		
//		Note: If there was a constructor in ProductValidator class, in order to make the constructor executed 
//		you must instantiate that class with new keyword. 
		
//		ProductValidator productValidator = new ProductValidator();
//		productValidator.something(); 
//		as a result I can call the non static method since the class is instantiated.
		
//		Constructor willConstructor print: Constructor executed
		
//		NOTE:
//		If there is static block in the class Static blocks can also be executed without instantiating the class:
		//Static block executed
		
		
	}

}





/*

public class ProductManager {
	
	public void add(Product product) {
		
		ProductValidator productValidator = new ProductValidator(); 
		
		if(productValidator.isValid(product)) {
			
			System.out.println("Product is eligible and recorded/added to the database");
			
		}else {
			
			System.out.println("Product is NOT eligible and rejected to be recorded/added to the database");
			
		}
		
		
	}

}

*/
