package w3_task_1;

public class CustomerManager {
    
	private Customer customer;
    private ICreditManager creditManager;

    public CustomerManager(Customer customer, ICreditManager creditManager) {
        this.customer = customer;
        this.creditManager = creditManager;
    }

    public void save() {
        System.out.println("Customer created");
    }

    public void delete() {
        System.out.println("Customer removed/deleted");
    }

    public void grantCredit() {
        creditManager.calculate();
        System.out.println("Credit granted");
    }


}