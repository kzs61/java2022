package w3_38_45.static_demo;

public class DatabaseHelper {

	public static class Crud {

		public static void create() {

		}

		public static void read() {

		}

		public static void update() {

		}

		public static void delete() {

		}

	}

//	nested class
	
//	best practice use Single Responsibility rule (SOLID principles).
//	The Single Responsibility Principle states that a class should do one thing and 
//	therefore it should have only a single reason to change.
	
//	Instead of nested class use separate classes for CrudDatabaseHelper and DBConnectionHelper classes.


	public static class DBConnection {

		public static void createConnection() {

		}
	}

}
