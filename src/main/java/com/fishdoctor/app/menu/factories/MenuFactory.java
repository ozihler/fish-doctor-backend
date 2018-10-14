package com.fishdoctor.app.menu.factories;

import com.fishdoctor.app.menu.adapters.dtos.Menu;
import com.fishdoctor.app.menu.adapters.dtos.MenuNode;

import java.util.Arrays;

public class MenuFactory {
    public Menu create() {
        return new Menu("menu",

                new MenuNode(
                        "menu-tree",
                        "Menu Tree",
                        Arrays.asList(
                                new MenuNode("home", "Home", null),
                                new MenuNode("contact", "Contact", null),
                                new MenuNode("galleries", "Galleries",
                                        Arrays.asList(
                                                new MenuNode("gallery1", "Gallery 1", null),
                                                new MenuNode("gallery2", "Gallery 2", null)
                                        )
                                ),
                                new MenuNode("illnesses", "Illnesses", null)
                        )
                )

        );
    }
}
