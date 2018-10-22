package com.fishdoctor.app.menu.spring.adapters;

import com.fishdoctor.app.menu.domain.Menu;
import com.fishdoctor.app.menu.spring.adapters.dto.MenuDto;
import com.fishdoctor.app.menu.spring.adapters.dto.MenuDtoFactory;
import com.fishdoctor.app.menu.spring.services.SpringWrapperMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin("http://localhost:4200")
@Controller
public class SpringMenuResource {

    @Autowired
    private SpringWrapperMenuService springWrapperMenuService;

    @RequestMapping(path = "/menu", method = RequestMethod.GET)
    public ResponseEntity<MenuDto> menu() {
        Menu menu = springWrapperMenuService.getMenu();

        return ResponseEntity
                .ok(MenuDtoFactory.createFrom(menu));
    }
}
