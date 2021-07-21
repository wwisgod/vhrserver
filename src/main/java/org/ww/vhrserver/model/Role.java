package org.ww.vhrserver.model;

/**
 * @Author ww
 * @Date 2021/7/15 10:56
 */
public class Role {
    private Integer id;

    private String name;

    /**
    * 角色名称
    */
    private String namezh;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamezh() {
        return namezh;
    }

    public void setNamezh(String namezh) {
        this.namezh = namezh;
    }
}