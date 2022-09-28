package w02_25_37.inheritance_demo;

public class CreditUI {
	
//	public void calculateCredit(TeachersCreditManager teachersCreditManager) { //pass the parameter to the method for teachers credit calculation
//		teachersCreditManager.calculateCredit();
	
	
//	Since BaseCreditManager class inherited by both TeachersCreditManager and FarmerCreditManager classes
//	above code can be optimized as below
//	in case in the future if there will be more credit types added like Student credit, home owner credit etc. you need to create the manager class
//	and extend BaseCreditManager class in order calculate credit for the new credit types/products.
//	BaseCreditManager can point both TeachersCreditManager and FarmersCreditManager classes (reference type)
	
	
	public void calculateCredit(BaseCreditManager baseCreditManager) { 
		baseCreditManager.calculateCredit();
		
	}

}
