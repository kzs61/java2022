package w3_38_45.abstract_classes;

public abstract class GameCalculator {
	
	public abstract void calculate(); //absract method must be overriden in child class. Child class msut create it's own calculate method.
									  //abstract method does not have implementation here must be implemented in child class 
									  //calculate method required for all game players and since the pointing requirement is different for all player types
									  //we make it abstract and each player type class will implement it the way required.
	
	
//	tamamlanmis operasyon/method
	public final void gameover() { // make it final so cannot be overriden in the child class
		System.out.println("Game Over!");
	}

}

//abstract class must have abstract signature/keyword
//abstract method must have abstract keyword 
//abstract class doesn't has to have an abstract method. Class can be abstract without abstract method.
//Abstract class can have only tamamlanmis operasyon (isi bitmis calisan operasyon/method) 
//Abstract class can have only abstract operations/abstract methods
//Abstract class can have multiple abstract methods and multiple tamamlanmis operations/methods at the same time
//Abstract class (Base class) does not mean anything alone has abstract method(s) that is declared, but contains no implementation.

//Why And When To Use Abstract Classes and Methods?
//To achieve security - hide certain details and only show the important details of an object.
//Note: Abstraction can also be achieved with Interfaces

//http://www.javacoffeebreak.com/faq/faq0084.html

