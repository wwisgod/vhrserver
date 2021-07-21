package org.ww.vhrserver.mapper;

import org.ww.vhrserver.model.Department;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}