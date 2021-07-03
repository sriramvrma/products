package com.example.products;

public class Product {
	
	public Integer id;
	
	public String name;
	
	public Integer price;
	
	
	
	public Product(Integer id, String name, Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}


	public Integer getid() {
		return id;
	}


	public void setid(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getPrice() {
		return price;
	}


	public void setPrice(Integer price) {
		this.price = price;
	}


	protected Product() {
	
	}
}



	