package com.ccue.ajlw.pojo.safemonitor;

import com.ccue.ajlw.pojo.BasePOJO;

import java.io.Serializable;


public class MineInfo extends BasePOJO implements Serializable{

 	 /**
	 * 煤矿编码
	 */	
 	protected  String mineNum = "";
 	
 	 /**
 	 * 工作班次数量
 	 */
 	protected String shiftNum = "";
 	
 	 /**
 	 * 分公司名称
 	 */
 	protected String companyName = "";

 	 /**
	 * 煤矿全称
	 */	
 	protected  String mineFName = "";

 	 /**
	 * 煤矿简称
	 */	
 	protected  String mineSName = "";

 	 /**
	 * 经济类型
	 */	
 	protected  String econType = "";

 	 /**
	 * 隶属关系
	 */	
 	protected  String affiliated = "";

 	 /**
	 * 矿长姓名
	 */	
 	protected  String mineLeader = "";

 	 /**
	 * 详细地址
	 */	
 	protected  String address = "";

 	 /**
	 * 核定生产能力(万吨)
	 */	
 	protected  String perCapacity = "";

 	 /**
	 * 实际生产能力(万吨)
	 */	
 	protected  String realCapacity = "";

 	 /**
	 * 核定下井人数
	 */	
 	protected  String appPersons = "";

 	 /**
	 * 核定每班下井时间(小时)
	 */	
 	protected  String appWorkTime = "";

 	 /**
	 * 矿联系电话
	 */	
 	protected  String minePhone = "";

 	 /**
	 * 井田面积(平方公里)
	 */	
 	protected  String mineArea = "";

 	 /**
	 * 可采煤层
	 */	
 	protected  String coalLevel = "";
 	
 	 /**
 	 * 采矿许可证编号（不超过 30 个十进制数字/汉字长度）
 	 */
 	protected String permitCode = "";
 	
 	 /**
 	 * 安全生产许可证编号（不超过 30 个十进制数字/汉字长度）
 	 */
 	protected String safeProduceCode = "";
 	
 	 /**
 	 * 煤矿生产许可证编号（不超过 30 个十进制数字/汉字长度）
 	 */
 	protected String mineProduceCode = "";
 	
 	 /**
 	 * 矿长安全生产许可资格证编号（不超过 30 个十进制数字/汉字长度）
 	 */
 	protected String leaderPermitCode = "";
 	
 	 /**
 	 * 矿长资格证编号
 	 */
 	protected String leaderQualificationCode = "";
 	
 	 /**
 	 * 工商执照编号
 	 */
 	protected String commerceCode = "";

 	 /**
	 * 矿井瓦斯等级
	 */	
 	protected  String gasLevle = "";

 	 /**
	 * 绝对瓦斯涌出量
	 */	
 	protected  String absGasEm = "";

 	 /**
	 * 相对瓦斯涌出量
	 */	
 	protected  String relGasEm = "";

 	 /**
	 * 主用服务器IP地址
	 */	
 	protected  String masterIP = "";

 	 /**
	 * 备用服务器IP地址
	 */	
 	protected  String slaverIP = "";

 	 /**
	 * 主井口X坐标
	 */	
 	protected  String mineX = "";

 	 /**
	 * 主井口Y坐标
	 */	
 	protected  String mineY = "";
 	
 	/**
 	 * 备注
 	 */
 	protected String remark = "";
 	
 	
 	public String getMineNum() {
		return mineNum;
	}


	public void setMineNum(String mineNum) {
		this.mineNum = mineNum;
	}


	public String getShiftNum() {
		return shiftNum;
	}


	public void setShiftNum(String shiftNum) {
		this.shiftNum = shiftNum;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getMineFName() {
		return mineFName;
	}


	public void setMineFName(String mineFName) {
		this.mineFName = mineFName;
	}


	public String getMineSName() {
		return mineSName;
	}


	public void setMineSName(String mineSName) {
		this.mineSName = mineSName;
	}


	public String getEconType() {
		return econType;
	}


	public void setEconType(String econType) {
		this.econType = econType;
	}


	public String getAffiliated() {
		return affiliated;
	}


	public void setAffiliated(String affiliated) {
		this.affiliated = affiliated;
	}


	public String getMineLeader() {
		return mineLeader;
	}


	public void setMineLeader(String mineLeader) {
		this.mineLeader = mineLeader;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPerCapacity() {
		return perCapacity;
	}


	public void setPerCapacity(String perCapacity) {
		this.perCapacity = perCapacity;
	}


	public String getRealCapacity() {
		return realCapacity;
	}


	public void setRealCapacity(String realCapacity) {
		this.realCapacity = realCapacity;
	}


	public String getAppPersons() {
		return appPersons;
	}


	public void setAppPersons(String appPersons) {
		this.appPersons = appPersons;
	}


	public String getAppWorkTime() {
		return appWorkTime;
	}


	public void setAppWorkTime(String appWorkTime) {
		this.appWorkTime = appWorkTime;
	}


	public String getMinePhone() {
		return minePhone;
	}


	public void setMinePhone(String minePhone) {
		this.minePhone = minePhone;
	}


	public String getMineArea() {
		return mineArea;
	}


	public void setMineArea(String mineArea) {
		this.mineArea = mineArea;
	}


	public String getCoalLevel() {
		return coalLevel;
	}


	public void setCoalLevel(String coalLevel) {
		this.coalLevel = coalLevel;
	}


	public String getPermitCode() {
		return permitCode;
	}


	public void setPermitCode(String permitCode) {
		this.permitCode = permitCode;
	}


	public String getSafeProduceCode() {
		return safeProduceCode;
	}


	public void setSafeProduceCode(String safeProduceCode) {
		this.safeProduceCode = safeProduceCode;
	}


	public String getMineProduceCode() {
		return mineProduceCode;
	}


	public void setMineProduceCode(String mineProduceCode) {
		this.mineProduceCode = mineProduceCode;
	}


	public String getLeaderPermitCode() {
		return leaderPermitCode;
	}


	public void setLeaderPermitCode(String leaderPermitCode) {
		this.leaderPermitCode = leaderPermitCode;
	}


	public String getLeaderQualificationCode() {
		return leaderQualificationCode;
	}


	public void setLeaderQualificationCode(String leaderQualificationCode) {
		this.leaderQualificationCode = leaderQualificationCode;
	}


	public String getCommerceCode() {
		return commerceCode;
	}


	public void setCommerceCode(String commerceCode) {
		this.commerceCode = commerceCode;
	}


	public String getGasLevle() {
		return gasLevle;
	}


	public void setGasLevle(String gasLevle) {
		this.gasLevle = gasLevle;
	}


	public String getAbsGasEm() {
		return absGasEm;
	}


	public void setAbsGasEm(String absGasEm) {
		this.absGasEm = absGasEm;
	}


	public String getRelGasEm() {
		return relGasEm;
	}


	public void setRelGasEm(String relGasEm) {
		this.relGasEm = relGasEm;
	}


	public String getMasterIP() {
		return masterIP;
	}


	public void setMasterIP(String masterIP) {
		this.masterIP = masterIP;
	}


	public String getSlaverIP() {
		return slaverIP;
	}


	public void setSlaverIP(String slaverIP) {
		this.slaverIP = slaverIP;
	}


	public String getMineX() {
		return mineX;
	}


	public void setMineX(String mineX) {
		this.mineX = mineX;
	}


	public String getMineY() {
		return mineY;
	}


	public void setMineY(String mineY) {
		this.mineY = mineY;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


}
