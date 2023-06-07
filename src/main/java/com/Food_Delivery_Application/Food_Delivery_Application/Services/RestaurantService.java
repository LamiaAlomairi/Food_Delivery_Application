package com.Food_Delivery_Application.Food_Delivery_Application.Services;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Restaurant;
import com.Food_Delivery_Application.Food_Delivery_Application.Repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepository restaurantRepository;
    public List<Restaurant> getAllRestaurants() {

        return restaurantRepository.findAll();
    }

    public Restaurant getRestaurantById(Integer id) {

        return restaurantRepository.findById(id).get();
    }
}
