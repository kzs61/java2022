package w02_25_34.classes_with_attributes;

public class Product {


//	default constructor
	public Product() {
		System.out.println("Constructor clled");
	}
	
	public Product(int id, String name, String description, double price, int inventory, String color) {
		System.out.println("Constructor called");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.inventory = inventory;
		this.color = color;
	}
	
	
// fields/attributes
	private int id;
	private String name;
	private String description;
	private double price;
	private int inventory;
	private String color;
	private String code;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getInventory() {
		return inventory;
	}
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCode() {
//		as product code get the first letter of the product name and product id.
		return this.name.substring(0,1) + id;
	}
	public void setCode(String code) {
		this.code = code;
	}

	
	
	
	
	
	
	
//	if you want to avoid using this keyword:

	/*
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _inventory;
	private String _colorString;
	private String _code;

	
	public int get_id() {
		return _id;
	}

	public void set_id(int id) {
		id = _id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String name) {
		name = _name;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String description) {
		description = _description;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double price) {
		price = _price;
	}

	public int get_inventory() {
		return _inventory;
	}

	public void set_inventory(int inventory) {
		inventory = _inventory;
	}

	public String get_colorString() {
		return _colorString;
	}

	public void set_colorString(String colorString) {
		colorString = _colorString;
	}

	public String get_code() {
		return _code;
	}

	public void set_code(String code) {
		code = _code;
	}

*/
	
}