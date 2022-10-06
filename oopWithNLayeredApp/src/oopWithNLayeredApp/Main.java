package oopWithNLayeredApp;

import java.util.List;

import javax.swing.event.TreeWillExpandListener;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.dataAccess.HibernateProductDAO;
import oopWithNLayeredApp.dataAccess.JdbcProductDAO;
import oopWithNLayeredApp.entities.Product;
import oopWithNLayeredApp.shared.logging.DatabaseLogger;
import oopWithNLayeredApp.shared.logging.FileLogger;
import oopWithNLayeredApp.shared.logging.Logger;
import oopWithNLayeredApp.shared.logging.MailLogger;

public class Main {

	public static void main(String[] args) throws Exception {
	
		Product product1 = new Product(1, "iPhone 35", 10000); //data comes from ui
		
		//any product price entered in the ui that less than 10 will throw exception -> Product price can not be less than 11
//		Product product1 = new Product(1, "iPhone 35", 9); 
		
//		pass the data (product1) comes from the ui to ProductManager class add method
//		ProductManager productManager = new ProductManager(new JdbcProductDAO()); //I can passJdbc or Hibernate
//		ProductManager productManager = new ProductManager(new HibernateProductDAO());
//		productManager.add(product1);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		ProductManager productManager = new ProductManager(new HibernateProductDAO(), loggers);
		
		
		productManager.add(product1);

	}

}

//entities: database objects