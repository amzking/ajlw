package com.ccue.ajlw.pojo.person;

import com.ccue.ajlw.pojo.BasePOJO;

import java.io.Serializable;
import java.util.Date;

/**
 * 人员信息，符合国家标准
 */
public class PersonInfo  extends BasePOJO implements Serializable {

    /**
     * 煤矿编码
     */
    private String mineNum;

    /**
     * 人员卡编码
     */
    private String cardNum;

    /**
     * 姓名
     */
    private String personName;

    /**
     * 身份证号码
     */
    private String identityCard;

    /**
     * 工种或职务
     */
    private String workDuty;

    /**
     * 所在区队班组/部门
     */
    private String department;

    /**
     * 主要工作地点
     */
    private String workLocation;

    /**
     * 出生年月
     */
    private String birthday;

    /**
     * 性别
     */
    private String gender;

    /**
     * 血型
     */
    private String bloodType;

    /**
     * 学历
     */
    private String degree;

    /**
     * 婚姻状况
     */
    private String isMarried;

    /**
     * 联系电话
     */
    private String cellNumber;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 家庭地址
     */
    private String familyAddress;

    /**
     * 工种证件名称及编号
     */
    private String certificates;

    /**
     * 工种证件有效日期
     */
    private String certificatesEndDate;

    /**
     * 更新时间
     */
    private Date updateTime;

    public String getMineNum() {
        return mineNum;
    }

    public void setMineNum(String mineNum) {
        this.mineNum = mineNum;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getWorkDuty() {
        return workDuty;
    }

    public void setWorkDuty(String workDuty) {
        this.workDuty = workDuty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getIsMarried() {
        return isMarried;
    }

    public void setIsMarried(String isMarried) {
        this.isMarried = isMarried;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFamilyAddress() {
        return familyAddress;
    }

    public void setFamilyAddress(String familyAddress) {
        this.familyAddress = familyAddress;
    }

    public String getCertificates() {
        return certificates;
    }

    public void setCertificates(String certificates) {
        this.certificates = certificates;
    }

    public String getCertificatesEndDate() {
        return certificatesEndDate;
    }

    public void setCertificatesEndDate(String certificatesEndDate) {
        this.certificatesEndDate = certificatesEndDate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
