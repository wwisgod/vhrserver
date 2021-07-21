package org.ww.vhrserver.mapper;

import org.ww.vhrserver.model.Employeeec;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public interface EmployeeecMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeeec record);

    int insertSelective(Employeeec record);

    Employeeec selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employeeec record);

    int updateByPrimaryKey(Employeeec record);
}