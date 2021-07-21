package org.ww.vhrserver.mapper;

import org.ww.vhrserver.model.FlywaySchemaHistory;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public interface FlywaySchemaHistoryMapper {
    int deleteByPrimaryKey(Integer installedRank);

    int insert(FlywaySchemaHistory record);

    int insertSelective(FlywaySchemaHistory record);

    FlywaySchemaHistory selectByPrimaryKey(Integer installedRank);

    int updateByPrimaryKeySelective(FlywaySchemaHistory record);

    int updateByPrimaryKey(FlywaySchemaHistory record);
}