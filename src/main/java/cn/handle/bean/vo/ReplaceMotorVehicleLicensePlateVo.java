package cn.handle.bean.vo;

import java.io.Serializable;

/**
 * 补领机动车号牌
 * @author Mbenben
 *
 */
public class ReplaceMotorVehicleLicensePlateVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 388817309883897433L;

	private String name;					//车主姓名
	private String identityCard;			//身份证号码
	private String carOwnerIdentityCard;	//车主身份证号码
	private String numberPlate;				//车牌号码
	private String plateType;				//车牌类型
	private String placeOfDomicile;			//户籍所在地
    private String receiverName;			//收件人姓名
    private String receiverNumber;			//收件人号码
    private String receiverAddress;			//收件人地址
    private String address;					//住所详细地址
    private String PHOTO9;					//身份证正面图片
    private String PHOTO10;					//身份证反面图片
    private String DJZSFYJ;					//机动车登记证书
    
    private String residenceNo;				//居住证号码
    private String JZZA;					//居住证正面图片
    private String JZZB;					//居住证反面图片
    private String PHOTO31;					//境外人员临住表
    private String ip;						//外网录入ip
    private String sourceOfCertification;	//申请来源
    private String loginUserIdentityCard;	//登录用户身份证号码
    
    private String openId;					//微信公众号唯一标识
    
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getResidenceNo() {
		return residenceNo;
	}
	public void setResidenceNo(String residenceNo) {
		this.residenceNo = residenceNo;
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
	public String getPHOTO31() {
		return PHOTO31;
	}
	public void setPHOTO31(String pHOTO31) {
		PHOTO31 = pHOTO31;
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
	public String getLoginUserIdentityCard() {
		return loginUserIdentityCard;
	}
	public void setLoginUserIdentityCard(String loginUserIdentityCard) {
		this.loginUserIdentityCard = loginUserIdentityCard;
	}
}
