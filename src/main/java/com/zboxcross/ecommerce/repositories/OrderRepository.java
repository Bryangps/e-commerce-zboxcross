package com.zboxcross.ecommerce.repositories;

import com.zboxcross.ecommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
