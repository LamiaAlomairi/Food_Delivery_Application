package com.Food_Delivery_Application.Food_Delivery_Application.Controllers;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Restaurant;
import com.Food_Delivery_Application.Food_Delivery_Application.Services.Restaurant_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "restaurant")
public class Restaurant_Controller {
    //    http://localhost:8080/restaurant/getAll
    @Autowired
    Restaurant_Service restaurant_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Restaurant> getAllRestaurants() {

        return restaurant_service.getAllRestaurants();
    }
    @GetMapping(value = "getById")
    public Restaurant getRestaurantById(@RequestParam Integer id) {

        return restaurant_service.getRestaurantById(id);
    }
}
