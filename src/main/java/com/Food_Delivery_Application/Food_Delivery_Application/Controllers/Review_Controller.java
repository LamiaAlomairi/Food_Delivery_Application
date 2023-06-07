package com.Food_Delivery_Application.Food_Delivery_Application.Controllers;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Review;
import com.Food_Delivery_Application.Food_Delivery_Application.Services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "review")
public class Review_Controller {
    //    http://localhost:8080/review/getAll
    @Autowired
    ReviewService reviewService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Review> getAllReviews() {

        return reviewService.getAllReviews();
    }
    @GetMapping(value = "getById")
    public Review getReviewById(@RequestParam Integer id) {

        return reviewService.getReviewById(id);
    }
}
