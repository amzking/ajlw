package com.ccue.ajlw.parser.zmpojo.person;

import java.io.Serializable;
import java.util.Date;
public class PersonEnterMineRecordZM implements Serializable {
	
	/**
	 * 主键
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
	 * 入井时间
	 */
	private Date inMineTime;
	
	/**
	 * 出井时间
	 */
	private Date outMineTime;

	/**
	 * 行进轨迹分站，时间集合
	 */
	private String timeCollection;

	/**
	 * 分站时间集合（自动更新）
	 */
	private String collection;
	
	/**
	 * 更新时间
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

	public Date getInMineTime() {
		return inMineTime;
	}

	public void setInMineTime(Date inMineTime) {
		this.inMineTime = inMineTime;
	}

	public Date getOutMineTime() {
		return outMineTime;
	}

	public void setOutMineTime(Date outMineTime) {
		this.outMineTime = outMineTime;
	}

	public String getTimeCollection() {
		return timeCollection;
	}

	public void setTimeCollection(String timeCollection) {
		this.timeCollection = timeCollection;
	}

	public String getCollection() {
		return collection;
	}

	public void setCollection(String collection) {
		this.collection = collection;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
