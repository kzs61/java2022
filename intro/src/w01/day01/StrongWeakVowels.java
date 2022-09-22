package w01.day01;

public class StrongWeakVowels {

	public static void main(String[] args) {
		char letter = 'U';

		switch (letter) {
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'O':
		case 'o':
			System.out.println(letter + " is a strong vowel");
			break;
		case 'I':
		case 'i':
		case 'U':
		case 'u':

			System.out.println(letter + " is a weak vowel");
			break;
		default:
			System.out.println(letter + " is a consonant");
		}

	}

}