package w3_38_45.polymorphism;

public class Main {

	public static void main(String[] args) {

//		EmailLogger logger = new EmailLogger();
//		logger.Log("Log message");
		
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
//		because of all logger classes extend BaseLogger class in fact all these logger classes are BaseLogger type
//		Their parent is BaseLogger. They all point the same location in the heap memory because of inheritance.
//		therefore, no complain in above code.
//		We won't get error like int[] numbers = new int[]{1,2,3,"four"} //can not have String in int array.
		
//		all these three loggers do different job but infact they ara all BaseLogger. The reason they can do different job
//		is because of overriding.
		
		
//		for(FileLogger logger:loggers) { this will not work because child class cannot hold parent class (BaseLogger) 
//		Parent can not inherit from child.
			
//		When another logger needed, you can create a logger class (ie. ConsoleLogger) extend it to BaseLogger, create overriding method and add here.
//		Called plug and play.
		
//		This is polymorphism and besides achieved with inheritance also achieved with Interface. 
			
		
		
//		for(BaseLogger logger:loggers) {
//			logger.log("Log message");
////			output:
////			Log to File :Log message
////			Log to Email :Log message
////			Log to Database :Log message
////			Log to Console :Log message
//			
//		}
		
		
		
//		CustometManager custometManager = new CustometManager(new DatabaseLogger());
		CustometManager custometManager = new CustometManager(new FileLogger());
		custometManager.add();
	}

}
