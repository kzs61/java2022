package w01.day01;

public class PerfectNumbers {

	/*
	 * In number theory, a perfect number is a positive integer that is equal to the
	 * sum of its positive divisors, excluding the number itself. For instance, 6
	 * has divisors 1, 2 and 3 (excluding itself), and 1 + 2 + 3 = 6, so 6 is a
	 * perfect number.
	 * 
	 * 28= 1+2+4+7+14
	 */

	public static void main(String[] args) {

		int number = 6;
		int total = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}
		if (total == number) {
			System.out.println(number + " is a perfect number");
		} else {
			System.out.println(number + " is not a perfect number");
		}
	}
}