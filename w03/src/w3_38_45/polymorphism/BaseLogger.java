package w3_38_45.polymorphism;

public class BaseLogger {

//	you can use this method inside DatabaseLogger, FileLogger and EmailLogger classes. That will be override
	public void log(String message) {

		System.out.println("Default logger : " + message);

	}

}
