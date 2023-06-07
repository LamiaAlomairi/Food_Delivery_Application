package com.Food_Delivery_Application.Food_Delivery_Application.Services;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Promotion;
import com.Food_Delivery_Application.Food_Delivery_Application.Repositories.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionService {
    @Autowired
    PromotionRepository promotionRepository;
    public List<Promotion> getAllPromotions() {

        return promotionRepository.findAll();
    }

    public Promotion getPromotionById(Integer id) {

        return promotionRepository.findById(id).get();
    }
}
