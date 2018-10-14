package com.fishdoctor.app.menu.adapters.dtos;

import java.util.List;

public class MenuNode {
    private String id;
    private String title;
    private List<MenuNode> menuNodes;

    public MenuNode(String id, String title, List<MenuNode> menuNodes) {
        this.id = id;
        this.title = title;
        this.menuNodes = menuNodes;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<MenuNode> getMenuNodes() {
        return menuNodes;
    }
}
