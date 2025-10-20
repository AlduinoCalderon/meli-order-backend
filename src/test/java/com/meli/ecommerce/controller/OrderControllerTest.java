package com.meli.ecommerce.controller;

import com.meli.ecommerce.model.Order;
import com.meli.ecommerce.routes.OrderService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class OrderControllerTest {
    @Mock
    private OrderService orderService;

    @InjectMocks
    private OrderController orderController;

    private Order order;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        order = new Order();
        order.setId(1L);
        order.setProductSku("SKU123");
        order.setProductName("Test Product");
        order.setQuantity(2);
    }

    @Test
    void testGetAllOrders() {
        when(orderService.findAll()).thenReturn(Arrays.asList(order));
        List<Order> orders = orderService.findAll();
        assertEquals(1, orders.size());
        assertEquals("SKU123", orders.get(0).getProductSku());
    }

    @Test
    void testGetOrderById() {
        when(orderService.findById(1L)).thenReturn(java.util.Optional.of(order));
        java.util.Optional<Order> found = orderService.findById(1L);
        assertTrue(found.isPresent());
        assertEquals("Test Product", found.get().getProductName());
    }
}
