package w01.day01;

public class SearchArrayNumber {

	public static void main(String[] args) {

		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
//		int searchNum = 5;
		int searchNum = 8;
		boolean isInNumbersArr = false;
		for (int search : numbers) {
			if (search == searchNum) {
				isInNumbersArr = true;
				break;
			}
		}
		if (isInNumbersArr) {
			System.out.println(searchNum + " is found in numbers array");
		} else {
			System.out.println(searchNum + " is Not found in numbers array");
		}
	}
}