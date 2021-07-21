package org.ww.vhrserver.mapper;

import org.ww.vhrserver.model.Salary;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public interface SalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Salary record);

    int insertSelective(Salary record);

    Salary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Salary record);

    int updateByPrimaryKey(Salary record);
}