package com.ccue.ajlw.parser.zmpojo.person;

import java.io.Serializable;

/**
 * 人员区域
 * @author chen
 *
 */
public class PersonAreaZM implements Serializable {

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
	 * 区域编码
	 */
 	private String areaNum;

	/**
	 * 区域名称
	 */
	private String areaName;

	/**
	 * 区域类型
	 */
	private String areaType;

	/**
	 * 区域核定人数
	 */	
 	private String appPersons;

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

	public String getAreaType() {
		return areaType;
	}

	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}

	public String getAppPersons() {
		return appPersons;
	}

	public void setAppPersons(String appPersons) {
		this.appPersons = appPersons;
	}
}
