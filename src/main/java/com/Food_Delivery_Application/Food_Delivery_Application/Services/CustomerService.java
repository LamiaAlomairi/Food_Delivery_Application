package com.Food_Delivery_Application.Food_Delivery_Application.Services;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Customer;
import com.Food_Delivery_Application.Food_Delivery_Application.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public List<Customer> getAllCustomers() {

        return customerRepository.findAll();
    }

    public Customer getCustomerById(Integer id) {

        return customerRepository.findById(id).get();
    }
}
