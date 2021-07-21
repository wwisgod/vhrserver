package org.ww.vhrserver.mapper;

import org.ww.vhrserver.model.Appraise;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public interface AppraiseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Appraise record);

    int insertSelective(Appraise record);

    Appraise selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Appraise record);

    int updateByPrimaryKey(Appraise record);
}