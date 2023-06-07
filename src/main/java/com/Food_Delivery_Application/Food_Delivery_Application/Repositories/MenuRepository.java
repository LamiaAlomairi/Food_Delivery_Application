package com.Food_Delivery_Application.Food_Delivery_Application.Repositories;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
}
