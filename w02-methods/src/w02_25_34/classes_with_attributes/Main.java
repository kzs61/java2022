package w02_25_34.classes_with_attributes;

public class Main {

	public static void main(String[] args) {

		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);;
		product.setDescription("Asus Laptop");
		product.setPrice(500);
		product.setInventory(3);
		System.out.println(product.getName());
		
		
//		Add product6
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getCode());

	}

}


//SOLID: Single responsibility policy
//https://www.freecodecamp.org/news/solid-principles-single-responsibility-principle-explained/