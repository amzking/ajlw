package com.ccue.ajlw.parser.zmpojo.person;

import java.io.Serializable;
import java.util.Date;

/**
 * 人员预设
 * @author chen
 *
 */
public class PersonPreinstallZM implements Serializable {
	
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
	 * 分站时间集合
	 */
	private  String stationTimeCollection;

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

	public String getStationTimeCollection() {
		return stationTimeCollection;
	}

	public void setStationTimeCollection(String stationTimeCollection) {
		this.stationTimeCollection = stationTimeCollection;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
