package utility;

public class Number {
	
	PrintMessages printMessages = new PrintMessages();
	
	public void findNumber() {

		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int searchNum = 7;
		boolean isInNumbersArr = false;
		for (int search : numbers) {
			if (search == searchNum) {
				isInNumbersArr = true;
				break;
			}
		}
		String message = "";
		if (isInNumbersArr) {

			message = searchNum + " is in numbers array";

			printMessages.printMessage(message);

		} else {
			printMessages.printMessage(searchNum + " is Not in numbers array");

		}
	}

	
	
	
	

}
