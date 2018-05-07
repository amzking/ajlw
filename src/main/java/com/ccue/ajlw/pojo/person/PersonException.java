package com.ccue.ajlw.pojo.person;

import com.ccue.ajlw.pojo.BasePOJO;

import java.io.Serializable;

public class PersonException extends BasePOJO implements Serializable {
    /**
     * 状态
     */
    protected String status;
    /**
     * 发生异常时间
     */
    protected String startTime;
    /**
     * 异常结束时间
     */
    protected String endTime;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
