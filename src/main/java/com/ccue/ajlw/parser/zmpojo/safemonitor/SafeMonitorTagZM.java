package com.ccue.ajlw.parser.zmpojo.safemonitor;

import java.io.Serializable;
import java.util.Date;

/**
 * 传感器信息
 * @author chen
 *
 */
public class SafeMonitorTagZM implements Serializable {

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
	 * 安监分站编号
	 */	
	private String stationNum;
	
 	 /**
	 * 传感器编号
	 */	
 	private String tagNum;
 	
 	 /**
	 * 安装位置
	 */
 	private String installPlace;

 	 /**
	 * 数据类型编码
	 */	
 	private String dataTypeNum;

	/**
	 * 传感器类型编码
	 */
 	private String sensorTypeNum;
	
 	/**
	 * 工程单位
	 */	
 	private  String unit;
 	
 	/**
	 * 量程上限
	 */	
 	private  String rangCeiling;
 	
 	/**
	 * 量程下限
	 */	
 	private  String rangFloor;
 	
	/**
	 * 报警下限
	 */
	private  String alarmFloor;
 	
	/**
	 * 报警上限
	 */
 	private  String alarmCeiling;
 	
 	/**
	 * 关断值
	 */	
 	private  String switchValue;
 	
 	/**
	 * 复位值
	 */
 	private  String resetValue;
 	
 	/**
 	 * 更新时间
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

	public String getStationNum() {
		return stationNum;
	}

	public void setStationNum(String stationNum) {
		this.stationNum = stationNum;
	}

	public String getTagNum() {
		return tagNum;
	}

	public void setTagNum(String tagNum) {
		this.tagNum = tagNum;
	}

	public String getInstallPlace() {
		return installPlace;
	}

	public void setInstallPlace(String installPlace) {
		this.installPlace = installPlace;
	}

	public String getDataTypeNum() {
		return dataTypeNum;
	}

	public void setDataTypeNum(String dataTypeNum) {
		this.dataTypeNum = dataTypeNum;
	}

	public String getSensorTypeNum() {
		return sensorTypeNum;
	}

	public void setSensorTypeNum(String sensorTypeNum) {
		this.sensorTypeNum = sensorTypeNum;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getRangCeiling() {
		return rangCeiling;
	}

	public void setRangCeiling(String rangCeiling) {
		this.rangCeiling = rangCeiling;
	}

	public String getRangFloor() {
		return rangFloor;
	}

	public void setRangFloor(String rangFloor) {
		this.rangFloor = rangFloor;
	}

	public String getAlarmFloor() {
		return alarmFloor;
	}

	public void setAlarmFloor(String alarmFloor) {
		this.alarmFloor = alarmFloor;
	}

	public String getAlarmCeiling() {
		return alarmCeiling;
	}

	public void setAlarmCeiling(String alarmCeiling) {
		this.alarmCeiling = alarmCeiling;
	}

	public String getSwitchValue() {
		return switchValue;
	}

	public void setSwitchValue(String switchValue) {
		this.switchValue = switchValue;
	}

	public String getResetValue() {
		return resetValue;
	}

	public void setResetValue(String resetValue) {
		this.resetValue = resetValue;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
