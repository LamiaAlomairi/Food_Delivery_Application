package com.Food_Delivery_Application.Food_Delivery_Application.Controllers;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Order;
import com.Food_Delivery_Application.Food_Delivery_Application.Services.Order_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "order")
public class Order_Controller {
    //    http://localhost:8080/order/getAll
    @Autowired
    Order_Service order_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Order> getAllOrders() {

        return order_service.getAllOrders();
    }
    @GetMapping(value = "getById")
    public Order getOrderById(@RequestParam Integer id) {

        return order_service.getOrderById(id);
    }
}
