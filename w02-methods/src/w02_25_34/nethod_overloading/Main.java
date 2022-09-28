package w02_25_34.nethod_overloading;

public class Main {

	public static void main(String[] args) {

		AritmeticOperators aritmeticOperators = new AritmeticOperators();

		System.out.println(aritmeticOperators.addition(3, 5)); // calls the addition method that requires two int													// parameters

		System.out.println(aritmeticOperators.addition(3, 5, 7)); // calls the addition method that requires three int
																	// parameters
		
		System.out.println(aritmeticOperators.addition(3.5, 5.9, 7.4, 2.1)); // calls the addition method that requires
																				// four double parameters

	}

}
