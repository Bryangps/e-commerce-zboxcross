package com.zboxcross.ecommerce.repositories;

import com.zboxcross.ecommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
