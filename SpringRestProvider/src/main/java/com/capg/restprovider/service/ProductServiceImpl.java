package com.capg.restprovider.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.restprovider.entities.Product;

@Service
public class ProductServiceImpl implements ProductService {

	private static List<Product> productsList=new ArrayList<>();
	static {
		Product p1=new Product(101, "Mobile", 12000);
		Product p2=new Product(102, "Laptop", 45000);
		Product p3=new Product(103, "Bag", 1000);
		Product p4=new Product(104, "Tv", 55000);
		Product p5=new Product(105, "Table", 11000);
		productsList.add(p1);
		productsList.add(p2);
		productsList.add(p3);
		productsList.add(p4);
		productsList.add(p5);
			
	}
	
	@Override
	public Product addProduct(Product product) {
		productsList.add(product);
		return product;
	}

	@Override
	public Product getProduct(int prodId) {
		Product product=null;
		for(Product p:productsList) {
			if(p.getProdId()==prodId) {
				product=p;
				break;
			}
		}
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		return productsList;
	}

}
