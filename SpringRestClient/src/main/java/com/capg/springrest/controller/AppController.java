package com.capg.springrest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class AppController {

	@RequestMapping(value="/newPage")
	public String newPage() {
		return "addProduct";
		
	}
	
	@RequestMapping(value="/showPage")
	public String showPage() {
		return "display";
	}
	@RequestMapping(value="/add")
	public String addProduct(@ModelAttribute("product") Product product,ModelMap modelMap) {
		String url="http://localhost:8098/SpringRestProvider/products";
		
		RestTemplate restTemplate=new RestTemplate();
		Product newProduct= restTemplate.postForObject(url, product, Product.class);
		
		modelMap.addAttribute("msg", "Product is added with id "+newProduct.getProdId());
		
		return "addProduct";
		
	}
	@RequestMapping(value="/view")
	public String getProduct(@RequestParam("prodId") int id, ModelMap modelMap) {
		String url="http://localhost:8098/SpringRestProvider/products";
		
		RestTemplate restTemplate=new RestTemplate();
		
		Product product= restTemplate.getForObject(url+"/"+id, Product.class);
		
		modelMap.addAttribute("product", product);
		
		return "showData";
		
	}
	
	@RequestMapping(value="/viewAll")
	public String getAllProducts(ModelMap modelMap) {
		
		String url="http://localhost:8098/SpringRestProvider/products";
		
		RestTemplate restTemplate=new RestTemplate();
		
		Product[] products= restTemplate.getForObject(url, Product[].class);
		modelMap.addAttribute("products",products);
		return "showData";
		
	}
	
	
	
	
	
	
}
