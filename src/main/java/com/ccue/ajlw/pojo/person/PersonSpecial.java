package com.ccue.ajlw.pojo.person;

import com.ccue.ajlw.pojo.BasePOJO;

import java.io.Serializable;

public class PersonSpecial extends BasePOJO implements Serializable {
    /**
     * 人员卡编码
     */
    protected String cardNum;
    /**
     * 人员姓名
     */
    protected String personName;
    /**
     * 应到分站编码
     */
    protected String stationNum;
    /**
     * 应到时间
     */
    protected String plainTime;
    /**
     * 状态
     */
    protected String status;
    /**
     * 实到时刻
     */
    protected String actualTime;

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getStationNum() {
        return stationNum;
    }

    public void setStationNum(String stationNum) {
        this.stationNum = stationNum;
    }

    public String getPlainTime() {
        return plainTime;
    }

    public void setPlainTime(String plainTime) {
        this.plainTime = plainTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getActualTime() {
        return actualTime;
    }

    public void setActualTime(String actualTime) {
        this.actualTime = actualTime;
    }
}
