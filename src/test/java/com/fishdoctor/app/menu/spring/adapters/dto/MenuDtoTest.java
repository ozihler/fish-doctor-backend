package com.fishdoctor.app.menu.spring.adapters.dto;

import com.fishdoctor.app.menu.domain.MenuNode;
import com.fishdoctor.app.menu.spring.adapters.dto.fixtures.MenuFixture;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MenuDtoTest {
    @Test
    public void testMenuDtoMapping() {
        MenuDto menuDto = MenuDtoFactory.from(MenuFixture.TEST_MENU);
        assertHasValidId(menuDto);
        assertHasValidSelfLink(menuDto);
        assertHasValidMenuTree(menuDto.getHeadNode(), MenuFixture.TEST_MENU.getHeadNode());
    }

    private void assertHasValidId(MenuDto menuDto) {
        assertEquals(MenuFixture.TEST_MENU.getId(), menuDto.getMenuId());
    }

    private void assertHasValidSelfLink(MenuDto menuDto) {
        assertTrue(menuDto.getLink("self").getHref().endsWith("/menu/"));
    }

    private void assertHasValidMenuTree(MenuNodeDto dtoHeadNode, MenuNode menuHeadNode) {
        assertEquals(menuHeadNode.getId(), dtoHeadNode.getMenuNodeId());
        assertEquals(menuHeadNode.getTitle(), dtoHeadNode.getTitle());
        if (menuHeadNode.hasMoreSubNodes()) {
            List<MenuNode> menuNodes = menuHeadNode.getMenuNodes();
            for (int i = 0; i < menuNodes.size(); ++i) {
                assertHasValidMenuTree(dtoHeadNode.getMenuNodes().get(i), menuNodes.get(i));
            }
        }
    }

}