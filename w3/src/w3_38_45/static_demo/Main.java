package w3_38_45.static_demo;

import java.lang.reflect.Method;

public class Main {
	
	//static methods generally used in utility classes
	
	public static void main(String[] args) {
		
		ProductManager manager = new ProductManager();
		
//		instantiate the Product class and create an eligible product to add db
		Product product = new Product();
		product.price = 44.99;
		product.name = "Webcam"; 
		
		manager.add(product);
		
		
		Product product1 = new Product();
		product.price = 15;
		product.name = ""; 
		
		manager.add(product1);
		
		
//		Call the DatabaseHelper class static methods:
		DatabaseHelper.Crud.create();
		DatabaseHelper.Crud.read();
		DatabaseHelper.Crud.update();
		DatabaseHelper.Crud.delete();
		
		
		
//		Call the DatabaseHelper's nested/inner class DBConnection methods:
//		Note: do not use nested classes. Create separate class for each task. Single responsibility principle of SOLID.
//		One class for CRUD one class for DBConnection. 
		DatabaseHelper.DBConnection.createConnection();
		
		
		
	}



}
