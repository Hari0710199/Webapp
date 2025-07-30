package com.WebApplication.webApplication.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WebApplication.webApplication.model.Product;
import com.WebApplication.webApplication.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo productRepo;


	public List<Product> getListOfProducts() {
		return productRepo.findAll();
	}

	public Optional<Product> getProductById(int id) {
		return productRepo.findById(id);
	}

	public void addProduct(Product product) {
		productRepo.save(product);
	}

	public void updateProduct(Product product) {
		productRepo.save(product);

	}

	public void deleteProduct(int id) {
		productRepo.deleteById(id);

	}
}
