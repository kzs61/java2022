package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDAO implements ProductDAO{
	
	public void add(Product product) {
		
//		SQL queries only
		
		System.out.println("Added to DB using Hibernate");
		
	}

}
