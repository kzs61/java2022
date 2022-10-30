package demo_;

public class CustomerManager {
	
	private Customer _customerManager;
	
	
	public CustomerManager(Customer customer) {
		
	
	}
	
	public void save() {
		
		System.out.println("Customer recorded" + _customerManager.FirstName);
	}
	
	
	public void delete() {
		
		System.out.println("Customer deleted" + _customerManager.FirstName);
	}

}
