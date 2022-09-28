package w02_25_37.inheritance_demo;

public class Main {
	
	public static void main(String[] args) {
		
	
//	TeachersCreditManager teachersCreditManager = new TeachersCreditManager();
//	
//	teachersCreditManager.calculate();
		
		CreditUI creditUI = new CreditUI();
		
//		polymorphism. 
		
		creditUI.calculateCredit(new TeachersCreditManager()); //requires parameter: new TeachersCreditManager()
	
		creditUI.calculateCredit(new FarmersCreditManager());
		creditUI.calculateCredit(new MilitaryPersonnelCreditManager());
		
	}

}
