package com.example.products;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ProductDaoService {
	
	public static List<Product> products = new ArrayList<>();
	
	public static int productsCount = 3;
	
	
	static {
	    products.add(new Product(1, "wardrobes", 10000));
		products.add(new Product(2, "table", 5000));
		products.add(new Product(3, "chair", 10));
	}
	
	public List<Product> findall(){
		
		return products;
	}

	public Product save(Product product) {
		if(product.getid()==null) {
			product.setid(++productsCount);
		}
		
		products.add(product);
		
		return product;
	}
	
	
	public Product findoOne(int id) {
		for(Product product:products) {
			if(product.getid()==id) {
				return product;
			}
		}
		return null;
		
	}
	public Product deleteByid(int id) {
		
	java.util.Iterator<Product>	 iterator =    products.iterator();

		while(iterator.hasNext()) {
			Product product=iterator.next();
			if(product.getid()==id) {
				iterator.remove();
				return product;
				}
				
			}
		return null;
		}
	}
		
		

