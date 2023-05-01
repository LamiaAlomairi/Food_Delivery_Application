package com.Food_Delivery_Application.Food_Delivery_Application.Services;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Payment;
import com.Food_Delivery_Application.Food_Delivery_Application.Repositories.Payment_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Payment_Service {
    @Autowired
    Payment_Repository payment_repository;
    public List<Payment> getAllPayments() {

        return payment_repository.findAll();
    }

    public Payment getPaymentById(Integer id) {

        return payment_repository.findById(id).get();
    }
}
