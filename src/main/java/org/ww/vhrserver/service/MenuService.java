package org.ww.vhrserver.service;

import org.ww.vhrserver.model.Menu;

import java.util.List;

/**
 * @Author ww
 * @Date 2021/7/16 16:27
 */
public interface MenuService {
    /**
     * 根据hrid获取菜单权限
     * @return Menus
     */
    List<Menu> getMenusByHrid();

    List<Menu> getAllMenuWithRoles();
}
