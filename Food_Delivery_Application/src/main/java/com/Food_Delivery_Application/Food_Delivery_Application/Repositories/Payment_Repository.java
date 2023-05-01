package com.Food_Delivery_Application.Food_Delivery_Application.Repositories;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Payment_Repository extends JpaRepository<Payment, Integer> {
}
