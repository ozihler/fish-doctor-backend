package com.fishdoctor.app.menu.spring.services;

import com.fishdoctor.app.menu.domain.Menu;
import com.fishdoctor.app.menu.domain.services.MenuService;
import org.springframework.stereotype.Service;

@Service
public class SpringWrapperMenuService {
    private MenuService menuService;

    public SpringWrapperMenuService() {
        this.menuService = new MenuService();
    }

    public Menu getMenu() {
        return menuService.getMenu();
    }
}
