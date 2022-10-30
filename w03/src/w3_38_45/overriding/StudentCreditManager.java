package w3_38_45.overriding;

public class StudentCreditManager extends BaseCreditManager{
	
	public double calculate(double amount) {
		
		return amount * 1.10;  
// 1.10 is interest rate for student is the requirement. 
// So override the BaseCreditManager class calculate() method here 
// in order to apply 1.1o rate instead of 1.18 rate in the BaseCreditManager calculate method

	}

}
