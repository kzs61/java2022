package demo_;

public class Main {

	public static void main(String[] args) {
		
CreditManager creditManager =  new CreditManager();

creditManager.calculate();
creditManager.save();


Customer customer = new Customer();
customer.Id = 1;
customer.FirstName = "Rauf";
customer.LastName = "Guz";
customer.IdNumber = "12312321";
customer.City = "Izmir";

CustomerManager customerManager = new CustomerManager(customer);
customerManager.save();
customerManager.save();
customerManager.save();
customerManager.delete();


		

	}

}
