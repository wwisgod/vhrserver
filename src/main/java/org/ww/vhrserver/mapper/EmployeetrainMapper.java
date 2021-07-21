package org.ww.vhrserver.mapper;

import org.ww.vhrserver.model.Employeetrain;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public interface EmployeetrainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeetrain record);

    int insertSelective(Employeetrain record);

    Employeetrain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employeetrain record);

    int updateByPrimaryKey(Employeetrain record);
}