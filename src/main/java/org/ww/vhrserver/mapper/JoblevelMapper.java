package org.ww.vhrserver.mapper;

import org.ww.vhrserver.model.Joblevel;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public interface JoblevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Joblevel record);

    int insertSelective(Joblevel record);

    Joblevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Joblevel record);

    int updateByPrimaryKey(Joblevel record);
}