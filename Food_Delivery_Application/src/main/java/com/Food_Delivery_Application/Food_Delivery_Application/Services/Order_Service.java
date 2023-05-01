package com.Food_Delivery_Application.Food_Delivery_Application.Services;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Order;
import com.Food_Delivery_Application.Food_Delivery_Application.Repositories.Order_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Order_Service {
    @Autowired
    Order_Repository order_repository;
    public List<Order> getAllOrders() {

        return order_repository.findAll();
    }

    public Order getOrderById(Integer id) {

        return order_repository.findById(id).get();
    }
}
