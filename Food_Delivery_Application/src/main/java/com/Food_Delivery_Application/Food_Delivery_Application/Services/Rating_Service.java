package com.Food_Delivery_Application.Food_Delivery_Application.Services;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Rating;
import com.Food_Delivery_Application.Food_Delivery_Application.Repositories.Rating_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Rating_Service {
    @Autowired
    Rating_Repository rating_repository;
    public List<Rating> getAllRatings() {

        return rating_repository.findAll();
    }

    public Rating getRatingById(Integer id) {

        return rating_repository.findById(id).get();
    }
}
