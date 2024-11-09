package com.zboxcross.ecommerce.repositories;

import com.zboxcross.ecommerce.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
