package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Product;
import com.example.demo.Repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> getProduct() {
		return productRepository.findAll();
		
	}

	@Override
	public Object saveProduct(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	public Object getById(int id) {
		
		return productRepository.findById(id);
	}

}
