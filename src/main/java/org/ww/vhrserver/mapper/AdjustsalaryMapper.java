package org.ww.vhrserver.mapper;

import org.ww.vhrserver.model.Adjustsalary;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public interface AdjustsalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Adjustsalary record);

    int insertSelective(Adjustsalary record);

    Adjustsalary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Adjustsalary record);

    int updateByPrimaryKey(Adjustsalary record);
}