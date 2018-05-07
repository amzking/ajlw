package com.ccue.ajlw.pojo.person;

import com.ccue.ajlw.pojo.BasePOJO;

import java.io.Serializable;
import java.util.Date;

/**
 * 人员区域POJO类，国家标准
 */
public class PersonArea extends BasePOJO implements Serializable{

    /**
     * 煤矿编码
     */
    private String mineNum;

    /**
     * 区域类型
     */
    private String areaType;

    /**
     * 区域编码
     */
    private String areaNum;

    /**
     * 区域核定人数
     */
    private String appPersons;

    /**
     * 区域名称
     */
    private String areaName;

    /**
     * 创建时间
     */
    private Date updateTime;

    public String getMineNum() {
        return mineNum;
    }

    public void setMineNum(String mineNum) {
        this.mineNum = mineNum;
    }

    public String getAreaType() {
        return areaType;
    }

    public void setAreaType(String areaType) {
        this.areaType = areaType;
    }

    public String getAreaNum() {
        return areaNum;
    }

    public void setAreaNum(String areaNum) {
        this.areaNum = areaNum;
    }

    public String getAppPersons() {
        return appPersons;
    }

    public void setAppPersons(String appPersons) {
        this.appPersons = appPersons;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
