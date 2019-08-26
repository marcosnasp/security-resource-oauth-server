package com.example.spring.security.resource.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.security.resource.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	Product findByNameLike(String name);

	List<Product> findAll();
	
}