package cn.handle.bean.vo;

import java.io.Serializable;

/** 
 * @author lifangyong
 * @date 2017年7月3日 下午5:44:40 
 */
public class IocomotiveCarChangeContactVo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name; //车主姓名
	private String identificationNO; //证件种类
	private String identificationNum; //证件号码
	private String numberPlate; //号牌号码
	private String plateType; //号牌种类
	private String placeOfDomicile; //户籍所在地
	private String behindTheFrame4Digits; //车架号
	private String mobilephone; //变更号码
	private String receiverAddress; //地址
	private String PHOTO9; //身份证（正面）
	private String PHOTO10;//身份证（反面）
	private String JDCXSZ; //机动车行驶证照片
	private String ip;//ip
	private String sourceOfCertification;//申请来源
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdentificationNO() {
		return identificationNO;
	}
	public void setIdentificationNO(String identificationNO) {
		this.identificationNO = identificationNO;
	}
	public String getIdentificationNum() {
		return identificationNum;
	}
	public void setIdentificationNum(String identificationNum) {
		this.identificationNum = identificationNum;
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
	public String getBehindTheFrame4Digits() {
		return behindTheFrame4Digits;
	}
	public void setBehindTheFrame4Digits(String behindTheFrame4Digits) {
		this.behindTheFrame4Digits = behindTheFrame4Digits;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getReceiverAddress() {
		return receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
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
	public String getJDCXSZ() {
		return JDCXSZ;
	}
	public void setJDCXSZ(String jDCXSZ) {
		JDCXSZ = jDCXSZ;
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
		return "IocomotiveCarChangeContactVo [name=" + name + ", identificationNO=" + identificationNO
				+ ", identificationNum=" + identificationNum + ", numberPlate=" + numberPlate + ", plateType="
				+ plateType + ", placeOfDomicile=" + placeOfDomicile + ", behindTheFrame4Digits="
				+ behindTheFrame4Digits + ", mobilephone=" + mobilephone + ", receiverAddress=" + receiverAddress
				+ ", PHOTO9=" + PHOTO9 + ", PHOTO10=" + PHOTO10 + ", JDCXSZ=" + JDCXSZ + ", ip=" + ip
				+ ", sourceOfCertification=" + sourceOfCertification + "]";
	}
	
}
