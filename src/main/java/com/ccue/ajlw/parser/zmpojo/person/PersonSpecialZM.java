package com.ccue.ajlw.parser.zmpojo.person;

import java.io.Serializable;
import java.util.Date;

/**
 * 人员特种工作
 * @author chen
 *
 */
public class PersonSpecialZM implements Serializable {

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
	 * 文件生成时刻
	 */	
	private  Date fileCreatedTime;

	/**
	 * 人员卡编码
	 */
	private String personCardNum;

	/**
	 * 姓名
	 */
	private String personName;

	/**
	 * 工种或职务
	 */
	private String duty;

	/**
	 * 所在区队班组/部门
	 */
	private String localTeam;
	
	/**
	 * 入井时刻
	 */	
	private  Date enterMineTime;

	/**
	 * 区域编码
	 */
	private String areaNum;

	/**
	 * 区域名称
	 */
	private String areaName;
	
	/**
	 * 进入当前区域时刻
	 */	
	private  Date enterAreaTime;

	/**
	 * 分站编码
	 */
	private  String stationNum;

	/**
	 * 分站名称
	 */
	private  String stationName;
	
	/**
	 * 分站类型
	 */
	private  String stationType;
	
	/**
	 * 进入当前所处分站时刻
	 */	
	private  Date enterStationTime;
	
	/**
	 * 应到地点
	 */	
	private  String planPlace;
	
	/**
	 * 应到时间
	 */	
	private  Date planTime;
	
	/**
	 * 状态
	 */	
	private  String status;
	
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

	public Date getFileCreatedTime() {
		return fileCreatedTime;
	}

	public void setFileCreatedTime(Date fileCreatedTime) {
		this.fileCreatedTime = fileCreatedTime;
	}

	public String getPersonCardNum() {
		return personCardNum;
	}

	public void setPersonCardNum(String personCardNum) {
		this.personCardNum = personCardNum;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getLocalTeam() {
		return localTeam;
	}

	public void setLocalTeam(String localTeam) {
		this.localTeam = localTeam;
	}

	public Date getEnterMineTime() {
		return enterMineTime;
	}

	public void setEnterMineTime(Date enterMineTime) {
		this.enterMineTime = enterMineTime;
	}

	public String getAreaNum() {
		return areaNum;
	}

	public void setAreaNum(String areaNum) {
		this.areaNum = areaNum;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Date getEnterAreaTime() {
		return enterAreaTime;
	}

	public void setEnterAreaTime(Date enterAreaTime) {
		this.enterAreaTime = enterAreaTime;
	}

	public String getStationNum() {
		return stationNum;
	}

	public void setStationNum(String stationNum) {
		this.stationNum = stationNum;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getStationType() {
		return stationType;
	}

	public void setStationType(String stationType) {
		this.stationType = stationType;
	}

	public Date getEnterStationTime() {
		return enterStationTime;
	}

	public void setEnterStationTime(Date enterStationTime) {
		this.enterStationTime = enterStationTime;
	}

	public String getPlanPlace() {
		return planPlace;
	}

	public void setPlanPlace(String planPlace) {
		this.planPlace = planPlace;
	}

	public Date getPlanTime() {
		return planTime;
	}

	public void setPlanTime(Date planTime) {
		this.planTime = planTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
