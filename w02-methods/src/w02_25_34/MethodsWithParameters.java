
package w02_25_34;

public class MethodsWithParameters {

	public static void main(String[] args) {

		String message = "Sun is shining!";
		String newMessage = message.substring(0, 3);
		System.out.println(newMessage);

//        System.out.println(add());

		System.out.println(returnCity());

		int number = sum(20, 15);
		System.out.println(number);

		int total = sum2(1, 2, 3, 5, 8);
		System.out.println(total);

	}

	public static void add() {
		System.out.println("Added");
	}

	public static void delete() {
		System.out.println("Deleted");
	}

	public static void update() {
		System.out.println("Updated");
	}

	public static int sum(int num1, int num2) {
		return num1 + num2;
	}


	public static int sum2(int... numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;

		}
		return total;
	}

	public static String returnCity() {
		return "Izmir";
	}
}

/*
varargs: 

- accepts zero or more same type arguments
- Advantage of varargs: don't have to provide overloaded methods so less code.
- Vararg Methods can also be overloaded, but overloading may lead to ambiguity.
- There can be only one variable argument in the method.
- if you are certain about the number of arguments passed to a method, use method overloading instead.

- While defining method signature, always keep varargs at last.
	public void doSomething(int p, int ... nums) {
    // method body
	}
	The Java compiler assigns the first argument to p, and the remaining int arguments are assigned to nums

- A method can have only one varargs parameter.
	For example, this method declaration is incorrect:

	int doSomething(int p, float ... floatNums, double ... doubleNums) {
    // code
	}

*/

