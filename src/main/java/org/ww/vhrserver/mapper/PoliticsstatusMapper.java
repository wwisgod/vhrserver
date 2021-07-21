package org.ww.vhrserver.mapper;

import org.ww.vhrserver.model.Politicsstatus;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public interface PoliticsstatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Politicsstatus record);

    int insertSelective(Politicsstatus record);

    Politicsstatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Politicsstatus record);

    int updateByPrimaryKey(Politicsstatus record);
}