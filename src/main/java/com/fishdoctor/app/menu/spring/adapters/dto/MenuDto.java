package com.fishdoctor.app.menu.spring.adapters.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.ResourceSupport;

public class MenuDto extends ResourceSupport {
    private final String menuId;
    private final MenuNodeDto headNode;

    public MenuDto(@JsonProperty("menuId") String menuId,
                   @JsonProperty("headNode") MenuNodeDto headNode) {
        this.menuId = menuId;
        this.headNode = headNode;
    }

    public String getMenuId() {
        return menuId;
    }

    public MenuNodeDto getHeadNode() {
        return headNode;
    }
}
