package org.ww.vhrserver.mapper;

import org.ww.vhrserver.model.HrRole;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public interface HrRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HrRole record);

    int insertSelective(HrRole record);

    HrRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HrRole record);

    int updateByPrimaryKey(HrRole record);
}