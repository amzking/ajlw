package com.ccue.ajlw.parser.zmpojo.person;

import java.io.Serializable;
import java.util.Date;

/**
 * 人员系统工作异常
 * @author chen
 *
 */
public class PersonExceptionZM implements Serializable {

	/**
	 * 主键id
	 */
	private String id;

	/**
	 * 煤矿编号
	 */
	private String mineNum;

	/**
	 * 煤矿名称
	 */
	private String mineName;

	/**
	 * 文件生成时刻
	 */	
	private Date fileCreatedTime;

	/**
	 * 状态
	 */	
	private String status;

	/**
	 * 发生异常时间
	 */	
	private Date occurExceptionTime;

	/**
	 * 异常结束时间
	 */	
	private Date endExceptionTime;
	
	/**
	 * 数据更新时间
	 * 
	 * mongoDB存入时间为格林威治时间
	 * 北京时间所属+8时区
	 * 计算机设置为北京时间后，所取得的时间系统会自动进行时间的补偿
	 */	
	private Date updateTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMineNum() {
		return mineNum;
	}

	public void setMineNum(String mineNum) {
		this.mineNum = mineNum;
	}

	public String getMineName() {
		return mineName;
	}

	public void setMineName(String mineName) {
		this.mineName = mineName;
	}

	public Date getFileCreatedTime() {
		return fileCreatedTime;
	}

	public void setFileCreatedTime(Date fileCreatedTime) {
		this.fileCreatedTime = fileCreatedTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getOccurExceptionTime() {
		return occurExceptionTime;
	}

	public void setOccurExceptionTime(Date occurExceptionTime) {
		this.occurExceptionTime = occurExceptionTime;
	}

	public Date getEndExceptionTime() {
		return endExceptionTime;
	}

	public void setEndExceptionTime(Date endExceptionTime) {
		this.endExceptionTime = endExceptionTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
