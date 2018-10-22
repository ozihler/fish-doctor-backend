package com.fishdoctor.app.menu.spring.adapters.dto;

import com.fishdoctor.app.menu.domain.MenuNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MenuNodeDtoFactory {
    public static MenuNodeDto from(MenuNode headNode) {
        MenuNodeDto menuNodeDto = new MenuNodeDto(headNode.getId(), headNode.getTitle(), subMenuTree(headNode));

        return menuNodeDto;
    }

    public static List<MenuNodeDto> subMenuTree(MenuNode node) {
        if (!node.hasMoreSubNodes()) {
            return new ArrayList<>();
        }
        return node.getMenuNodes()
                .stream()
                .map(MenuNodeDtoFactory::from)
                .collect(Collectors.toList());
    }
}
