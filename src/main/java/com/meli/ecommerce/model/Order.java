package com.meli.ecommerce.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Represents an order in the e-commerce system.
 * Contains product details, quantity, price, and creation timestamp.
 */
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String productSku;

    @Column(nullable = false)
    private String productName;

    @Column(length = 1000)
    private String productDescription;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    // Getters and setters
    /**
     * Gets the unique identifier of the order.
     * @return the order ID
     */
    public Long getId() { return id; }
    /**
     * Sets the unique identifier of the order.
     * @param id the order ID
     */
    public void setId(Long id) { this.id = id; }
    /**
     * Gets the SKU of the product.
     * @return the product SKU
     */
    public String getProductSku() { return productSku; }
    /**
     * Sets the SKU of the product.
     * @param productSku the product SKU
     */
    public void setProductSku(String productSku) { this.productSku = productSku; }
    /**
     * Gets the name of the product.
     * @return the product name
     */
    public String getProductName() { return productName; }
    /**
     * Sets the name of the product.
     * @param productName the product name
     */
    public void setProductName(String productName) { this.productName = productName; }
    /**
     * Gets the description of the product.
     * @return the product description
     */
    public String getProductDescription() { return productDescription; }
    /**
     * Sets the description of the product.
     * @param productDescription the product description
     */
    public void setProductDescription(String productDescription) { this.productDescription = productDescription; }
    /**
     * Gets the quantity of the product ordered.
     * @return the quantity
     */
    public Integer getQuantity() { return quantity; }
    /**
     * Sets the quantity of the product ordered.
     * @param quantity the quantity
     */
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
    /**
     * Gets the price of the order.
     * @return the price
     */
    public BigDecimal getPrice() { return price; }
    /**
     * Sets the price of the order.
     * @param price the price
     */
    public void setPrice(BigDecimal price) { this.price = price; }
    /**
     * Gets the creation timestamp of the order.
     * @return the creation time
     */
    public LocalDateTime getCreatedAt() { return createdAt; }
    /**
     * Sets the creation timestamp of the order.
     * @param createdAt the creation time
     */
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
