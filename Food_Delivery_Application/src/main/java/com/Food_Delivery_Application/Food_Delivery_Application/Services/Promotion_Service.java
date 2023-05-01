package com.Food_Delivery_Application.Food_Delivery_Application.Services;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Promotion;
import com.Food_Delivery_Application.Food_Delivery_Application.Repositories.Promotion_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Promotion_Service {
    @Autowired
    Promotion_Repository promotion_repository;
    public List<Promotion> getAllPromotions() {

        return promotion_repository.findAll();
    }

    public Promotion getPromotionById(Integer id) {

        return promotion_repository.findById(id).get();
    }
}
