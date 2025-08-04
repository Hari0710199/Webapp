package com.WebApplication.webApplication.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("/")
	public List<Product> getProcucts() {
		return productService.getListOfProducts();
	}

	@GetMapping("/{id}")
	// To match path Id
	public Optional<Product> getProduCtById(@PathVariable int id) {
		return productService.getProductById(id);
	}

	@PostMapping("/add")
	// We need use requestbody if we use to pass something from headers
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}

	@PutMapping("/update")
	public void upadateProduct(@RequestBody Product product) {
		productService.updateProduct(product);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteProduct(@PathVariable int id) {
		productService.deleteProduct(id);
	}

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody Map<String, String> loginData) {
		String email = loginData.get("emailId");
		String password = loginData.get("password");
		String result = productService.login(email, password);
		return ResponseEntity.ok(result);
	}

	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody Product product) {
		String result = productService.register(product);
		return ResponseEntity.ok(result);
	}
}
