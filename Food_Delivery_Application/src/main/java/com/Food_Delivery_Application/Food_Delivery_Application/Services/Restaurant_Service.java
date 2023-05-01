package com.Food_Delivery_Application.Food_Delivery_Application.Services;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Restaurant;
import com.Food_Delivery_Application.Food_Delivery_Application.Repositories.Restaurant_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Restaurant_Service {
    @Autowired
    Restaurant_Repository restaurant_repository;
    public List<Restaurant> getAllRestaurants() {

        return restaurant_repository.findAll();
    }

    public Restaurant getRestaurantById(Integer id) {

        return restaurant_repository.findById(id).get();
    }
}
