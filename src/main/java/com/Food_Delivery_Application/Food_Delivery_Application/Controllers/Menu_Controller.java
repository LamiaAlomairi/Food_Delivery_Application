package com.Food_Delivery_Application.Food_Delivery_Application.Controllers;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Menu;
import com.Food_Delivery_Application.Food_Delivery_Application.Services.Menu_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "menu")
public class Menu_Controller {
    //    http://localhost:8080/menu/getAll
    @Autowired
    Menu_Service menu_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Menu> getAllMenus() {

        return menu_service.getAllMenus();
    }
    @GetMapping(value = "getById")
    public Menu getMenuById(@RequestParam Integer id) {

        return menu_service.getMenuById(id);
    }
}
