package com.ccue.ajlw.pojo.person;

import com.ccue.ajlw.pojo.BasePOJO;

import java.io.Serializable;
import java.util.Date;

public class PersonCall extends BasePOJO implements Serializable {

    /**
     * 矿编号
     */
    private String mineNum;

    /**
     * 人员卡编号
     */
    private String cardNum;

    /**
     * 人员名称
     */
    private String personName;

    /**
     * 入井时刻
     */
    private String inMineTime;

    /**
     * 报警开始时间
     */
    private String alarmStartTime;

    /**
     * 报警结束时间
     */
    private String alarmEndTime;

    /**
     * 区域编码
     */
    private String areaNum;

    /**
     * 进入当前区域时刻
     */
    private String inAreaTime;

    /**
     * 分站编码
     */
    private String stationNum;

    /**
     * 分站类型
     */
    private String stationType;

    /**
     * 进入分站时刻
     */
    private String inStationTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
