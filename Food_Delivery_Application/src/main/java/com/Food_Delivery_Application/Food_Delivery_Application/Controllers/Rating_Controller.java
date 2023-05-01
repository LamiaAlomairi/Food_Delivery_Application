package com.Food_Delivery_Application.Food_Delivery_Application.Controllers;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Rating;
import com.Food_Delivery_Application.Food_Delivery_Application.Services.Rating_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "rating")
public class Rating_Controller {
    //    http://localhost:8080/rating/getAll
    @Autowired
    Rating_Service rating_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Rating> getAllRatings() {

        return rating_service.getAllRatings();
    }
    @GetMapping(value = "getById")
    public Rating getRatingById(@RequestParam Integer id) {

        return rating_service.getRatingById(id);
    }
}
