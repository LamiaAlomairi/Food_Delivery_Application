package com.Food_Delivery_Application.Food_Delivery_Application.Services;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Delivery;
import com.Food_Delivery_Application.Food_Delivery_Application.Repositories.Delivery_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Delivery_Service {
    @Autowired
    Delivery_Repository delivery_repository;
    public List<Delivery> getAllDeliveries() {

        return delivery_repository.findAll();
    }

    public Delivery getDeliveryById(Integer id) {

        return delivery_repository.findById(id).get();
    }
}
