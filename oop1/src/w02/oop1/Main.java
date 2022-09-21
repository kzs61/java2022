package w02.oop1;

public class Main {

	public static void main(String[] args) {

		String message = "Vade Orani";

		Product product1 = new Product();

		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitInStock(3);
		product1.setImageUrl("imageUrl1.jpg");

		// get
//		System.out.println(product1.name);

		Product product2 = new Product();

		product2.setName("Rocket Kahve Makinasi");
		product2.setUnitPrice(25000);
		product2.setDiscount(10);
		product2.setUnitInStock(2);
		product2.setImageUrl("imageUrl2.jpg");

		Product product3 = new Product();

		product3.setName("Beko Kahve Makinasi");
		product3.setUnitPrice(5800);
		product3.setDiscount(15);
		product3.setUnitInStock(12);
		product3.setImageUrl("imageUrl3.jpg");

		Product[] products = { product1, product2, product3 };

		System.out.println("<ul");

		for (Product product : products) {
//			System.out.println(product.name);
			System.out.println("<li>" + product.getName() + "</li>");

		}

		System.out.println("</ul");

		IndividualCustomer individualCustomer = new IndividualCustomer();

		individualCustomer.setId(1);
		individualCustomer.setPhoneNumber("5673839493");
		individualCustomer.setCustomerNumber("123");
		individualCustomer.setFirstName("Joe");
		individualCustomer.setLastName("Doe");

		CorporateCustomer corporateCustomer = new CorporateCustomer();

		corporateCustomer.setId(2);
		corporateCustomer.setPhoneNumber("555555555");
		corporateCustomer.setCompanyName("SpaceMax");
		corporateCustomer.setTaxNumber("11111111111");
		corporateCustomer.setCustomerNumber("987");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
		

	}

}
