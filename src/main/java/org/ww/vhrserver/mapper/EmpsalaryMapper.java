package org.ww.vhrserver.mapper;

import org.ww.vhrserver.model.Empsalary;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public interface EmpsalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Empsalary record);

    int insertSelective(Empsalary record);

    Empsalary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Empsalary record);

    int updateByPrimaryKey(Empsalary record);
}