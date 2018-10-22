package com.fishdoctor.app.menu.domain.services;

import com.fishdoctor.app.menu.domain.Menu;
import com.fishdoctor.app.menu.domain.factories.MenuFactory;

public class MenuService {
    private MenuFactory menuFactory;

    public MenuService() {
        this.menuFactory = new MenuFactory();
    }

    public Menu getMenu() {
        return menuFactory.create();
    }
}
