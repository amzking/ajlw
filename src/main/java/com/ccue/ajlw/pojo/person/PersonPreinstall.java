package com.ccue.ajlw.pojo.person;

import com.ccue.ajlw.pojo.BasePOJO;

import java.io.Serializable;

public class PersonPreinstall extends BasePOJO implements Serializable {
    /**
     * 人员卡编码
     */
    protected String cardNum;
    /**
     * 人员姓名
     */
    protected String personName;
    /**
     * 分站时间集合
     */
    protected String timeCollection;

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

    public String getTimeCollection() {
        return timeCollection;
    }

    public void setTimeCollection(String timeCollection) {
        this.timeCollection = timeCollection;
    }
}
