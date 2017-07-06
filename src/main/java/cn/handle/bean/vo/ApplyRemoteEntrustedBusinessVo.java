package cn.handle.bean.vo;

import java.io.Serializable;

/**
 * 机动车异地委托业务申报
 * @author Mbenben
 *
 */
public class ApplyRemoteEntrustedBusinessVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3516638857614033763L;
	
	private String licensePlateNo;
	private String licensePlateType;
	private String vehicleIdentifyNoLast4;
	private String proprietorship;
	private String identityCard;//用户身份证
	private String name;//车主姓名
	private String carOwnerIdentityCard;//车主身份证
	private String userName;
	private String associatedAgency;
	private String sourceOfCertification;
	private String recipientName;
	private String recipientPhone;
	private String recipientAddress;
	private String postalcode;
	public String getLicensePlateNo() {
		return licensePlateNo;
	}
	public void setLicensePlateNo(String licensePlateNo) {
		this.licensePlateNo = licensePlateNo;
	}
	public String getLicensePlateType() {
		return licensePlateType;
	}
	public void setLicensePlateType(String licensePlateType) {
		this.licensePlateType = licensePlateType;
	}
	public String getVehicleIdentifyNoLast4() {
		return vehicleIdentifyNoLast4;
	}
	public void setVehicleIdentifyNoLast4(String vehicleIdentifyNoLast4) {
		this.vehicleIdentifyNoLast4 = vehicleIdentifyNoLast4;
	}
	public String getProprietorship() {
		return proprietorship;
	}
	public void setProprietorship(String proprietorship) {
		this.proprietorship = proprietorship;
	}
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAssociatedAgency() {
		return associatedAgency;
	}
	public void setAssociatedAgency(String associatedAgency) {
		this.associatedAgency = associatedAgency;
	}
	public String getSourceOfCertification() {
		return sourceOfCertification;
	}
	public void setSourceOfCertification(String sourceOfCertification) {
		this.sourceOfCertification = sourceOfCertification;
	}
	public String getRecipientName() {
		return recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	public String getRecipientPhone() {
		return recipientPhone;
	}
	public void setRecipientPhone(String recipientPhone) {
		this.recipientPhone = recipientPhone;
	}
	public String getRecipientAddress() {
		return recipientAddress;
	}
	public void setRecipientAddress(String recipientAddress) {
		this.recipientAddress = recipientAddress;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCarOwnerIdentityCard() {
		return carOwnerIdentityCard;
	}
	public void setCarOwnerIdentityCard(String carOwnerIdentityCard) {
		this.carOwnerIdentityCard = carOwnerIdentityCard;
	}


}
