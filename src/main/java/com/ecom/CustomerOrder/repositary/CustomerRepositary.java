package com.ecom.CustomerOrder.repositary;

import com.ecom.CustomerOrder.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositary extends JpaRepository<Customer, Long>{
}
