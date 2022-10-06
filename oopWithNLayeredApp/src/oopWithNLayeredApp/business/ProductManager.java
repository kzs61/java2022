package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.dataAccess.HibernateProductDAO;
import oopWithNLayeredApp.dataAccess.JdbcProductDAO;
import oopWithNLayeredApp.dataAccess.ProductDAO;
import oopWithNLayeredApp.entities.Product;
import oopWithNLayeredApp.shared.logging.Logger;

public class ProductManager {
	
	private ProductDAO productDAO;
	private Logger[] loggers;
	
	
	public ProductManager(ProductDAO productDAO, Logger[] loggers) { //when ProductManager object created with new keyword give a productDAO object
	                                              //ProductDAO is the signature of add method in ProductDAO class. Same signature
		this.productDAO = productDAO;
		this.loggers = loggers;
	}


	public void add(Product product) throws Exception { 
//		business logic
		
		if(product.getUnitPrice()<10) {
			throw new Exception("Product price can not be less than 10");
			
		}

		productDAO.add(product);	
		
		for(Logger logger : loggers) { //[db, mail] 
			logger.log(product.getName());
		}

		
//		When a lyer using another lyer's class must access through it's Interface only
//		Loosely coupled. I can pass either JdbcProductDAO or HibernateProductDAO
	
		
	}

}
