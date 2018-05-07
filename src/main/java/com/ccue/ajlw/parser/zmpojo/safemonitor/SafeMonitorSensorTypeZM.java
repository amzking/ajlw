package com.ccue.ajlw.parser.zmpojo.safemonitor;

import java.io.Serializable;

/**
 * 传感器类型
 * @author chen
 *
 */
public class SafeMonitorSensorTypeZM implements Serializable {

	private String id;
	
	/**
	 * 类型编码
	 */
	private String sensorTypeNum;
	
	/**
	 * 类型名称
	 */
	private String sensorTypeName;
	
	/**
	 * 类型单位
	 */
	private String sensorTypeUnit;
	
	/**
	 * 模式对
	 */
	private String modelPair;
	
	/**
	 * 表示格式
	 */
	private String performance;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSensorTypeNum() {
		return sensorTypeNum;
	}

	public void setSensorTypeNum(String sensorTypeNum) {
		this.sensorTypeNum = sensorTypeNum;
	}

	public String getSensorTypeName() {
		return sensorTypeName;
	}

	public void setSensorTypeName(String sensorTypeName) {
		this.sensorTypeName = sensorTypeName;
	}

	public String getSensorTypeUnit() {
		return sensorTypeUnit;
	}

	public void setSensorTypeUnit(String sensorTypeUnit) {
		this.sensorTypeUnit = sensorTypeUnit;
	}

	public String getModelPair() {
		return modelPair;
	}

	public void setModelPair(String modelPair) {
		this.modelPair = modelPair;
	}

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}
}
