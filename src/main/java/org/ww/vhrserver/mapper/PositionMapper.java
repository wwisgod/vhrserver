package org.ww.vhrserver.mapper;

import org.ww.vhrserver.model.Position;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public interface PositionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);
}