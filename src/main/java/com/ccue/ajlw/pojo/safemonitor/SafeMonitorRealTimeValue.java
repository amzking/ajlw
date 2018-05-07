package com.ccue.ajlw.pojo.safemonitor;

import com.ccue.ajlw.pojo.BasePOJO;

import java.io.Serializable;

public class SafeMonitorRealTimeValue extends BasePOJO implements Serializable {
    /**
     * 测点编号
     */
    protected  String sensorNum = "";
    /**
     * 数值
     */
    protected  String value = "";
    /**
     * 状态
     */
    protected  String status = "";

    public String getSensorNum() {
        return sensorNum;
    }

    public void setSensorNum(String sensorNum) {
        this.sensorNum = sensorNum;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
