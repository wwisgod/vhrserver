package org.ww.vhrserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ww.vhrserver.model.Menu;
import org.ww.vhrserver.service.MenuService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author ww
 * @Date 2021/7/16 16:23
 */
@RestController
public class MenuController {
    @Resource
    MenuService menuService;

    @GetMapping("/menu")
    public List<Menu> getMenusByHrid() {
        return menuService.getMenusByHrid();
    }
}
