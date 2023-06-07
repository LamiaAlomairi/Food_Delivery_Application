package com.Food_Delivery_Application.Food_Delivery_Application.Services;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Rating;
import com.Food_Delivery_Application.Food_Delivery_Application.Repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {
    @Autowired
    RatingRepository ratingRepository;
    public List<Rating> getAllRatings() {

        return ratingRepository.findAll();
    }

    public Rating getRatingById(Integer id) {

        return ratingRepository.findById(id).get();
    }
}
