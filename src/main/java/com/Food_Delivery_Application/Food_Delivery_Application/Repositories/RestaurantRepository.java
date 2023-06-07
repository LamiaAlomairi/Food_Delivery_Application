package com.Food_Delivery_Application.Food_Delivery_Application.Repositories;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
}
