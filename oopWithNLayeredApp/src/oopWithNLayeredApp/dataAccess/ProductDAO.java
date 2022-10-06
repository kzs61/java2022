package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

// All alternatives related to ProductDAO (JdbcProductDAO and HibernateProductDAO
//method and signature must be same as in those related classes. 

public interface ProductDAO {

	void add(Product product); // interface can only have method signature

}
