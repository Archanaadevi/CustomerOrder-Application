package com.ecom.CustomerOrder.controller;

import com.ecom.CustomerOrder.model.order;
import com.ecom.CustomerOrder.service.OrderService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@Tag(name="Order API", description ="operations related to orders ")

@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService service;

    @GetMapping
    public List<order> getAllOrders() {
        return service.getAllOrders();
    }

    @GetMapping("/{id}")
    public order getOrderById(@PathVariable Long id) {
        return service.getOrderById(id);
    }

    @PostMapping
    public order addOrder(@RequestBody order order) {
        return service.addOrder(order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
        service.deleteOrder(id);
    }
}
