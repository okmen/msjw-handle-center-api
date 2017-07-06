package cn.handle.bean.vo;

import java.io.Serializable;

/**
 * @ClassName: ApplyCarTemporaryLicenceVo
 * @Description: TODO(申请机动车临牌)
 * @author yangzan
 * @date 2017年7月4日
 */
public class ApplyCarTemporaryLicenceVo implements Serializable{

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */ 
	private static final long serialVersionUID = 8240894194003460527L;
	
	private String userName;	//姓名
	private String identityCard;	//身份证
	private String mobilephone;		//手机号
	private String cartModels;		//车辆型号
	private String cartype;			//车辆类型
	private String engineNumber;	//发动机号
	private String vin;			//车架号
	private String carOrigin;	//车辆产地 国产/进口（A是国产B是进口）
	private String placeOfDomicile;	//户籍所在地
	private String receiverName;	//收件人姓名
	private String receiverNumber;	//收件人号码
	private String receiverAddress;		//收件人地址
	private String PHOTO26;		//有效购置发票
	private String PHOTO27;		//交强险单据
	private String PHOTO9;		//身份证正面
	private String PHOTO10;		//身份证反面
	private String PHOTO28;		//机动车合格证
	private String PHOTO31;		//境外人员临住表
	private String PHOTO29;		//进口货物证明书
	private String ip;		//ip地址
	private String sourceOfCertification; //申请来源（A移动APP C微信Z支付宝E邮政）
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
	public String getCartModels() {
		return cartModels;
	}
	public void setCartModels(String cartModels) {
		this.cartModels = cartModels;
	}
	public String getCartype() {
		return cartype;
	}
	public void setCartype(String cartype) {
		this.cartype = cartype;
	}
	public String getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getCarOrigin() {
		return carOrigin;
	}
	public void setCarOrigin(String carOrigin) {
		this.carOrigin = carOrigin;
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
	public String getPHOTO26() {
		return PHOTO26;
	}
	public void setPHOTO26(String pHOTO26) {
		PHOTO26 = pHOTO26;
	}
	public String getPHOTO27() {
		return PHOTO27;
	}
	public void setPHOTO27(String pHOTO27) {
		PHOTO27 = pHOTO27;
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
	public String getPHOTO28() {
		return PHOTO28;
	}
	public void setPHOTO28(String pHOTO28) {
		PHOTO28 = pHOTO28;
	}
	public String getPHOTO31() {
		return PHOTO31;
	}
	public void setPHOTO31(String pHOTO31) {
		PHOTO31 = pHOTO31;
	}
	public String getPHOTO29() {
		return PHOTO29;
	}
	public void setPHOTO29(String pHOTO29) {
		PHOTO29 = pHOTO29;
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
		return "ApplyCarTemporaryLicenceVo [userName=" + userName + ", identityCard=" + identityCard + ", mobilephone="
				+ mobilephone + ", cartModels=" + cartModels + ", cartype=" + cartype + ", engineNumber=" + engineNumber
				+ ", vin=" + vin + ", carOrigin=" + carOrigin + ", placeOfDomicile=" + placeOfDomicile
				+ ", receiverName=" + receiverName + ", receiverNumber=" + receiverNumber + ", receiverAddress="
				+ receiverAddress + ", PHOTO26=" + PHOTO26 + ", PHOTO27=" + PHOTO27 + ", PHOTO9=" + PHOTO9
				+ ", PHOTO10=" + PHOTO10 + ", PHOTO28=" + PHOTO28 + ", PHOTO31=" + PHOTO31 + ", PHOTO29=" + PHOTO29
				+ ", ip=" + ip + ", sourceOfCertification=" + sourceOfCertification + "]";
	}
}
