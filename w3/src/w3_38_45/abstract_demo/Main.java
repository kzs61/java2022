package w3_38_45.abstract_demo;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		
//		customerManager.databaseManager = new OracleDatabaseManager();   
//		customerManager.databaseManager = new SqlServerDatabaseManager(); 
		customerManager.databaseManager = new MySqlDatabaseManager(); 
		
		
		customerManager.getCustomers(); // returns us the customer data from the database we define above
		
												// Data pulled : Oracle  or  Data pulled : SqlServer or Data pulled : MySqlServer
	
	}

}
