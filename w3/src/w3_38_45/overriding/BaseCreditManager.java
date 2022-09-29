package w3_38_45.overriding;

public class BaseCreditManager {
	
	public double calculate(double amount) { //in order to avoid override this method in any child classes use final keyword
		
		return amount * 1.18;  //1.18 is interest rate
	}

}


//In case you don't want a method to be overriden in any child class use final keyword
//public final double calculate(double amount) {
//calculate method is overriden in StudentCreditManager because the interesr rate is different. 
//If final keyword used for calculate method it wasn't possible to override the calculate method in StudentCreditManager class