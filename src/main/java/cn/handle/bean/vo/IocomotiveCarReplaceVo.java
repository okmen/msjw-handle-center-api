package cn.handle.bean.vo;

import java.io.Serializable;

/** 
 * @author lifangyong
 * @date 2017年7月4日 上午11:12:00 
 */
public class IocomotiveCarReplaceVo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String name;					//	车主姓名
	private String carOwnerIdentityCard;					//	证件号码
	private String numberPlate;			//	号牌号码
	private String plateType;		//	号牌种类
	private String placeOfDomicile;			//	户籍所在地
	private String address;					//	住所详细地址
	private String receiverName;			//	收件人姓名
	private String receiverNumber;			//	收件人号码
	private String receiverAddress;			//	收件人地址
	private String JZZA;				//	居住证正面
	private String JZZB;				//	居住证反面
	private String PHOTO9;			//	身份证（正面）
	private String PHOTO10;			//	身份证（反面）
	private String DJZSFYJ;		//	机动车登记证书
	private String ip;						//	ip
	private String sourceOfCertification;	//	申请来源
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
	public String getNumberPlate() {
		return numberPlate;
	}
	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
	public String getPlateType() {
		return plateType;
	}
	public void setPlateType(String plateType) {
		this.plateType = plateType;
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
	public String getReceiverAddress() {
		return receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	public String getJZZA() {
		return JZZA;
	}
	public void setJZZA(String jZZA) {
		JZZA = jZZA;
	}
	public String getJZZB() {
		return JZZB;
	}
	public void setJZZB(String jZZB) {
		JZZB = jZZB;
	}
	public String getPHOTO9() {
		return PHOTO9;
	}
	public void setPHOTO9(String pHOTO9) {
		PHOTO9 = pHOTO9;
	}
	public String getPHOTO10() {
		return PHOTO10;
	}
	public void setPHOTO10(String pHOTO10) {
		PHOTO10 = pHOTO10;
	}
	public String getDJZSFYJ() {
		return DJZSFYJ;
	}
	public void setDJZSFYJ(String dJZSFYJ) {
		DJZSFYJ = dJZSFYJ;
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
	@Override
	public String toString() {
		return "IocomotiveCarReplaceVo [name=" + name + ", carOwnerIdentityCard=" + carOwnerIdentityCard
				+ ", numberPlate=" + numberPlate + ", plateType=" + plateType + ", placeOfDomicile=" + placeOfDomicile
				+ ", address=" + address + ", receiverName=" + receiverName + ", receiverNumber=" + receiverNumber
				+ ", receiverAddress=" + receiverAddress + ", JZZA=" + JZZA + ", JZZB=" + JZZB + ", PHOTO9=" + PHOTO9
				+ ", PHOTO10=" + PHOTO10 + ", DJZSFYJ=" + DJZSFYJ + ", ip=" + ip + ", sourceOfCertification="
				+ sourceOfCertification + "]";
	}
	
}
