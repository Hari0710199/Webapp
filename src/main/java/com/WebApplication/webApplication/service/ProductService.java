package com.WebApplication.webApplication.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.WebApplication.webApplication.model.Product;

@Service
public class ProductService {

	List<Product> products = Arrays.asList(new Product(1, "Sai", "sai@gmail.com"),
			new Product(2, "Ganesh", "ganesh@gmail.com"));

	public List<Product> getListOfProducts() {
		return products;

	}
}
