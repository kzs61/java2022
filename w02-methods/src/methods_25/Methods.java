package methods_25;

public class Methods {

//	stand alone

	public static void main(String[] args) {

		findNumber();

	}

	public static void findNumber() {

		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };

		int searchNum = 8;
		boolean isInNumbersArr = false;
		for (int search : numbers) {
			if (search == searchNum) {
				isInNumbersArr = true;
				break;
			}
		}
		String message = "";
		if (isInNumbersArr) {

			message = searchNum + " is found in numbers array";

			printMessage(message);

		} else {
			printMessage(searchNum + " is Not found in numbers array");

		}
	}

	public static void printMessage(String message) {

		System.out.println(message);
	}

}
