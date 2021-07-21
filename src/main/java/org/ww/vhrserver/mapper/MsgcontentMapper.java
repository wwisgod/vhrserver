package org.ww.vhrserver.mapper;

import org.ww.vhrserver.model.Msgcontent;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public interface MsgcontentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Msgcontent record);

    int insertSelective(Msgcontent record);

    Msgcontent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Msgcontent record);

    int updateByPrimaryKey(Msgcontent record);
}