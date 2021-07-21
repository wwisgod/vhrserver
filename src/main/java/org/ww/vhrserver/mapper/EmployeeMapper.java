package org.ww.vhrserver.mapper;

import org.ww.vhrserver.model.Employee;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}