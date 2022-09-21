package w01.demos;

import java.util.Locale;

public class StringMethods {

	public static void main(String[] args) {

//    	string is array of chars
		String message = "Today weather is beautiful.";
		System.out.println(message);

//      String methods:

//      length()
		System.out.println("Number of characters in message is: " + message.length()); // including space chars it the
																						// string

//      charAt(): gives you the char at index. Index starts from "0"
		System.out.println("5 element of the message String is = " + message.charAt(4));

//      concat()
		System.out.println(message.concat(" Yay!"));

//		You can assign it to a new string variable if you like to use the concatenated string again later
		String message2 = message.concat(" Let's go out!");
		System.out.println(message2);

//		startsWith() & endsWith(): Both return true or false and are Case sensitive.
		System.out.println(message.startsWith("T")); // true
		System.out.println(message.startsWith("t")); // false
		System.out.println(message.startsWith("A")); // false

		System.out.println(message.endsWith(".")); // true

//      getChars() : Used for copying characters from a given string into the destination character array.

		char[] characters = new char[8];
		message.getChars(0, 8, characters, 0);// gets the first 8 element: starts from index 0 ends at index 7
		System.out.println(characters); // Today we

//		indexOf() you can pass single or multiple characters
		System.out.println(message.indexOf("is")); // returns the first character's "i" index of "is"
		System.out.println(message.indexOf("i")); // 14 there are multiple i in the string and returns the index of
													// first i
		System.out.println(message.indexOf("a")); // returns first "a" which is at index 3
		System.out.println(message.indexOf("k")); // there is no "k" in the string it will return -1

//		lastIndexOf() returns the position of the last occurrence of specified character(s) in a string.
		System.out.println(message.lastIndexOf('a')); // 19

//		replace()
		String newMessage = message.replace(" ", "-"); // replace space characters with "-"
		System.out.println(newMessage); // Today-weather-is-beautiful.

//		subString() Returns a new string that is a substring of this string.
//		substring(int beginIndex, int endIndex)

//		Today weather is beautiful.
		System.out.println(message.substring(2)); // returns the string starting from index at 2
													// day weather is beautiful.
		System.out.println(message.substring(2, 4)); // returns the string between index at 2 and index at 4 (index 4 is not included)
													 // da (3rd and 4th characters/2nd and 4th index)

//		split()
		for (String word : message.split(" ")) { // splits the string at space characters
			System.out.println(">>> " + word);
		}

//		toLowerCase()
		System.out.println(message.toLowerCase()); // today weather is beautiful.
		System.out.println(message.toLowerCase(Locale.ROOT)); // today weather is beautiful.
		System.out.println(message.toLowerCase(Locale.ENGLISH)); // today weather is beautiful.

//		toUpperCase()
		System.out.println(message.toUpperCase(Locale.ROOT)); // TODAY WEATHER IS BEAUTIFUL.

		String str = "özgürlük";
		System.out.println(str.toUpperCase(Locale.ROOT)); // ÖZGÜRLÜK
		System.out.println(str.toUpperCase()); // ÖZGÜRLÜK

		// trim()

		String str1 = "      Hello World!                ";
		System.out.println(str1.trim()); // Hello World!

	}
}