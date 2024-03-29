package org.ww.vhrserver.model;

import java.util.Date;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public class Adjustsalary {
    private Integer id;

    private Integer eid;

    /**
    * 调薪日期
    */
    private Date asdate;

    /**
    * 调前薪资
    */
    private Integer beforesalary;

    /**
    * 调后薪资
    */
    private Integer aftersalary;

    /**
    * 调薪原因
    */
    private String reason;

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

    public Date getAsdate() {
        return asdate;
    }

    public void setAsdate(Date asdate) {
        this.asdate = asdate;
    }

    public Integer getBeforesalary() {
        return beforesalary;
    }

    public void setBeforesalary(Integer beforesalary) {
        this.beforesalary = beforesalary;
    }

    public Integer getAftersalary() {
        return aftersalary;
    }

    public void setAftersalary(Integer aftersalary) {
        this.aftersalary = aftersalary;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}