package com.Food_Delivery_Application.Food_Delivery_Application.Controllers;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Delivery;
import com.Food_Delivery_Application.Food_Delivery_Application.Services.Delivery_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "delivery")
public class Delivery_Controller {
    //    http://localhost:8080/delivery/getAll
    @Autowired
    Delivery_Service delivery_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Delivery> getAllDeliveries() {

        return delivery_service.getAllDeliveries();
    }
    @GetMapping(value = "getById")
    public Delivery getDeliveryById(@RequestParam Integer id) {

        return delivery_service.getDeliveryById(id);
    }
}
