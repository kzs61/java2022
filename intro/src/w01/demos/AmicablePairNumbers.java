package w01.demos;

public class AmicablePairNumbers {
	/*
	 * An amicable pair (m,n) consists of two integers m,n for which the sum of proper divisors 
	 * (the divisors excluding the number itself) of one number equals the other. 
	 * Amicable pairs are occasionally called friendly pairs, although this nomenclature is to be discouraged since 
	 * the numbers more commonly known as friendly pairs are defined by a different, albeit related, criterion. 
	 * Some amicable pair numbers "220, 284", "1184, 1210", "2620, 2924", "5020, 5564", "6232, 6368", "10744, 10856"
	 * Sum of proper divisors of 220 = 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284 
	 * Sum of proper divisors of 284 = 1 + 2 + 4 + 71 + 142 = 220
	 */

	public static void main(String[] args) {

		int num1 = 220;
		int num2 = 284;
		int total1 = 0;
		int total2 = 0;

		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0) {
				total1 = total1 + i;
			}
		}
		for (int i = 1; i < num2; i++) {
			if (num2 % i == 0) {
				total2 = total2 + i;
			}
		}
		if (total1 == num2 && total2 == num1) {
			System.out.println(num1 + " and " + num2 + " are Amicable numbers!");
		} else {
			System.out.println(num1 + " and " + num2 + " are NOT Amicable numbers!");
		}
	}
}