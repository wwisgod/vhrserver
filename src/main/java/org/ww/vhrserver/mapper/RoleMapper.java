package org.ww.vhrserver.mapper;

import org.ww.vhrserver.model.Role;

import java.util.List;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    List<Role> getRolesByHrId(Integer id);

}