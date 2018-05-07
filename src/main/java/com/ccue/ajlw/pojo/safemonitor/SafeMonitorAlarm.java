package com.ccue.ajlw.pojo.safemonitor;

import com.ccue.ajlw.pojo.BasePOJO;

import java.io.Serializable;

public class SafeMonitorAlarm extends BasePOJO implements Serializable {
    /**
     * 分站编号
     */
    protected  String stationNum = "";

    /**
     * 测点编号
     */
    private String sensorNum = "";

    /**
     * 数据类型
     */
    private String dataType = "";

    /**
     * 传感器类型名称
     */
    private String sensorTypeName = "";

    /**
     * 异常类型
     */
    private String warnType = "";

    /**
     * 测点当前值，如无信号或故障等，用空表示
     */
    private String currentValue = "";

    /**
     * 报警门限
     */
    private String alarmBarrier = "";

    /**
     * 解报门限
     */
    private String alarmOffBarrier = "";

    /**
     * 异常起始时刻
     */
    private String alarmStartTime = "";

    /**
     * 异常结束时刻
     */
    private String alarmEndTime = "";

    /**
     * 异常时刻最大值
     */
    private String alarmMaxValue = "";

    /**
     * 最大值时刻
     */
    private String alarmMaxValueTime = "";

    /**
     * 最小值时刻
     */
    private String alarmMinValueTime = "";

    /**
     * 异常期间平均值
     */
    private String alarmAvgValue = "";

    /**
     * 异常期最小值
     */
    private String alarmMinValue = "";

    /**
     * 异常原因
     */
    private String cause = "";

    /**
     * 措施
     */
    private String processMethod = "";

    /**
     * 录入时间
     */
    private String fillTime = "";

    /**
     * 录入人
     */
    private String itemCreator = "";

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

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getSensorTypeName() {
        return sensorTypeName;
    }

    public void setSensorTypeName(String sensorTypeName) {
        this.sensorTypeName = sensorTypeName;
    }

    public String getWarnType() {
        return warnType;
    }

    public void setWarnType(String warnType) {
        this.warnType = warnType;
    }

    public String getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
    }

    public String getAlarmBarrier() {
        return alarmBarrier;
    }

    public void setAlarmBarrier(String alarmBarrier) {
        this.alarmBarrier = alarmBarrier;
    }

    public String getAlarmOffBarrier() {
        return alarmOffBarrier;
    }

    public void setAlarmOffBarrier(String alarmOffBarrier) {
        this.alarmOffBarrier = alarmOffBarrier;
    }

    public String getAlarmStartTime() {
        return alarmStartTime;
    }

    public void setAlarmStartTime(String alarmStartTime) {
        this.alarmStartTime = alarmStartTime;
    }

    public String getAlarmEndTime() {
        return alarmEndTime;
    }

    public void setAlarmEndTime(String alarmEndTime) {
        this.alarmEndTime = alarmEndTime;
    }

    public String getAlarmMaxValue() {
        return alarmMaxValue;
    }

    public void setAlarmMaxValue(String alarmMaxValue) {
        this.alarmMaxValue = alarmMaxValue;
    }

    public String getAlarmMaxValueTime() {
        return alarmMaxValueTime;
    }

    public void setAlarmMaxValueTime(String alarmMaxValueTime) {
        this.alarmMaxValueTime = alarmMaxValueTime;
    }

    public String getAlarmMinValueTime() {
        return alarmMinValueTime;
    }

    public void setAlarmMinValueTime(String alarmMinValueTime) {
        this.alarmMinValueTime = alarmMinValueTime;
    }

    public String getAlarmAvgValue() {
        return alarmAvgValue;
    }

    public void setAlarmAvgValue(String alarmAvgValue) {
        this.alarmAvgValue = alarmAvgValue;
    }

    public String getAlarmMinValue() {
        return alarmMinValue;
    }

    public void setAlarmMinValue(String alarmMinValue) {
        this.alarmMinValue = alarmMinValue;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getProcessMethod() {
        return processMethod;
    }

    public void setProcessMethod(String processMethod) {
        this.processMethod = processMethod;
    }

    public String getFillTime() {
        return fillTime;
    }

    public void setFillTime(String fillTime) {
        this.fillTime = fillTime;
    }

    public String getItemCreator() {
        return itemCreator;
    }

    public void setItemCreator(String itemCreator) {
        this.itemCreator = itemCreator;
    }
}
