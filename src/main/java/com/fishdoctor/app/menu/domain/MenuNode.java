package com.fishdoctor.app.menu.domain;

import java.util.List;
import java.util.Objects;

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

    public   boolean hasMoreSubNodes() {
        return !Objects.isNull(getMenuNodes()) && !getMenuNodes().isEmpty();
    }
}
