package w01.demos;

public class SwichCase {

	public static void main(String[] args) {

//	       Student grades

		char grade = 'G';

		switch (grade) {
		case 'A':
			System.out.println("Perfect, you pass! Your grade is: " + grade);
			break;
		case 'B':
		case 'C':
			System.out.println("Well done, you pass! Your grade is: " + grade);
			break;
		case 'D':
			System.out.println("You could do better! You pass! Your grade is: " + grade);
			break;
		case 'F':
			System.out.println("Fail! Your grade is: " + grade);
			break;
		default:
			System.out.println("Unrecognized grade. You entered " + grade);

		}
	}
}
