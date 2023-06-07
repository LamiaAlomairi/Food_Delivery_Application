package com.Food_Delivery_Application.Food_Delivery_Application.Controllers;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Rating;
import com.Food_Delivery_Application.Food_Delivery_Application.Services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "rating")
public class RatingController {
    //    http://localhost:8080/rating/getAll
    @Autowired
    RatingService ratingService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Rating> getAllRatings() {

        return ratingService.getAllRatings();
    }
    @GetMapping(value = "getById")
    public Rating getRatingById(@RequestParam Integer id) {

        return ratingService.getRatingById(id);
    }
}
