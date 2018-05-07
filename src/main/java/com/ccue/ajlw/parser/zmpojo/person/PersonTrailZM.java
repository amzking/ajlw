package com.ccue.ajlw.parser.zmpojo.person;

import java.io.Serializable;
import java.util.Date;

/**
 * 人员轨迹
 * @author chen
 *
 */
public class PersonTrailZM implements Serializable {

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
	 * 轨迹线序号
	 */	
	private  String trailNum;
	
	/**
	 * 轨迹线起点序号
	 */	
	private  String trailStartNum;
	
	/**
	 * 轨迹线终点序号
	 */	
	private  String trailEndNum;
	
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

	public String getTrailNum() {
		return trailNum;
	}

	public void setTrailNum(String trailNum) {
		this.trailNum = trailNum;
	}

	public String getTrailStartNum() {
		return trailStartNum;
	}

	public void setTrailStartNum(String trailStartNum) {
		this.trailStartNum = trailStartNum;
	}

	public String getTrailEndNum() {
		return trailEndNum;
	}

	public void setTrailEndNum(String trailEndNum) {
		this.trailEndNum = trailEndNum;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
