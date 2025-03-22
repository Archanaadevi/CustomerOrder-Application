package com.ecom.CustomerOrder.service;

import com.ecom.CustomerOrder.exception.ResourceNotFoundException;
import com.ecom.CustomerOrder.model.Customer;
import com.ecom.CustomerOrder.repositary.CustomerRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepositary repositary;

    public Customer addCustomer(Customer customer){
        return repositary.save(customer);
    }
    public List<Customer>getAllCustomer(){
        return repositary.findAll();
    }

    public Customer getCustomerById(Long id){
        return repositary.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Customer Not found"));
    }

    public void deleteCustomer(Long id){
        repositary.deleteById(id);
    }
}


