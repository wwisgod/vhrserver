package org.ww.vhrserver.model;

import java.util.Date;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public class Appraise {
    private Integer id;

    private Integer eid;

    /**
    * 考评日期
    */
    private Date appdate;

    /**
    * 考评结果
    */
    private String appresult;

    /**
    * 考评内容
    */
    private String appcontent;

    /**
    * 备注
    */
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Date getAppdate() {
        return appdate;
    }

    public void setAppdate(Date appdate) {
        this.appdate = appdate;
    }

    public String getAppresult() {
        return appresult;
    }

    public void setAppresult(String appresult) {
        this.appresult = appresult;
    }

    public String getAppcontent() {
        return appcontent;
    }

    public void setAppcontent(String appcontent) {
        this.appcontent = appcontent;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}