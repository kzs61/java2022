package w01.demos;

public class ArraysRecapDemo2 {

	public static void main(String[] args) {

		double[] myList = { 1.2, 6.3, 4.3, 5.6 }; // this is same as creating array with new keyword
		double total = 0;
		double max = myList[0];
		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Total = " + total);
		System.out.println("Max number = " + max);
	}
}