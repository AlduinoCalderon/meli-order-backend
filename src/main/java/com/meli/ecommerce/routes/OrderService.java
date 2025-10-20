package com.meli.ecommerce.routes;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.meli.ecommerce.model.Order;

/**
 * Service class for business logic related to orders.
 * Handles CRUD operations using OrderRepository.
 */
@Service
public class OrderService {
    private final OrderRepository orderRepository;

    /**
     * Constructs an OrderService with the given OrderRepository.
     * @param orderRepository the repository for order data
     */
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    /**
     * Retrieves all orders from the repository.
     * @return a list of all orders
     */
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    /**
     * Finds an order by its ID.
     * @param id the order ID
     * @return an Optional containing the order if found
     */
    public Optional<Order> findById(Long id) {
        return orderRepository.findById(id);
    }

    /**
     * Saves a new or existing order to the repository.
     * @param order the order to save
     * @return the saved order
     */
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    /**
     * Deletes an order by its ID.
     * @param id the order ID
     */
    public void deleteById(Long id) {
        orderRepository.deleteById(id);
    }
}
