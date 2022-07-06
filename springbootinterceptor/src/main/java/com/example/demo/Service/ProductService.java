package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Product;

public interface ProductService {

	List<Product> getProduct();

	Object saveProduct(Product product);

	Object getById(int id);
	

}
