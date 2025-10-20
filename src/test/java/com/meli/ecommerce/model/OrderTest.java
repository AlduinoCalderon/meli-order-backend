package com.meli.ecommerce.model;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    @Test
    void testOrderFields() {
        Order order = new Order();
        order.setId(1L);
        order.setProductSku("SKU123");
        order.setProductName("Test Product");
        order.setProductDescription("Test Description");
        order.setQuantity(2);
        order.setPrice(new BigDecimal("99.99"));
        LocalDateTime now = LocalDateTime.now();
        order.setCreatedAt(now);

        assertEquals(1L, order.getId());
        assertEquals("SKU123", order.getProductSku());
        assertEquals("Test Product", order.getProductName());
        assertEquals("Test Description", order.getProductDescription());
        assertEquals(2, order.getQuantity());
        assertEquals(new BigDecimal("99.99"), order.getPrice());
        assertEquals(now, order.getCreatedAt());
    }
}
