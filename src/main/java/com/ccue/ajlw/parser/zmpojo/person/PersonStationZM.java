package com.ccue.ajlw.parser.zmpojo.person;

import java.io.Serializable;

/**
 * 人员分站
 * @author chen
 *
 */
public class PersonStationZM implements Serializable {

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
	 * 顺序号
	 */	
	private  String order;
	
	/**
	 * 类型
	 */	
	private  String type;
	
	/**
	 * 分站编码
	 */	
	private  String stationNum;
	
	/**
	 * 分站名称
	 */	
	private  String stationName;
	
	/**
	 * Y坐标
	 */	
	private  String coordinateY;
	
	/**
	 * X坐标
	 */	
	private  String coordinateX;

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

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getCoordinateY() {
		return coordinateY;
	}

	public void setCoordinateY(String coordinateY) {
		this.coordinateY = coordinateY;
	}

	public String getCoordinateX() {
		return coordinateX;
	}

	public void setCoordinateX(String coordinateX) {
		this.coordinateX = coordinateX;
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
}
