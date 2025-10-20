package com.meli.ecommerce.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.meli.ecommerce.model.Order;
import com.meli.ecommerce.routes.OrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import jakarta.validation.Valid;

@RestController
/**
 * REST controller for managing orders in the e-commerce system.
 * Provides endpoints for CRUD operations on orders.
 */
@Tag(name = "Orders", description = "Order management API")
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService orderService;
    private final DataSource dataSource;

    /**
     * Constructs an OrderController with the given OrderService and DataSource.
     * @param orderService the service for order operations
     * @param dataSource the datasource for DB connectivity
     */
    @Autowired
    public OrderController(OrderService orderService, DataSource dataSource) {
        this.orderService = orderService;
        this.dataSource = dataSource;
    }
    /**
     * Health check endpoint for API and database connectivity.
     * @return 200 OK if API and DB are healthy, 503 if DB is unreachable
     */
    @GetMapping("/health")
    @Operation(summary = "API health check", description = "Checks API status and database connectivity.")
    public ResponseEntity<String> health() {
        try (Connection conn = dataSource.getConnection()) {
            if (conn.isValid(2)) {
                return ResponseEntity.ok("API is healthy. Database connection successful.");
            } else {
                return ResponseEntity.status(503).body("API is healthy. Database connection failed.");
            }
        } catch (SQLException e) {
            return ResponseEntity.status(503).body("API is healthy. Database connection failed: " + e.getMessage());
        }
    }

    @GetMapping
    @Operation(summary = "Get all orders", description = "Returns a list of all orders")
    /**
     * Retrieves all orders.
     * @return a list of all orders
     */
    public List<Order> getAllOrders() {
        return orderService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get order by ID", description = "Returns a single order by its ID")
    /**
     * Retrieves an order by its ID.
     * @param id the order ID
     * @return the order if found, otherwise 404
     */
    public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
        return orderService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Create order", description = "Creates a new order")
    /**
     * Creates a new order.
     * @param order the order to create
     * @return the created order
     */
    public Order createOrder(@Valid @RequestBody Order order) {
        return orderService.save(order);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update order", description = "Updates an existing order by ID")
    /**
     * Updates an existing order by ID.
     * @param id the order ID
     * @param order the updated order data
     * @return the updated order if found, otherwise 404
     */
    public ResponseEntity<Order> updateOrder(@PathVariable Long id, @Valid @RequestBody Order order) {
        return orderService.findById(id)
                .map(existing -> {
                    order.setId(id);
                    return ResponseEntity.ok(orderService.save(order));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete order", description = "Deletes an order by ID")
    /**
     * Deletes an order by its ID.
     * @param id the order ID
     * @return 204 if deleted, otherwise 404
     */
    public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
        if (orderService.findById(id).isPresent()) {
            orderService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
