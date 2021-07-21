package org.ww.vhrserver.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.ww.vhrserver.mapper.MenuMapper;
import org.ww.vhrserver.model.Hr;
import org.ww.vhrserver.model.Menu;
import org.ww.vhrserver.service.MenuService;

import java.util.List;

/**
 * @Author ww
 * @Date 2021/7/16 16:29
 */
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuMapper menuMapper;

    @Override
    public List<Menu> getMenusByHrid() {
        Hr hr = (Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return menuMapper.getMenusByHrid(hr.getId());
    }

    @Override
    public List<Menu> getAllMenuWithRoles() {
        return menuMapper.getAllMenuWithRoles();
    }
}
