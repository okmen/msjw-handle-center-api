package cn.handle.bean.vo;

import java.io.Serializable;


public class ApplyInspectionMarkVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3826224522584267962L;

	private String userName;	//姓名
	private String identityCard;	//身份证
	private String mobilephone;		//手机号
	private String recipientName;
	private String recipientPhone;
	private String recipientAddress;
	private String licensePlateNo;
	private String licensePlateType;
	private String placeOfDomicile;
	private String sourceOfCertification;
	private String idCardImgPositive;
	private String idCardImgNegative;
	private String idCarImgTable;  //机动车登机证书
	private String foreignersLiveTable;
	private String ip;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
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
	public String getPlaceOfDomicile() {
		return placeOfDomicile;
	}
	public void setPlaceOfDomicile(String placeOfDomicile) {
		this.placeOfDomicile = placeOfDomicile;
	}
	public String getSourceOfCertification() {
		return sourceOfCertification;
	}
	public void setSourceOfCertification(String sourceOfCertification) {
		this.sourceOfCertification = sourceOfCertification;
	}
	public String getIdCardImgPositive() {
		return idCardImgPositive;
	}
	public void setIdCardImgPositive(String idCardImgPositive) {
		this.idCardImgPositive = idCardImgPositive;
	}
	public String getIdCardImgNegative() {
		return idCardImgNegative;
	}
	public void setIdCardImgNegative(String idCardImgNegative) {
		this.idCardImgNegative = idCardImgNegative;
	}

	public String getForeignersLiveTable() {
		return foreignersLiveTable;
	}
	public void setForeignersLiveTable(String foreignersLiveTable) {
		this.foreignersLiveTable = foreignersLiveTable;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getIdCarImgTable() {
		return idCarImgTable;
	}
	public void setIdCarImgTable(String idCarImgTable) {
		this.idCarImgTable = idCarImgTable;
	}

	
}
