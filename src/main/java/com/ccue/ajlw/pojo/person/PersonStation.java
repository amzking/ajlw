package com.ccue.ajlw.pojo.person;

import com.ccue.ajlw.pojo.BasePOJO;

import java.io.Serializable;
import java.util.Date;

/**
 * 人员分站
 */
public class PersonStation extends BasePOJO implements Serializable {

    /**
     * 煤矿编码
     */
    private String mineNum;

    /**
     * 顺序号
     */
    private String sequence;

    /**
     * 类型
     */
    private String stationType;

    /**
     * 分站编码
     */
    private String stationNum;

    /**
     * 分站名称
     */
    private String stationName;

    /**
     * X坐标
     */
    private String positionX;

    /**
     * Y坐标
     */
    private String positionY;

    /**
     * 位置注释
     */
    private String locationRemark;

    /**
     * 更新时间
     */
    private Date updateTime;

    public String getMineNum() {
        return mineNum;
    }

    public void setMineNum(String mineNum) {
        this.mineNum = mineNum;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getStationType() {
        return stationType;
    }

    public void setStationType(String stationType) {
        this.stationType = stationType;
    }

    public String getStationNum() {
        return stationNum;
    }

    public void setStationNum(String stationNum) {
        this.stationNum = stationNum;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getPositionX() {
        return positionX;
    }

    public void setPositionX(String positionX) {
        this.positionX = positionX;
    }

    public String getPositionY() {
        return positionY;
    }

    public void setPositionY(String positionY) {
        this.positionY = positionY;
    }

    public String getLocationRemark() {
        return locationRemark;
    }

    public void setLocationRemark(String locationRemark) {
        this.locationRemark = locationRemark;
    }


}
