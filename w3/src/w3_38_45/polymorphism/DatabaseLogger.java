package w3_38_45.polymorphism;

public class DatabaseLogger extends BaseLogger {

	public void log(String message) { //overriding. using the same method with same signature from BaseLogger class

		System.out.println("Log to Database :" + message);

	}

}
