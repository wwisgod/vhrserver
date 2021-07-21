package org.ww.vhrserver.mapper;

import org.ww.vhrserver.model.Menu;

import java.util.List;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public interface MenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    List<Menu> getMenusByHrid(Integer hrid);

    List<Menu> getAllMenuWithRoles();
}