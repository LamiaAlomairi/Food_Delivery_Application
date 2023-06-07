package com.Food_Delivery_Application.Food_Delivery_Application.Repositories;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {
}
