package com.ccue.ajlw.parser.zmpojo.safemonitor;

import java.io.Serializable;
import java.util.Date;

/**
 * 安监报警数据
 * @author chen
 *
 */
public class SafeMonitorAlarmZM implements Serializable {

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
	 * 传感器编号
	 */
	private String tagNum;

	/**
	 * 安装位置
	 */
	private String installPlace;
	
	/**
	 * 安监分站编号
	 */	
	private String stationNum;

	/**
	 * 传感器类型编号
	 */
	private String sensorTypeNum;
	
	/**
	 * 数据类型编码
	 */	
 	private String dataTypeNum;

	/**
	 * 报警状态编码
	 */
	private String alarmStatusCode;

	/**
	 * 报警状态码
	 */
	private String statusNum;

	/**
	 * 报警开始时间
	 */
	private Date alarmStartTime;

	/**
	 * 报警结束时间
	 */
	private Date alarmEndTime;

	/**
	 * 最小值
	 */
	private String minVal;
	/**
	 * 最小值时刻
	 */
	private Date minValTime;
	/**
	 * 最大值
	 */
	private String maxVal;
	/**
	 * 最大值时刻
	 */
	private Date maxValTime;
	/**
	 * 平均值
	 */
	private String averageVal;

	/**
	 * 报警更新时间
	 */
	private Date updateTime;

	/**
	 * 当前值
	 */
	private String currentVal;

	/**
	 * 次数
	 */
	private Integer times;

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

	public String getInstallPlace() {
		return installPlace;
	}

	public void setInstallPlace(String installPlace) {
		this.installPlace = installPlace;
	}

	public String getStationNum() {
		return stationNum;
	}

	public void setStationNum(String stationNum) {
		this.stationNum = stationNum;
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

	public String getAlarmStatusCode() {
		return alarmStatusCode;
	}

	public void setAlarmStatusCode(String alarmStatusCode) {
		this.alarmStatusCode = alarmStatusCode;
	}

	public String getStatusNum() {
		return statusNum;
	}

	public void setStatusNum(String statusNum) {
		this.statusNum = statusNum;
	}

	public Date getAlarmStartTime() {
		return alarmStartTime;
	}

	public void setAlarmStartTime(Date alarmStartTime) {
		this.alarmStartTime = alarmStartTime;
	}

	public Date getAlarmEndTime() {
		return alarmEndTime;
	}

	public void setAlarmEndTime(Date alarmEndTime) {
		this.alarmEndTime = alarmEndTime;
	}

	public String getMinVal() {
		return minVal;
	}

	public void setMinVal(String minVal) {
		this.minVal = minVal;
	}

	public Date getMinValTime() {
		return minValTime;
	}

	public void setMinValTime(Date minValTime) {
		this.minValTime = minValTime;
	}

	public String getMaxVal() {
		return maxVal;
	}

	public void setMaxVal(String maxVal) {
		this.maxVal = maxVal;
	}

	public Date getMaxValTime() {
		return maxValTime;
	}

	public void setMaxValTime(Date maxValTime) {
		this.maxValTime = maxValTime;
	}

	public String getAverageVal() {
		return averageVal;
	}

	public void setAverageVal(String averageVal) {
		this.averageVal = averageVal;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getCurrentVal() {
		return currentVal;
	}

	public void setCurrentVal(String currentVal) {
		this.currentVal = currentVal;
	}

	public Integer getTimes() {
		return times;
	}

	public void setTimes(Integer times) {
		this.times = times;
	}
}
