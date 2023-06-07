package com.Food_Delivery_Application.Food_Delivery_Application.Services;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Menu;
import com.Food_Delivery_Application.Food_Delivery_Application.Repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    MenuRepository menuRepository;
    public List<Menu> getAllMenus() {

        return menuRepository.findAll();
    }

    public Menu getMenuById(Integer id) {

        return menuRepository.findById(id).get();
    }
}
