package com.fishdoctor.app.menu.spring.adapters.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.ResourceSupport;

import java.util.List;

public class MenuNodeDto extends ResourceSupport {
    private final String menuNodeId;
    private String title;
    private final List<MenuNodeDto> menuNodes;

    public MenuNodeDto(@JsonProperty("menuNodeId") String menuNodeId,
                       @JsonProperty("title") String title,
                       @JsonProperty("menuNodes") List<MenuNodeDto> menuNodes) {
        this.menuNodeId = menuNodeId;
        this.title = title;
        this.menuNodes = menuNodes;
    }

    public String getMenuNodeId() {
        return menuNodeId;
    }

    public List<MenuNodeDto> getMenuNodes() {
        return menuNodes;
    }

    public String getTitle() {
        return this.title;
    }
}
