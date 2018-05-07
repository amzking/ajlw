package com.ccue.ajlw.pojo.safemonitor;

import com.ccue.ajlw.pojo.BasePOJO;

import java.io.Serializable;

/**
 * 累积量
 */
public class SafeMonitorAccumulativeValue extends BasePOJO implements Serializable{
    /**
     * 测点编号
     */
    protected String sensorNum = "";
    /**
     * 当前班次
     */
    protected String currentShift = "";
    /**
     * 第一班值
     */
    protected String firstShiftValue = "";
    /**
     * 第二班值
     */
    protected String secondShiftValue = "";
    /**
     * 第三班值
     */
    protected String thirdShiftValue = "";
    /**
     * 第四班值
     */
    protected String forthShiftValue = "";

}
