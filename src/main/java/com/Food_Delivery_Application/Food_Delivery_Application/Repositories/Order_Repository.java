package com.Food_Delivery_Application.Food_Delivery_Application.Repositories;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Order_Repository extends JpaRepository<Order, Integer> {
}
