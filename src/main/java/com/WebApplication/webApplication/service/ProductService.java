package com.WebApplication.webApplication.service;

import java.time.LocalDate;
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

	public String login(String email, String password) {
		Product product = productRepo.findByEmailId(email).orElseThrow(() -> new RuntimeException("User not found"));

		if (password.matches(product.getPassword())) {
			return "Login successful!";
		} else {
			throw new RuntimeException("Invalid credentials");
		}
	}

	public String register(Product product) {
		if (productRepo.findByEmailId(product.getEmailId()).isPresent()) {
			throw new RuntimeException("Email already registered");
		}
		product.setPassword(product.getPassword());
		product.setDate(LocalDate.now().toString());
		productRepo.save(product);
		return "User registered successfully!";
	}

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
