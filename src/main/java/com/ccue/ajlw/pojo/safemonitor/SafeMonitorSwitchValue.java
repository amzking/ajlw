package com.ccue.ajlw.pojo.safemonitor;

import com.ccue.ajlw.pojo.BasePOJO;

import java.io.Serializable;

public class SafeMonitorSwitchValue extends BasePOJO implements Serializable {
    /**
     * 矿井编号
     */
    protected String mineNum = "";

    /**
     * 测点类型名称
     */
    protected String sensorTypeName = "";

    /**
     * 数据类型
     */
    protected String dataType = "";

    /**
     * 分站编号
     */
    protected  String stationNum = "";

    /**
     * 测点编号
     */
    protected  String sensorNum = "";

    /**
     * 状态值{故障或未知，开，停 (2/1/0) }
     */
    protected  String realData = "";

    /**
     * 状态变化时刻
     */
    protected  String changeTime = "";

    public String getMineNum() {
        return mineNum;
    }

    public void setMineNum(String mineNum) {
        this.mineNum = mineNum;
    }

    public String getSensorTypeName() {
        return sensorTypeName;
    }

    public void setSensorTypeName(String sensorTypeName) {
        this.sensorTypeName = sensorTypeName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getStationNum() {
        return stationNum;
    }

    public void setStationNum(String stationNum) {
        this.stationNum = stationNum;
    }

    public String getSensorNum() {
        return sensorNum;
    }

    public void setSensorNum(String sensorNum) {
        this.sensorNum = sensorNum;
    }

    public String getRealData() {
        return realData;
    }

    public void setRealData(String realData) {
        this.realData = realData;
    }

    public String getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(String changeTime) {
        this.changeTime = changeTime;
    }
}
