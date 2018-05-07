package com.ccue.ajlw.parser.zmpojo.person;

import java.io.Serializable;

/**
 * 人员信息
 * @author chen
 *
 */
public class PersonInfoZM implements Serializable {

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
	 * 身份证号码
	 */	
	private String IDCardNum;

	/**
	 * 主要工作地点
	 */	
	private String majorWorkingPlace;
	
	/**
	 * 出生年月
	 */	
	private String birthday;
	
	/**
	 * 性别
	 */
	private String sex;
	
	/**
	 * 血型
	 */	
	private String bloodType;
	
	/**
	 * 学历
	 */
	private String education;
	
	/**
	 * 婚姻状况
	 */	
	private String maritalStatus;
	
	/**
	 * 联系电话
	 */	
	private String phone;
	
	/**
	 * 手机号码
	 */	
	private String tel;
	
	/**
	 * 家庭住址
	 */	
	private String address;
	
	/**
	 * 工种证件名称及编号
	 */	
	private String professionCard;
	
	/**
	 * 工种证件有效日期
	 * yyyy-mm-dd
	 */	
	private String professionCardPeriod;

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

	public String getIDCardNum() {
		return IDCardNum;
	}

	public void setIDCardNum(String IDCardNum) {
		this.IDCardNum = IDCardNum;
	}

	public String getMajorWorkingPlace() {
		return majorWorkingPlace;
	}

	public void setMajorWorkingPlace(String majorWorkingPlace) {
		this.majorWorkingPlace = majorWorkingPlace;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProfessionCard() {
		return professionCard;
	}

	public void setProfessionCard(String professionCard) {
		this.professionCard = professionCard;
	}

	public String getProfessionCardPeriod() {
		return professionCardPeriod;
	}

	public void setProfessionCardPeriod(String professionCardPeriod) {
		this.professionCardPeriod = professionCardPeriod;
	}
}
