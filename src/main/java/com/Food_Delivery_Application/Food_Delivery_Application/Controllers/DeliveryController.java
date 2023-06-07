package com.Food_Delivery_Application.Food_Delivery_Application.Controllers;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Delivery;
import com.Food_Delivery_Application.Food_Delivery_Application.Services.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "delivery")
public class DeliveryController {
    //    http://localhost:8080/delivery/getAll
    @Autowired
    DeliveryService deliveryService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Delivery> getAllDeliveries() {

        return deliveryService.getAllDeliveries();
    }
    @GetMapping(value = "getById")
    public Delivery getDeliveryById(@RequestParam Integer id) {

        return deliveryService.getDeliveryById(id);
    }
}
