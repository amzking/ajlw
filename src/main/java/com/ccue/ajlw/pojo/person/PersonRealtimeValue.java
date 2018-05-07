package com.ccue.ajlw.pojo.person;

import com.ccue.ajlw.pojo.BasePOJO;

import java.io.Serializable;
import java.util.Date;

public class PersonRealtimeValue extends BasePOJO implements Serializable {

    /**
     * 矿编号
     */
    private String mineNum;

    /**
     * 人员卡号
     */
    private String cardNum;

    /**
     * 姓名
     */
    private String personName;

    /**
     * 出入井标志位
     */
    private String inOutflag;

    /**
     * 入井时刻
     */
    private String inMineTime;

    /**
     * 出井时刻
     */
    private String outMineTime;

    /**
     * 区域编码
     */
    private String areaNum;

    /**
     *  进入当前区域时刻
     */
    private String inAreaTime;

    /**
     *  分站编码
     */
    private String stationNum;

    /**
     *  进入当前所处分站时刻
     */
    private String inStationTime;

    /**
     * 行进轨迹分站时间集合
     */
    private String walkingTrace;

    /**
     * 数据更新时间
     */
    private Date updateTime;


    public String getMineNum() {
        return mineNum;
    }

    public void setMineNum(String mineNum) {
        this.mineNum = mineNum;
    }

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

    public String getInOutflag() {
        return inOutflag;
    }

    public void setInOutflag(String inOutflag) {
        this.inOutflag = inOutflag;
    }

    public String getInMineTime() {
        return inMineTime;
    }

    public void setInMineTime(String inMineTime) {
        this.inMineTime = inMineTime;
    }

    public String getOutMineTime() {
        return outMineTime;
    }

    public void setOutMineTime(String outMineTime) {
        this.outMineTime = outMineTime;
    }

    public String getAreaNum() {
        return areaNum;
    }

    public void setAreaNum(String areaNum) {
        this.areaNum = areaNum;
    }

    public String getInAreaTime() {
        return inAreaTime;
    }

    public void setInAreaTime(String inAreaTime) {
        this.inAreaTime = inAreaTime;
    }

    public String getStationNum() {
        return stationNum;
    }

    public void setStationNum(String stationNum) {
        this.stationNum = stationNum;
    }


    public String getInStationTime() {
        return inStationTime;
    }

    public void setInStationTime(String inStationTime) {
        this.inStationTime = inStationTime;
    }

    public String getWalkingTrace() {
        return walkingTrace;
    }

    public void setWalkingTrace(String walkingTrace) {
        this.walkingTrace = walkingTrace;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
