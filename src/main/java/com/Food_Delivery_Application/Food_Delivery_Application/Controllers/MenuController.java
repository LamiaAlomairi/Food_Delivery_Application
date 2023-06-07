package com.Food_Delivery_Application.Food_Delivery_Application.Controllers;

import com.Food_Delivery_Application.Food_Delivery_Application.Models.Menu;
import com.Food_Delivery_Application.Food_Delivery_Application.Services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "menu")
public class MenuController {
    //    http://localhost:8080/menu/getAll
    @Autowired
    MenuService menuService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Menu> getAllMenus() {

        return menuService.getAllMenus();
    }
    @GetMapping(value = "getById")
    public Menu getMenuById(@RequestParam Integer id) {

        return menuService.getMenuById(id);
    }
}
