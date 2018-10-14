package com.fishdoctor.app.menu.adapters;

import com.fishdoctor.app.menu.adapters.dtos.Menu;
import com.fishdoctor.app.menu.application.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin("http://localhost:4200")
@Controller
public class MenuResource {

    @Autowired
    private MenuService menuService;

    @GetMapping("/menu")
    @ResponseBody
    public Menu getMenu() {
        return menuService.getMenu();
    }

}
