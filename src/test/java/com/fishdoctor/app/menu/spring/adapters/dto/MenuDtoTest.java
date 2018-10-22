package com.fishdoctor.app.menu.spring.adapters.dto;

import com.fishdoctor.app.menu.domain.Menu;
import com.fishdoctor.app.menu.domain.MenuNode;
import com.fishdoctor.app.menu.spring.adapters.dto.fixtures.MenuFixture;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MenuDtoTest {
    @Test
    public void testMenuDtoMapping() {

        MenuDto menuDto = MenuDtoFactory.createFrom(MenuFixture.TEST_MENU);

        assertEquals(MenuFixture.TEST_MENU.getId(), menuDto.getMenuId());

        testMenuTree(menuDto.getHeadNode(), MenuFixture.TEST_MENU.getHeadNode());
    }

    private void testMenuTree(MenuNodeDto dtoHeadNode, MenuNode menuHeadNode) {
        assertEquals(menuHeadNode.getId(), dtoHeadNode.getMenuNodeId());
        assertEquals(menuHeadNode.getTitle(), dtoHeadNode.getTitle());
        if (menuHeadNode.hasMoreSubNodes()) {
            List<MenuNode> menuNodes = menuHeadNode.getMenuNodes();
            for (int i = 0; i < menuNodes.size(); ++i) {
                testMenuTree(dtoHeadNode.getMenuNodes().get(i), menuNodes.get(i));
            }
        }
    }

}