package w02_25_37;

import java.rmi.dgc.VMID;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Classes {

	public static void main(String[] args) {

//		Class is a blueprint of objects
//		from the blueprint you can create different objects
//		means from CustomerManager class you can create multiple customerManagers (objects): customerManager, customerManager1, customerManager2, etc,...
//		 Objects are stored in heap memory and when not used collected by the Java garbage collector.
//		In Java, all objects and arrays are reference types, and all primitives are value types. 

		CustomerManager customerManager = new CustomerManager();

		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		customerManager.Archive();

		System.out.println(customerManager.hashCode());

		System.out.println("\n----- customerManager1 -----");
		CustomerManager customerManager1 = new CustomerManager();

		customerManager1.Add();
		customerManager1.Remove();
		customerManager1.Update();

//		System.out.println(customerManager1);
		System.out.println(customerManager1.hashCode()); 

		System.out.println("\n----- point customerManager1 -----");

//		If obj1 and obj2 are equal, they must have the same hash code.
//		If obj1 and obj2 have the same hash code, they do not have to be equal.

		customerManager1 = customerManager; 

		System.out.println(customerManager.hashCode());
		System.out.println(customerManager1.hashCode());

		
		
		
		
//		value types: stored in stack memory
		
		System.out.println("\n----- value type ------");
		
		
		int num1 = 10;
		int num2 = 20;
		num1 = num2;
		num1 = 30;
		System.out.println(num2); // 20
		System.out.println(num1); // 30

		
		
		
		
//		 Arrays are reference type:
		
		System.out.println("\n----- Arrays are reference type -----");
		
		
		int[] numbers1 = new int[] { 1, 2, 3 };
		int[] numbers2 = new int[] { 4, 5, 6 };
		
		numbers1 = numbers2; //now both variables pointing/referencing the same object in heap
		numbers1[0] = 10;
		System.out.println("numbers2[0]: " + numbers2[0]); //10
		
		
		

//		------------------------- Hashcode -----------------------------
		
		System.out.println("\n----- Hashcode -----");

		String string1 = new String("Flower");
		String string2 = new String("Flower");

//		In above two lines, two instances of String objects are created. 
//		They exist separately, so they occupy different parts of the heap memory.
//		But they contain the same value, therefore their hashCode is the same.

		System.out.println(string1.hashCode());
		System.out.println(string2.hashCode());
		
		

//		hashCode is an integer number that is intended to signify the uniqueness of your objects. If two objects are equal, they must also have the same hashcode. 
//		If you create your own class and you want to put it in a hashable collection, for example HashSet<MyClass> then MyClass must implement the hashcode method.
//		These data structures that work with hash tables, allow for very quick data retrieval
		
	}

}

//https://docs.oracle.com/cd/E13150_01/jrockit_jvm/jrockit/geninfo/diagnos/garbage_collect.html
//https://docs.oracle.com/javase/specs/jvms/se11/html/jvms-2.html
//https://www.geeksforgeeks.org/how-many-types-of-memory-areas-are-allocated-by-jvm/
//https://www.baeldung.com/java-stack-heap
//https://www.digitalocean.com/community/tutorials/java-heap-space-vs-stack-memory

//value type vs reference type: http://net-informations.com/faq/general/valuetype-referencetype.htm
//https://www.developer.com/java/java-valuetype/
//https://eclipsesource.com/blogs/2012/09/04/the-3-things-you-should-know-about-hashcode/
