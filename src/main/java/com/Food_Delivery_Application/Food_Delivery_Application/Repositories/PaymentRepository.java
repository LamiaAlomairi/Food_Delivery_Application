package com.Food_Delivery_Application.Food_Delivery_Application.Repositories;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
