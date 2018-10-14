package com.fishdoctor.app.menu.application.services;

import com.fishdoctor.app.menu.adapters.dtos.Menu;
import com.fishdoctor.app.menu.factories.MenuFactory;
import org.springframework.stereotype.Service;

@Service
public class MenuService {
    private MenuFactory menuFactory;

    public MenuService() {
        this.menuFactory = new MenuFactory();
    }

    public Menu getMenu() {
        return menuFactory.create();
    }
}
