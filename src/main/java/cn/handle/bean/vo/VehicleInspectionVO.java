package cn.handle.bean.vo;

import java.io.Serializable;

public class VehicleInspectionVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String bookNumber         ;
	private String organization       ;
	private String businessType       ;
	private String name               ;
	private String platNumber         ;
	private String personType         ;
	private String driveLicenseNumber ;
	private String postCode           ;
	private String recipientsName     ;
	private String recipientsMobile   ;
	private String postAddr           ;
	private String appointmentTime    ;
	private String mobile             ;
	private String telno              ;
	private String effectiveDate      ;
	private String terminationDate    ;
	private String inform             ;
	private String createDate         ;
	private String bookState          ;
	private String approveState       ;
	private String approveFlag		  ;
	private String approveInfo        ;
	
	public String getApproveFlag() {
		return approveFlag;
	}
	public void setApproveFlag(String approveFlag) {
		this.approveFlag = approveFlag;
	}
	public String getApproveInfo() {
		return approveInfo;
	}
	public void setApproveInfo(String approveInfo) {
		this.approveInfo = approveInfo;
	}
	public String getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(String bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlatNumber() {
		return platNumber;
	}
	public void setPlatNumber(String platNumber) {
		this.platNumber = platNumber;
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
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
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
	public String getPostAddr() {
		return postAddr;
	}
	public void setPostAddr(String postAddr) {
		this.postAddr = postAddr;
	}
	public String getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
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
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getBookState() {
		return bookState;
	}
	public void setBookState(String bookState) {
		this.bookState = bookState;
	}
	public String getApproveState() {
		return approveState;
	}
	public void setApproveState(String approveState) {
		this.approveState = approveState;
	}
	@Override
	public String toString() {
		return "VehicleInspectionVO [bookNumber=" + bookNumber + ", organization=" + organization + ", businessType="
				+ businessType + ", name=" + name + ", platNumber=" + platNumber + ", personType=" + personType
				+ ", driveLicenseNumber=" + driveLicenseNumber + ", postCode=" + postCode + ", recipientsName="
				+ recipientsName + ", recipientsMobile=" + recipientsMobile + ", postAddr=" + postAddr
				+ ", appointmentTime=" + appointmentTime + ", mobile=" + mobile + ", telno=" + telno
				+ ", effectiveDate=" + effectiveDate + ", terminationDate=" + terminationDate + ", inform=" + inform
				+ ", createDate=" + createDate + ", bookState=" + bookState + ", approveState=" + approveState
				+ ", approveFlag=" + approveFlag + ", approveInfo=" + approveInfo + "]";
	}
	

}
