package com.Food_Delivery_Application.Food_Delivery_Application.Repositories;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Customer_Repository extends JpaRepository<Customer, Integer> {
}
