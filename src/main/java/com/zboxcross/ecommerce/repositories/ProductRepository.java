package com.zboxcross.ecommerce.repositories;

import com.zboxcross.ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
