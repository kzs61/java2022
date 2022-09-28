package w02_25_34.classes_with_attributes;

public class ProductManager {

	public void Add(Product product) {

//		JDBC / Java Database Connectivity: standard Java API for database-independent connectivity between the Java programming language and a wide range of databases.
//	    https://docs.oracle.com/javase/tutorial/jdbc/basics/index.html

		System.out.println("Product added: " + product.getName());

	}

	public void add(int id, String name, String description, int inventory, double price) {

	}

}
