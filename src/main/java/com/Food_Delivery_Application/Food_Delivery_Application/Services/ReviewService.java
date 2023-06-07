package com.Food_Delivery_Application.Food_Delivery_Application.Services;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Review;
import com.Food_Delivery_Application.Food_Delivery_Application.Repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    ReviewRepository reviewRepository;
    public List<Review> getAllReviews() {

        return reviewRepository.findAll();
    }

    public Review getReviewById(Integer id) {

        return reviewRepository.findById(id).get();
    }
}
