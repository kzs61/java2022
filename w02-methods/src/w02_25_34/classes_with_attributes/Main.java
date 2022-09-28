package w02_25_34.classes_with_attributes;

public class Main {

	public static void main(String[] args) {
		
		
		
		Product product = new Product(5, "Laptop", "Asus Laptop", 3000, 2, "Blue");
		
		System.out.println("Id: " + product.getId() + "\n" + 
		"Description: " + product.getDescription() + "\n" + 
				"Name: " + product.getName() + "\n" +
		"Price: " + product.getPrice() + "\n" +
				"Inventory: " + product.getInventory() + "\n" +
		"Color: " + product.getColor());
		
		
		System.out.println("\n-----------------------------------------");
		
		Product product2 = new Product(35, "Tablet PC", "Casper", 4500.99, 7, "Silver");
		
		System.out.println("Id: " + product2.getId() + "\n" + 
		"Description: " + product2.getDescription() + "\n" + 
				"Name: " + product2.getName() + "\n" +
		"Price: " + product2.getPrice() + "\n" +
				"Inventory: " + product2.getInventory() + "\n" +
		"Color: " + product2.getColor());
		
		
		
		

//		Product product = new Product();
//		product.setName("Laptop");
//		product.setId(1);;
//		product.setDescription("Asus Laptop");
//		product.setPrice(500);
//		product.setInventory(3);
//		System.out.println(product.getName());
		
		System.out.println("\n-----------------------------------------");
//		Add product
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getCode());
		
		System.out.println("\n-----------------------------------------");
		
		ProductManager productManager2 = new ProductManager();
		productManager2.Add(product2);
		
		System.out.println(product2.getCode());

	}

}


//SOLID: Single responsibility policy
//https://www.freecodecamp.org/news/solid-principles-single-responsibility-principle-explained/