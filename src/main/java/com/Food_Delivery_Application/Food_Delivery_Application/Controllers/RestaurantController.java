package com.Food_Delivery_Application.Food_Delivery_Application.Controllers;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Restaurant;
import com.Food_Delivery_Application.Food_Delivery_Application.Services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "restaurant")
public class RestaurantController {
    //    http://localhost:8080/restaurant/getAll
    @Autowired
    RestaurantService restaurantService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Restaurant> getAllRestaurants() {

        return restaurantService.getAllRestaurants();
    }
    @GetMapping(value = "getById")
    public Restaurant getRestaurantById(@RequestParam Integer id) {

        return restaurantService.getRestaurantById(id);
    }
}
