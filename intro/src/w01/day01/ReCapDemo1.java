package w01.day01;

public class ReCapDemo1 {

	public static void main(String[] args) {
//		finding the greatest number
		
		int num1 = 266;
		int num2 = 25;
		int num3 = 999;
		
		int largest = num1;

		if (largest < num2) {
			largest = num2;
		}

		if (largest < num3) {
			largest = num3;
		}

		System.out.println("Largest number: " + largest);
	}
}

