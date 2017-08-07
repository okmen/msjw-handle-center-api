package cn.handle.bean.vo;

import java.io.Serializable;

public class CreateVehicleInspectionVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String platNumber ;//车牌号码
	private String name ;//机动车所有人
	private String personType ;//申请人类型
	private String driveLicenseNumber ;// 行驶证编号
	private String mobile ;//手机号码
	private String telno ;//固定号码
	private String recipientsName ;//收件人姓名
	private String recipientsMobile ;//收件人电话
	private String postCode ;//邮政编码
	private String postAddr ;//收件人地址
	private String effectiveDate ;//保险生效日期
	private String terminationDate ;//保险终止日期
	private String inform ;//受理结果告知方式 
	private String bookerName ;//预约人
	private String bookerIdNumber ;//预约人身份证号码
	private String bookerType ;//预约方式
	private String carTypeId ;//号牌类型Id
	public String getPlatNumber() {
		return platNumber;
	}
	public void setPlatNumber(String platNumber) {
		this.platNumber = platNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPersonType() {
		return personType;
	}
	public void setPersonType(String personType) {
		this.personType = personType;
	}
	public String getDriveLicenseNumber() {
		return driveLicenseNumber;
	}
	public void setDriveLicenseNumber(String driveLicenseNumber) {
		this.driveLicenseNumber = driveLicenseNumber;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getTelno() {
		return telno;
	}
	public void setTelno(String telno) {
		this.telno = telno;
	}
	public String getRecipientsName() {
		return recipientsName;
	}
	public void setRecipientsName(String recipientsName) {
		this.recipientsName = recipientsName;
	}
	public String getRecipientsMobile() {
		return recipientsMobile;
	}
	public void setRecipientsMobile(String recipientsMobile) {
		this.recipientsMobile = recipientsMobile;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getPostAddr() {
		return postAddr;
	}
	public void setPostAddr(String postAddr) {
		this.postAddr = postAddr;
	}
	public String getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public String getTerminationDate() {
		return terminationDate;
	}
	public void setTerminationDate(String terminationDate) {
		this.terminationDate = terminationDate;
	}
	public String getInform() {
		return inform;
	}
	public void setInform(String inform) {
		this.inform = inform;
	}
	public String getBookerName() {
		return bookerName;
	}
	public void setBookerName(String bookerName) {
		this.bookerName = bookerName;
	}
	public String getBookerIdNumber() {
		return bookerIdNumber;
	}
	public void setBookerIdNumber(String bookerIdNumber) {
		this.bookerIdNumber = bookerIdNumber;
	}
	public String getBookerType() {
		return bookerType;
	}
	public void setBookerType(String bookerType) {
		this.bookerType = bookerType;
	}
	public String getCarTypeId() {
		return carTypeId;
	}
	public void setCarTypeId(String carTypeId) {
		this.carTypeId = carTypeId;
	}
	@Override
	public String toString() {
		return "CreateVehicleInspection [platNumber=" + platNumber + ", name=" + name + ", personType=" + personType
				+ ", driveLicenseNumber=" + driveLicenseNumber + ", mobile=" + mobile + ", telno=" + telno
				+ ", recipientsName=" + recipientsName + ", recipientsMobile=" + recipientsMobile + ", postCode="
				+ postCode + ", postAddr=" + postAddr + ", effectiveDate=" + effectiveDate + ", terminationDate="
				+ terminationDate + ", inform=" + inform + ", bookerName=" + bookerName + ", bookerIdNumber="
				+ bookerIdNumber + ", bookerType=" + bookerType + ", carTypeId=" + carTypeId + "]";
	}
	
	

}
