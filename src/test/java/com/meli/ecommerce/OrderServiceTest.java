package com.meli.ecommerce;

import com.meli.ecommerce.model.Order;
import com.meli.ecommerce.routes.OrderRepository;
import com.meli.ecommerce.routes.OrderService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class OrderServiceTest {
    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderService orderService;

    private Order order;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        order = new Order();
        order.setId(1L);
        order.setProductSku("SKU123");
        order.setProductName("Test Product");
        order.setProductDescription("Test Description");
        order.setQuantity(2);
        order.setPrice(new BigDecimal("99.99"));
        order.setCreatedAt(LocalDateTime.now());
    }

    @Test
    void testFindAllOrders() {
        when(orderRepository.findAll()).thenReturn(Arrays.asList(order));
        List<Order> orders = orderService.findAll();
        assertEquals(1, orders.size());
        assertEquals("SKU123", orders.get(0).getProductSku());
    }

    @Test
    void testFindOrderById() {
        when(orderRepository.findById(1L)).thenReturn(Optional.of(order));
        Optional<Order> found = orderService.findById(1L);
        assertTrue(found.isPresent());
        assertEquals("Test Product", found.get().getProductName());
    }

    @Test
    void testSaveOrder() {
        when(orderRepository.save(order)).thenReturn(order);
        Order saved = orderService.save(order);
        assertNotNull(saved);
        assertEquals("SKU123", saved.getProductSku());
    }

    @Test
    void testDeleteOrder() {
        doNothing().when(orderRepository).deleteById(1L);
        orderService.deleteById(1L);
        verify(orderRepository, times(1)).deleteById(1L);
    }
}
