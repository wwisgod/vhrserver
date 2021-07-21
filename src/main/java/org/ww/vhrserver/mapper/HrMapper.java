package org.ww.vhrserver.mapper;

import org.ww.vhrserver.model.Hr;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public interface HrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hr record);

    int insertSelective(Hr record);

    Hr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hr record);

    int updateByPrimaryKey(Hr record);

    Hr loadUserByUsername(String username);
}