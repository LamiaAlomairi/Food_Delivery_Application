package com.Food_Delivery_Application.Food_Delivery_Application.Services;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Customer;
import com.Food_Delivery_Application.Food_Delivery_Application.Repositories.Customer_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Customer_Service {
    @Autowired
    Customer_Repository customer_repository;
    public List<Customer> getAllCustomers() {

        return customer_repository.findAll();
    }

    public Customer getCustomerById(Integer id) {

        return customer_repository.findById(id).get();
    }
}
