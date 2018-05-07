package com.ccue.ajlw.pojo.safemonitor;

import com.ccue.ajlw.pojo.BasePOJO;

import java.io.Serializable;

public class SafeMonitorValueInFiveMin extends BasePOJO implements Serializable {
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
     * 5 分钟内平均值
     */
    protected  String avgValue = "";

    /**
     * 5 分钟内最大值
     */
    protected  String maxValue = "";

    /**
     * 5 分钟内最大值时刻
     */
    protected  String maxTime = "";

    /**
     * 5 分钟内最小值
     */
    protected  String minValue = "";

    /**
     * 5 分钟内最小值时刻
     */
    protected  String minTime = "";

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

    public String getAvgValue() {
        return avgValue;
    }

    public void setAvgValue(String avgValue) {
        this.avgValue = avgValue;
    }

    public String getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    public String getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(String maxTime) {
        this.maxTime = maxTime;
    }

    public String getMinValue() {
        return minValue;
    }

    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    public String getMinTime() {
        return minTime;
    }

    public void setMinTime(String minTime) {
        this.minTime = minTime;
    }
}
