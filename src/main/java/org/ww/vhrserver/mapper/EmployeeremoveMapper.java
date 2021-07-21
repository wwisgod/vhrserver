package org.ww.vhrserver.mapper;

import org.ww.vhrserver.model.Employeeremove;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public interface EmployeeremoveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeeremove record);

    int insertSelective(Employeeremove record);

    Employeeremove selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employeeremove record);

    int updateByPrimaryKey(Employeeremove record);
}