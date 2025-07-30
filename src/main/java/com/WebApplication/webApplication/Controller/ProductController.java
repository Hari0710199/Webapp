package com.WebApplication.webApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.WebApplication.webApplication.model.Product;
import com.WebApplication.webApplication.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("/products")
	public List<Product> getProcucts() {
		return productService.getListOfProducts();
	}

	@GetMapping("/products/{id}")
	// To match path Id
	public Product getProduCtById(@PathVariable int id) {
		return productService.getProduCtById(id);
	}

	@PostMapping("/products/add")
	// We need use requestbody if we use to pass something from headers
	public void addProduct(@RequestBody Product product) {
		System.out.println(product);
		productService.addProduct(product);
	}

	@PutMapping("/products/update")
	public void upadateProduct(@RequestBody Product product) {
		productService.updateProduct(product);
	}

	@DeleteMapping("/products/delete/{id}")
	public void deleteProduct(@PathVariable int id) {
		productService.deleteProduct(id);
	}
}
