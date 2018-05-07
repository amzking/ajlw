package com.ccue.ajlw.pojo.person;

import com.ccue.ajlw.pojo.BasePOJO;

import java.io.Serializable;
import java.util.Date;

public class PersonOverman extends BasePOJO implements Serializable {

    /**
     * 矿编号
     */
    private String mineNum;

    /**
     * 人员卡编码
     */
    private String cardNum;

    /**
     * 超员类别
     */
    private String overManType;

    /**
     * 定员数
     */
    private String appCount;

    /**
     * 总人数
     */
    private String totalCount;

    /**
     * 区域编码
     */
    private String areaNum;

    /**
     * 区域名称
     */
    private String areaName;

    /**
     * 报警开始时间
     */
    private String alarmStartTime;

    /**
     * 报警结束时间
     */
    private String alarmEndTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
