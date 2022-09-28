package w02_25_37.recap_classes;

public class Main {

	public static void main(String[] args) {

		AritmaticOperations aritmaticOperations = new AritmaticOperations();

		int sum = aritmaticOperations.Addition(3, 5);
		System.out.println(sum);

		
		int differance = aritmaticOperations.Subtraction(8, 2);
		System.out.println(differance);

		
		int product = aritmaticOperations.Multiplication(1, 4);
		System.out.println(product);

		
		int quotient = aritmaticOperations.Division(4, 2);
		System.out.println(quotient);

	}

}
