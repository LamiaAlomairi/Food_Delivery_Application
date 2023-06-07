package com.Food_Delivery_Application.Food_Delivery_Application.Services;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Payment;
import com.Food_Delivery_Application.Food_Delivery_Application.Repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;
    public List<Payment> getAllPayments() {

        return paymentRepository.findAll();
    }

    public Payment getPaymentById(Integer id) {

        return paymentRepository.findById(id).get();
    }
}
