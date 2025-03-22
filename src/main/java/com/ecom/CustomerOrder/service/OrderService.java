package com.ecom.CustomerOrder.service;


import com.ecom.CustomerOrder.exception.ResourceNotFoundException;
import com.ecom.CustomerOrder.model.order;
import com.ecom.CustomerOrder.repositary.OrderRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepositary repositary;

    public List<order> getAllOrders() {
        return repositary.findAll();
    }

    public order getOrderById(Long id) {
        return repositary.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found"));
    }

    public order addOrder(order order) {
        return repositary.save(order);
    }

    public void deleteOrder(Long id) {
        repositary.deleteById(id);
    }
}
