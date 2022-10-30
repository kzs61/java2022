package w3_38_45.interfaces;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		
		this.customerDal = customerDal;
	}
	
	public void add() {
	//control layer / is kodlari : lets say you pass parameter to the add() method
	//for customer and this classs controls Customers related data is present, correct, name, last name, address, etc, etc,..
	
		customerDal.add();
	
	}

}
