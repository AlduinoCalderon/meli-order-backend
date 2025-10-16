package com.meli.ecommerce.routes;

import org.springframework.data.jpa.repository.JpaRepository;
import com.meli.ecommerce.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
