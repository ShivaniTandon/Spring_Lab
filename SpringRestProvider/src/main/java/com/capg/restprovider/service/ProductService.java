package com.capg.restprovider.service;

import java.util.List;

import com.capg.restprovider.entities.Product;

public interface ProductService {

	public Product addProduct(Product product);
	public Product getProduct(int prodId);
	public List<Product> getAllProducts();
}
