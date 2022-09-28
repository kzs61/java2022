package w02_25_37.inheritance;


public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer();
		Employee employee = new Employee();

//		Customer and Employee classes extend Person class therefore both customer and employee objects
//		can access Person class methods.
//		employee and customer objects can NOT access eac other classes' methods because they are not related, 
//		they don't extend each other

		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();

//	employeeManager. EmployeeManager class extends PersonManager class therefore employeeManager object can access PersonManager methods Add() and List() as well
//	customerManager. since CustomerManager class extends PersonManager, customerManager object can access PersonNanager methods Add() and List() as well

	}

}
