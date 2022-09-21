package w01.demos;

public class Loops {

	public static void main(String[] args) {

		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}

		System.out.println("End of for loop\n");

		int i = 2;

		while (i <= 10) {
			System.out.println(i);
			i += 2;
		}

		System.out.println("End of while loop\n");

//		at least runs once even if it does not meet the condition otherwise do-while loop is same as while loop
//		real life example: used to create a log that do-while called
		int j = 100;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);

		System.out.println("End of do-while loop\n");
	}
}

//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/index.html
