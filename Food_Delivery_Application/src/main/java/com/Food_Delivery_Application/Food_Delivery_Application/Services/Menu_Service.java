package com.Food_Delivery_Application.Food_Delivery_Application.Services;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Menu;
import com.Food_Delivery_Application.Food_Delivery_Application.Repositories.Menu_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Menu_Service {
    @Autowired
    Menu_Repository menu_repository;
    public List<Menu> getAllMenus() {

        return menu_repository.findAll();
    }

    public Menu getMenuById(Integer id) {

        return menu_repository.findById(id).get();
    }
}
