package com.WebApplication.webApplication.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.WebApplication.webApplication.model.Product;

@Service
public class ProductService {
	LocalDate currentDate = LocalDate.now();

	List<Product> products = new ArrayList<>(Arrays.asList(new Product(1, "Sai", "sai@gmail.com", currentDate),
			new Product(2, "Ganesh", "ganesh@gmail.com", currentDate)));

	public List<Product> getListOfProducts() {
		return products;
	}

	public Product getProduCtById(int id) {
		return products.stream().filter(p -> p.getId() == id).findFirst().get();
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public void updateProduct(Product product) {
		int index = 0;
		for (int i = 0; i < products.size(); i++)
			if (products.get(i).getId() == product.getId())
				index = i;
		products.set(index, product);

	}

	public void deleteProduct(int id) {
		int index = 0;
		for (int i = 0; i < products.size(); i++)
			if (products.get(i).getId() == id)
				index = i;
		products.remove(index);

	}
}
