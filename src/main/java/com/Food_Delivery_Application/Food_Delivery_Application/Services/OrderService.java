package com.Food_Delivery_Application.Food_Delivery_Application.Services;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Order;
import com.Food_Delivery_Application.Food_Delivery_Application.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    public List<Order> getAllOrders() {

        return orderRepository.findAll();
    }

    public Order getOrderById(Integer id) {

        return orderRepository.findById(id).get();
    }
}
