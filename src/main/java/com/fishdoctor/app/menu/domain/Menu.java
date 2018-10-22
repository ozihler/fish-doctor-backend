package com.fishdoctor.app.menu.domain;

public class Menu {
    private String id;
    private MenuNode headNode;

    public Menu(String id, MenuNode headNode) {
        this.id = id;
        this.headNode = headNode;
    }

    public MenuNode getHeadNode() {
        return headNode;
    }

    public String getId() {
        return id;
    }
}
