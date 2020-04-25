package com.capg.restprovider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.restprovider.entities.Product;
import com.capg.restprovider.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping(value="/products", consumes= {"application/json"}, produces= {"application/json"})//adding product
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	
	@GetMapping(value="/products/{prodId}", produces= {"application/json"})//getting products
	public Product getProduct(@PathVariable("prodId") int prodId) {
		return productService.getProduct(prodId);
		
	}

	@GetMapping(value="/products", produces= {"application/json"})//getting products
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
		
	}
}
