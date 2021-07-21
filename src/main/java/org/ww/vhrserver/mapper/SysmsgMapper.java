package org.ww.vhrserver.mapper;

import org.ww.vhrserver.model.Sysmsg;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public interface SysmsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sysmsg record);

    int insertSelective(Sysmsg record);

    Sysmsg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sysmsg record);

    int updateByPrimaryKey(Sysmsg record);
}