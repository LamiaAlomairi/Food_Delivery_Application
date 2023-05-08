package com.Food_Delivery_Application.Food_Delivery_Application.Controllers;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Review;
import com.Food_Delivery_Application.Food_Delivery_Application.Services.Review_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "review")
public class Review_Controller {
    //    http://localhost:8080/review/getAll
    @Autowired
    Review_Service review_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Review> getAllReviews() {

        return review_service.getAllReviews();
    }
    @GetMapping(value = "getById")
    public Review getReviewById(@RequestParam Integer id) {

        return review_service.getReviewById(id);
    }
}
