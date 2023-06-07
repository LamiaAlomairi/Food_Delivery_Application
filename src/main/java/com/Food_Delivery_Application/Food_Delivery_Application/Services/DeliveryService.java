package com.Food_Delivery_Application.Food_Delivery_Application.Services;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Delivery;
import com.Food_Delivery_Application.Food_Delivery_Application.Repositories.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryService {
    @Autowired
    DeliveryRepository deliveryRepository;
    public List<Delivery> getAllDeliveries() {

        return deliveryRepository.findAll();
    }

    public Delivery getDeliveryById(Integer id) {

        return deliveryRepository.findById(id).get();
    }
}
