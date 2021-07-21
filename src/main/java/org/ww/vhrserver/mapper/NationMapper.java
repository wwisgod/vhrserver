package org.ww.vhrserver.mapper;

import org.ww.vhrserver.model.Nation;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public interface NationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Nation record);

    int insertSelective(Nation record);

    Nation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Nation record);

    int updateByPrimaryKey(Nation record);
}