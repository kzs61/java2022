package w3_38_45.static_demo;



//this class will be used to validate the product to record, update etc..

public class ProductValidator {
	
	
//	Note: If there was a constructor in ProductValidator class, in order to make the constructor executed 
//	you must instantiate that class with new keyword.  Instantiate below constructor in ProductManager class
	public ProductValidator() {
		System.out.println("Constructor executed");
	}
	
	
//	define a static block:
	static {
		System.out.println("Static block executed");
	}
	
//	you can have more than 1 static blocks. It's not used commonly.
	
	static {
		System.out.println("Static block executed - 1");
	}
	
	static {
		System.out.println("Static block executed - 2");
	}
	
	

//	public boolean isValid(Product product) {
	
	public static boolean isValid(Product product) {

		if (product.price > 0 && !product.name.isEmpty()) { // validates that product price is higher than 0 and has
															// name
			return true;
		} else {
			return false;

		}
	}
	

//	this method can not be called by the class name in another class as it is not a static method.
//	We need to instantiate the class with the new keyword and call the non static method.
// try to call it in ProductManager class as ProductValidator.something()
	
	public void something() {
		
	}
	
	
	
	
	
	
	
//	Note:
//	You can not make the Outer class static but can make the inner/nested class static.
	
//	When you can use innser/nested class. Lets say you like to organize tasks. 
//	example:
	
//public static class AnInnerClass {
//		
//		public static void delete() {
//			
//		}
		
//}

	
}




