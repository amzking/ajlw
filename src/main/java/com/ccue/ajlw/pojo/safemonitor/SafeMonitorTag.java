package com.ccue.ajlw.pojo.safemonitor;

import com.ccue.ajlw.pojo.BasePOJO;

import java.io.Serializable;

public class SafeMonitorTag extends BasePOJO implements Serializable {
    /**
     * 矿井编号
     */
    protected String mineNum = "";

    /**
     * 测点编号
     */
    protected  String sensorNum = "";

    /**
     * 分站编号
     */
    protected  String stationNum = "";

    /**
     * 测点名称
     */
    protected String sensorName = "";

    /**
     * 测点所属区域名称(可为空， 有则必须填写)
     */
    protected String sensorArea = "";

    /**
     * 传感器所在区域的位置编码
     */
    protected String addressCode = "";

    /**
     * 单位
     */
    protected  String tagUnit = "";

    /**
     * 量程上限(高量程)
     */
    protected  String rangeMax = "";

    /**
     * 量程下限(低量程)
     */
    protected  String rangeMin = "";

    /**
     * 报警上限
     */
    protected  String alarmMax = "";

    /**
     * 上限解报门限
     */
    protected  String alarmOffMax = "";

    /**
     * 报警下限
     */
    protected  String alarmMin = "";

    /**
     * 下限解报门限
     */
    protected  String alarmOffMin = "";

    /**
     * 上限断电门限
     */
    protected  String cutoffValueMax = "";

    /**
     * 上限复位值
     */
    protected  String resetValueMax = "";

    /**
     * 下限断电门限
     */
    protected  String cutoffValueMin = "";

    /**
     * 下限复位值
     */
    protected  String resetValueMin = "";

    /**
     * 传感器关联关系
     */
    protected  String sensorRelationship = "";

    /**
     * 测点类型名称
     */
    protected String sensorTypeName = "";

    /**
     * 数据类型
     */
    protected String dataType = "";

    /**
     * 报警类型
     */
    protected String tagState = "";

    public String getMineNum() {
        return mineNum;
    }

    public void setMineNum(String mineNum) {
        this.mineNum = mineNum;
    }

    public String getSensorNum() {
        return sensorNum;
    }

    public void setSensorNum(String sensorNum) {
        this.sensorNum = sensorNum;
    }

    public String getStationNum() {
        return stationNum;
    }

    public void setStationNum(String stationNum) {
        this.stationNum = stationNum;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public String getSensorArea() {
        return sensorArea;
    }

    public void setSensorArea(String sensorArea) {
        this.sensorArea = sensorArea;
    }

    public String getAddressCode() {
        return addressCode;
    }

    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
    }

    public String getTagUnit() {
        return tagUnit;
    }

    public void setTagUnit(String tagUnit) {
        this.tagUnit = tagUnit;
    }

    public String getRangeMax() {
        return rangeMax;
    }

    public void setRangeMax(String rangeMax) {
        this.rangeMax = rangeMax;
    }

    public String getRangeMin() {
        return rangeMin;
    }

    public void setRangeMin(String rangeMin) {
        this.rangeMin = rangeMin;
    }

    public String getAlarmMax() {
        return alarmMax;
    }

    public void setAlarmMax(String alarmMax) {
        this.alarmMax = alarmMax;
    }

    public String getAlarmOffMax() {
        return alarmOffMax;
    }

    public void setAlarmOffMax(String alarmOffMax) {
        this.alarmOffMax = alarmOffMax;
    }

    public String getAlarmMin() {
        return alarmMin;
    }

    public void setAlarmMin(String alarmMin) {
        this.alarmMin = alarmMin;
    }

    public String getAlarmOffMin() {
        return alarmOffMin;
    }

    public void setAlarmOffMin(String alarmOffMin) {
        this.alarmOffMin = alarmOffMin;
    }

    public String getCutoffValueMax() {
        return cutoffValueMax;
    }

    public void setCutoffValueMax(String cutoffValueMax) {
        this.cutoffValueMax = cutoffValueMax;
    }

    public String getResetValueMax() {
        return resetValueMax;
    }

    public void setResetValueMax(String resetValueMax) {
        this.resetValueMax = resetValueMax;
    }

    public String getCutoffValueMin() {
        return cutoffValueMin;
    }

    public void setCutoffValueMin(String cutoffValueMin) {
        this.cutoffValueMin = cutoffValueMin;
    }

    public String getResetValueMin() {
        return resetValueMin;
    }

    public void setResetValueMin(String resetValueMin) {
        this.resetValueMin = resetValueMin;
    }

    public String getSensorRelationship() {
        return sensorRelationship;
    }

    public void setSensorRelationship(String sensorRelationship) {
        this.sensorRelationship = sensorRelationship;
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

    public String getTagState() {
        return tagState;
    }

    public void setTagState(String tagState) {
        this.tagState = tagState;
    }
}
