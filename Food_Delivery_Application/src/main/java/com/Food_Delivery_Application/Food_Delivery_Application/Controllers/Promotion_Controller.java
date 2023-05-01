package com.Food_Delivery_Application.Food_Delivery_Application.Controllers;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Promotion;
import com.Food_Delivery_Application.Food_Delivery_Application.Services.Promotion_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "promotion")
public class Promotion_Controller {
    //    http://localhost:8080/promotion/getAll
    @Autowired
    Promotion_Service promotion_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Promotion> getAllPromotions() {

        return promotion_service.getAllPromotions();
    }
    @GetMapping(value = "getById")
    public Promotion getPromotionById(@RequestParam Integer id) {

        return promotion_service.getPromotionById(id);
    }
}
