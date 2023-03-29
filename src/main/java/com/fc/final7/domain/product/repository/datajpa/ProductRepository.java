package com.fc.final7.domain.product.repository.datajpa;

import com.fc.final7.domain.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}