package com.WebApplication.webApplication.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WebApplication.webApplication.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

	Optional<Product> findByEmailId(String emailId);
}
