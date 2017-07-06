package cn.handle.bean.vo;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class VehicleDrivingLicenseVo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;					//	车主姓名
	private String IDcard;					//	证件号码
	private String licensePlate;			//	号牌号码
	private String licensePlateTpye;		//	号牌种类
	private String placeOfDomicile;			//	户籍所在地 1深户，0外籍户口
	private String address;					//	住所详细地址
	private String receiverName;			//	收件人姓名
	private String receiverNumber;			//	收件人号码
	private String mailingAddress;			//	收件人地址
	private String livePhoto1;				//	居住证正面
	private String livePhoto2;				//	居住证反面
	private String IDCardPhoto1;			//	身份证（正面）
	private String IDCardPhoto2;			//	身份证（反面）
	private String driverLicensePhoto;		//	机动车登记证书
	private String ip;						//	ip
	private String sourceOfCertification;	//	申请来源
	private String foreignPeopleLivingOnTheTable; //境外人员临住表
	private String XSZZP; //车辆45°照片
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIDcard() {
		return IDcard;
	}
	public void setIDcard(String iDcard) {
		IDcard = iDcard;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public String getLicensePlateTpye() {
		return licensePlateTpye;
	}
	public void setLicensePlateTpye(String licensePlateTpye) {
		this.licensePlateTpye = licensePlateTpye;
	}
	public String getPlaceOfDomicile() {
		return placeOfDomicile;
	}
	public void setPlaceOfDomicile(String placeOfDomicile) {
		this.placeOfDomicile = placeOfDomicile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverNumber() {
		return receiverNumber;
	}
	public void setReceiverNumber(String receiverNumber) {
		this.receiverNumber = receiverNumber;
	}
	public String getMailingAddress() {
		return mailingAddress;
	}
	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}
	public String getLivePhoto1() {
		return livePhoto1;
	}
	public void setLivePhoto1(String livePhoto1) {
		this.livePhoto1 = livePhoto1;
	}
	public String getLivePhoto2() {
		return livePhoto2;
	}
	public void setLivePhoto2(String livePhoto2) {
		this.livePhoto2 = livePhoto2;
	}
	public String getIDCardPhoto1() {
		return IDCardPhoto1;
	}
	public void setIDCardPhoto1(String iDCardPhoto1) {
		IDCardPhoto1 = iDCardPhoto1;
	}
	public String getIDCardPhoto2() {
		return IDCardPhoto2;
	}
	public void setIDCardPhoto2(String iDCardPhoto2) {
		IDCardPhoto2 = iDCardPhoto2;
	}
	public String getDriverLicensePhoto() {
		return driverLicensePhoto;
	}
	public void setDriverLicensePhoto(String driverLicensePhoto) {
		this.driverLicensePhoto = driverLicensePhoto;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getSourceOfCertification() {
		return sourceOfCertification;
	}
	public void setSourceOfCertification(String sourceOfCertification) {
		this.sourceOfCertification = sourceOfCertification;
	}
	
	public String getForeignPeopleLivingOnTheTable() {
		return foreignPeopleLivingOnTheTable;
	}
	public void setForeignPeopleLivingOnTheTable(String foreignPeopleLivingOnTheTable) {
		this.foreignPeopleLivingOnTheTable = foreignPeopleLivingOnTheTable;
	}
	
	public String getXSZZP() {
		return XSZZP;
	}
	public void setXSZZP(String xSZZP) {
		XSZZP = xSZZP;
	}
	@Override 
    public String toString() { 
		return ReflectionToStringBuilder.toString(this); 
    }
	
}
