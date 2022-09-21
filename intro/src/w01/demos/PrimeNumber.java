package w01.demos;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int number = 97;

		boolean isPrime = true;

		if (number == 1) {
			System.out.println(number + " is not a prime number");
			return;
		}
		if (number <= 0) {
			System.out.println("Enter a number greater than 0");
			return;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}
	}

}