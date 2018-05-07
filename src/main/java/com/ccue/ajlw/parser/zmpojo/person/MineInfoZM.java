package com.ccue.ajlw.parser.zmpojo.person;

import java.io.Serializable;

/**
 * 矿信息
 * @author chen
 *
 */
public class MineInfoZM implements Serializable {
	/**
	 * 主键id
	 */
	private String id;

	/**
	 * 煤矿编码
	 */
	private String mineNum;

	/**
	 * 二级企业编码
	 */
	private String mineSecondNum;

	/**
	 * 煤矿全称
	 */
	private String mineFName;

	/**
	 * 煤矿简称
	 */
	private String mineSName;

	/**
	 * 经济类型
	 */
	private String econType;

	/**
	 * 隶属关系
	 */
	private String affiliated;

	/**
	 * 矿长(总经理)姓名
	 */
	private String mineLeader;

	/**
	 * 详细地址
	 */
	private String address;

	/**
	 * 核定生产能力(万吨)
	 */
	private String perCapacity;

	/**
	 * 实际生产能力(万吨)
	 */
	private String realCapacity;

	/**
	 * 核定下井人数
	 */
	private String appPersons;

	/**
	 * 核定每班下井时间(小时)
	 */
	private String appWorkTime;

	/**
	 * 矿联系电话
	 */
	private String minePhone;

	/**
	 * 井田面积(平方公里)
	 */
	private String mineArea;

	/**
	 * 可采煤层
	 */
	private String coalLevel;

	/**
	 * 采矿许可证编号
	 */
	private String miningPermitCardNum;

	/**
	 * 安全生产许可证编号
	 */
	private String safetyProductionPermitCardNum;

	/**
	 * 煤炭生产许可证编号
	 */
	private String coalProductionPermitCardNum;

	/**
	 * 矿长安全生产许可证编号
	 */
	private String leaderProductionPermitCardNum;

	/**
	 * 矿长资格证编号
	 */
	private String leaderQualificationCertificateNum;

	/**
	 * 工商执照编号
	 */
	private String businessLicenseNum;

	/**
	 * 矿井瓦斯等级
	 */
	private String gasLevle;

	/**
	 * 绝对瓦斯涌出量
	 */
	private String absGasEm;

	/**
	 * 相对瓦斯涌出量
	 */
	private String relGasEm;

	/**
	 * 主用服务器IP地址
	 */
	private String masterIP;

	/**
	 * 备用服务器IP地址
	 */
	private String slaverIP;

	/**
	 * 主井口X坐标
	 */
	private String mineX;

	/**
	 * 主井口Y坐标
	 */
	private String mineY;

	/**
	 * 备注
	 */
	private String remark;

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

	public String getMineSecondNum() {
		return mineSecondNum;
	}

	public void setMineSecondNum(String mineSecondNum) {
		this.mineSecondNum = mineSecondNum;
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

	public String getMiningPermitCardNum() {
		return miningPermitCardNum;
	}

	public void setMiningPermitCardNum(String miningPermitCardNum) {
		this.miningPermitCardNum = miningPermitCardNum;
	}

	public String getSafetyProductionPermitCardNum() {
		return safetyProductionPermitCardNum;
	}

	public void setSafetyProductionPermitCardNum(String safetyProductionPermitCardNum) {
		this.safetyProductionPermitCardNum = safetyProductionPermitCardNum;
	}

	public String getCoalProductionPermitCardNum() {
		return coalProductionPermitCardNum;
	}

	public void setCoalProductionPermitCardNum(String coalProductionPermitCardNum) {
		this.coalProductionPermitCardNum = coalProductionPermitCardNum;
	}

	public String getLeaderProductionPermitCardNum() {
		return leaderProductionPermitCardNum;
	}

	public void setLeaderProductionPermitCardNum(String leaderProductionPermitCardNum) {
		this.leaderProductionPermitCardNum = leaderProductionPermitCardNum;
	}

	public String getLeaderQualificationCertificateNum() {
		return leaderQualificationCertificateNum;
	}

	public void setLeaderQualificationCertificateNum(String leaderQualificationCertificateNum) {
		this.leaderQualificationCertificateNum = leaderQualificationCertificateNum;
	}

	public String getBusinessLicenseNum() {
		return businessLicenseNum;
	}

	public void setBusinessLicenseNum(String businessLicenseNum) {
		this.businessLicenseNum = businessLicenseNum;
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




