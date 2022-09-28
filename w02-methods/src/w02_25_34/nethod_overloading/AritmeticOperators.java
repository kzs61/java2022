package w02_25_34.nethod_overloading;

public class AritmeticOperators {
	
//	method overloading, multiple methods can have the same name with different parameters:
//	method name is same but signature is different
	
	
	public int addition(int num1, int num2) {
		return num1+num2;
	}
	
	
	public int addition(int num1, int num2, int num3) {
		return num1+num2;
		
	
	}
	
	
	public double addition(double num1, double num2, double num3, double num4) {
		return num1+num3+num4;
	}


//	public double addition(double num1, double num2, double num3, double num4) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
