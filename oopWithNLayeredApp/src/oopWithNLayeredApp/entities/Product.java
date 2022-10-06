package oopWithNLayeredApp.entities;

//create database object for Product 

public class Product {
	
	private int id;
	private String name;
	private double unitPrice;
	
	
	//create constructor using fields w/out the fields 
	
	public Product() { 
		super();
	}


	//create constructor constructor using fields
	
	public Product(int id, String name, double unitPrice) { 
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	
	//	create the getter setters
	
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


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
	

}


	
	