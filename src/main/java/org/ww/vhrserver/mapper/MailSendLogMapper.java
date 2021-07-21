package org.ww.vhrserver.mapper;

import org.ww.vhrserver.model.MailSendLog;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public interface MailSendLogMapper {
    int insert(MailSendLog record);

    int insertSelective(MailSendLog record);
}