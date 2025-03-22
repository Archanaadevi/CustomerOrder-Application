package com.ecom.CustomerOrder.repositary;
import com.ecom.CustomerOrder.model.order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositary extends JpaRepository<order, Long> { }