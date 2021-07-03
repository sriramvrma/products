package com.example.products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductResource {
	
	@Autowired
	public ProductDaoService service;
	
	@GetMapping("/products")
	public List<Product> retriveAllProducts(){
		return service.findall();
		
	}
	@GetMapping("/products/{Id}")
	public Product retriveProduct(@PathVariable int Id) {
		return service.findoOne(Id);
		
	}
	
	@PostMapping("/products")
	public void createproduct(@RequestBody  Product product) {
		Product savedProduct = service.save(product);
		
	}
	
	
	@DeleteMapping ("/products/{id}")
	public void deleteProduct(@PathVariable int id) 
	{
		Product product= service.deleteByid(id);
	}
	
	
	

}
