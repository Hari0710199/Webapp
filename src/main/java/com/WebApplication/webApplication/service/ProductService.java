package com.WebApplication.webApplication.service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.WebApplication.webApplication.model.Product;

@Service
public class ProductService {
	LocalDate currentDate = LocalDate.now();

	List<Product> products = Arrays.asList(new Product(1, "Sai", "sai@gmail.com", currentDate),
			new Product(2, "Ganesh", "ganesh@gmail.com", currentDate));

	public List<Product> getListOfProducts() {
		return products;

	}
}
