package com.WebApplication.webApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.WebApplication.webApplication.model.Product;
import com.WebApplication.webApplication.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping("/")
	public List<Product> getProcucts() {
		System.out.println("Inside Controller");
		return productService.getListOfProducts();
	}
}
