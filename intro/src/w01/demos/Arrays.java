package w01.demos;

public class Arrays {

	public static void main(String[] args) {
		String student1 = "Amanda";
		String student2 = "Joe";
		String student3 = "Mike";
		String student4 = "Jade";
		String student5 = "Tom";

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);

		System.out.println("-------------------------------------------");

		String[] students = new String[4];
		students[0] = "Amanda";
		students[1] = "Joe";
		students[2] = "Mike";
		students[3] = "Jade";
		// students[4] = "Tom";

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		System.out.println("-------------------------------------------");

		for (String student : students) {
			System.out.println(student);
		}

	}
}