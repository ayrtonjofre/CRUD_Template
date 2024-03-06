package com.example.crud.domain.product;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {}
