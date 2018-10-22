package com.fishdoctor.app.menu.spring.adapters;

import com.fishdoctor.app.menu.domain.Menu;
import com.fishdoctor.app.menu.spring.adapters.dto.MenuDto;
import com.fishdoctor.app.menu.spring.adapters.dto.MenuDtoFactory;
import com.fishdoctor.app.menu.spring.services.SpringWrapperMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/menu")
public class SpringMenuResource {

    @Autowired
    private SpringWrapperMenuService springWrapperMenuService;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public ResponseEntity<MenuDto> menu() {
        Menu menu = springWrapperMenuService.getMenu();

        return ResponseEntity
                .ok(MenuDtoFactory.from(menu));
    }
}
