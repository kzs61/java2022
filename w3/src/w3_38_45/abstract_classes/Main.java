package w3_38_45.abstract_classes;

import java.security.PublicKey;

public class Main {

	public static void main(String[] args) {
		
		FemaleGameCalculator femaleGameCalculator = new FemaleGameCalculator();
		femaleGameCalculator.calculate();
		femaleGameCalculator.gameover();
		
		
//		use of abstarcs
//		you can use abstracts when you want to hide Base classes
//		You can't create object of an Abstract class with new key word.
//		this is illegal for abstract class: GameCalculator gameCalculator = new GameCalculator();
//		however you can still do it with override but not prefered 
		
		
//		using abstract
	
		GameCalculator gameCalculator = new FemaleGameCalculator();
		
	}

}
