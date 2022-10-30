package w3_38_45.interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepository{

	@Override
	public void add() {
		
System.out.println("Added to MySql DB");
		
	}

}
