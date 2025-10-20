package com.meli.ecommerce.routes;

import org.springframework.data.jpa.repository.JpaRepository;
import com.meli.ecommerce.model.Order;

/**
 * Repository interface for Order entities.
 * Provides CRUD operations via Spring Data JPA.
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
