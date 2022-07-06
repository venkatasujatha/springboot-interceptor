package com.example.demo.Controller.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Product;
import com.example.demo.Repository.ProductRepository;
import com.example.demo.Service.ProductService;

@RestController
@RequestMapping("/invoked")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/get")
	public List<Product> getProduct()
	{
		
		System.out.println("ok");
		return productService.getProduct();
		
	}
	@PostMapping("/saveproduct")
	public Object saveProduct(@RequestBody Product product)
	{
		return productService.saveProduct(product);
	}
	@GetMapping("/get/{id}")
	public Object getById(@PathVariable int id)
	{
		return productService.getById(id);
	}

}
