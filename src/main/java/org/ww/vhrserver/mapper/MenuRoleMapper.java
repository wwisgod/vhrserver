package org.ww.vhrserver.mapper;

import org.ww.vhrserver.model.MenuRole;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public interface MenuRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MenuRole record);

    int insertSelective(MenuRole record);

    MenuRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MenuRole record);

    int updateByPrimaryKey(MenuRole record);
}