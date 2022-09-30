package w3_38_45.abstract_demo;

public class CustomerManager {
	
//	use strategy pattern
	BaseDatabaseManager databaseManager; 
//	BaseDatabaseManager class is parent of OracleDatabaseManager, SqlserverDatabaseManager and MySqlServerDatabaseManager classes,
//	So, object of DatabaseManager "databaseManager" can hold/point of its all the child classes.
//	Whichever child class we hold that class' getData() method will run/pull data from that database (See Main class)
	
	
	public void getCustomers() {
	
		databaseManager.getData();
	
	}

}
