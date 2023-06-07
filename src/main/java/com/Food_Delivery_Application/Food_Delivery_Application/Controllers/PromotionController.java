package com.Food_Delivery_Application.Food_Delivery_Application.Controllers;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Promotion;
import com.Food_Delivery_Application.Food_Delivery_Application.Services.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "promotion")
public class PromotionController {
    //    http://localhost:8080/promotion/getAll
    @Autowired
    PromotionService promotionService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Promotion> getAllPromotions() {

        return promotionService.getAllPromotions();
    }
    @GetMapping(value = "getById")
    public Promotion getPromotionById(@RequestParam Integer id) {

        return promotionService.getPromotionById(id);
    }
}
