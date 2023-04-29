package com.jwt.secqurity.relationExample.repository;

import com.jwt.secqurity.relationExample.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
