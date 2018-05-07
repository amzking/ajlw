package com.ccue.ajlw.parser.zmpojo.safemonitor;

import java.io.Serializable;
import java.util.Date;

/**
 * 传感器数据
 * @author chen
 *
 */
public class SafeMonitorTagValueZM implements Serializable {

	/**
	 * 主键id
	 */	
	private  String id;

	/**
	 * 煤矿编号
	 */
	private String mineNum;

	/**
	 * 煤矿名称
	 */
	private String mineName;

	/**
	 * 传感器编号
	 */
	private String tagNum;
	
	/**
	 * 安监分站编号
	 */	
	private String stationNum;

	/**
	 * 安装位置
	 */
	private String installPlace;

	/**
	 * 类型编码
	 */
	private String sensorTypeNum;
	
	/**
	 * 数据类型编码
	 */	
 	private String dataTypeNum;
	
 	/**
 	 * 传感器数值
 	 */
 	private String tagValue;
 	
 	/**
	 * 状态
	 */	
 	private  String tagStatus;
 	
 	/**
	 * 数据更新时间
	 * 
	 * mongoDB存入时间为格林威治时间
	 * 北京时间所属+8时区
	 * 计算机设置为北京时间后，所取得的时间系统会自动进行时间的补偿
	 */	
	private  Date updateTime;

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

	public String getTagNum() {
		return tagNum;
	}

	public void setTagNum(String tagNum) {
		this.tagNum = tagNum;
	}

	public String getStationNum() {
		return stationNum;
	}

	public void setStationNum(String stationNum) {
		this.stationNum = stationNum;
	}

	public String getInstallPlace() {
		return installPlace;
	}

	public void setInstallPlace(String installPlace) {
		this.installPlace = installPlace;
	}

	public String getSensorTypeNum() {
		return sensorTypeNum;
	}

	public void setSensorTypeNum(String sensorTypeNum) {
		this.sensorTypeNum = sensorTypeNum;
	}

	public String getDataTypeNum() {
		return dataTypeNum;
	}

	public void setDataTypeNum(String dataTypeNum) {
		this.dataTypeNum = dataTypeNum;
	}

	public String getTagValue() {
		return tagValue;
	}

	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

	public String getTagStatus() {
		return tagStatus;
	}

	public void setTagStatus(String tagStatus) {
		this.tagStatus = tagStatus;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
