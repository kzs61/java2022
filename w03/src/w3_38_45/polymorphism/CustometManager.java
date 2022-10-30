package w3_38_45.polymorphism;

public class CustometManager {
	
	private BaseLogger logger; //create a baseLogger field in BaseLogger kind
	
	public CustometManager(BaseLogger logger) {
		this.logger = logger;
	}
	
	public void add() {
		
		System.out.println("Customer added");
		this.logger.log("Log message");
		
		
	}

}
