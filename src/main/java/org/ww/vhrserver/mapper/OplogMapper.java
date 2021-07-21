package org.ww.vhrserver.mapper;

import org.ww.vhrserver.model.Oplog;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public interface OplogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Oplog record);

    int insertSelective(Oplog record);

    Oplog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Oplog record);

    int updateByPrimaryKey(Oplog record);
}