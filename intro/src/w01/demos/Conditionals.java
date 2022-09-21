package w01.demos;

public class Conditionals {

	public static void main(String[] args) {

//		int num1 = 24;
		int num1 = 10;
		int num2 = 20;

		if (num1 < 20) {
			System.out.println(num1 + " is less than " + num2);
		} else if (num1 == num2) {
			System.out.println(num1 + " and " + num2 + "are equal");
		} else {
			System.out.println(num1 + " is greater than " + num2);
		}
	}
}
