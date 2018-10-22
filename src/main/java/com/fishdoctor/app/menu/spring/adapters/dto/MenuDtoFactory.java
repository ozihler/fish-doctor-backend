package com.fishdoctor.app.menu.spring.adapters.dto;

import com.fishdoctor.app.menu.domain.Menu;
import com.fishdoctor.app.menu.spring.adapters.SpringMenuResource;
import org.springframework.hateoas.Link;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

public class MenuDtoFactory {
    public static MenuDto from(Menu menu) {
        MenuDto menuDto = new MenuDto(menu.getId(), MenuNodeDtoFactory.from(menu.getHeadNode()));
        menuDto.add(selfLink());
        return menuDto;
    }

    private static Link selfLink() {
        return linkTo(methodOn(SpringMenuResource.class).menu()).withSelfRel();
    }
}
