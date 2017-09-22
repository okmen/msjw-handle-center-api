package cn.handle.bean.vo;

import java.io.Serializable;

public class DelegateVehiclesVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String businessType;			//业务类型
	private String businessReason;			//业务原因
	private String bailerName;				//委托人姓名
	private String bailerIdentityCard;		//委托人身份证号码
	private String bailerNumberPlate;		//委托号牌种类
	private String bailerLicenseNumber;		//委托车牌号码
	private String bailerValidTime;			//委托有效时间
	private String baileeName;				//受托人姓名
	private String baileeIdentitycard;		//受托人身份证号码
	private String baileeMobilephone;		//受托人电话
	private String userSource;				//用户来源
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getBusinessReason() {
		return businessReason;
	}
	public void setBusinessReason(String businessReason) {
		this.businessReason = businessReason;
	}
	public String getBailerName() {
		return bailerName;
	}
	public void setBailerName(String bailerName) {
		this.bailerName = bailerName;
	}
	public String getBailerIdentityCard() {
		return bailerIdentityCard;
	}
	public void setBailerIdentityCard(String bailerIdentityCard) {
		this.bailerIdentityCard = bailerIdentityCard;
	}
	public String getBailerNumberPlate() {
		return bailerNumberPlate;
	}
	public void setBailerNumberPlate(String bailerNumberPlate) {
		this.bailerNumberPlate = bailerNumberPlate;
	}
	public String getBailerLicenseNumber() {
		return bailerLicenseNumber;
	}
	public void setBailerLicenseNumber(String bailerLicenseNumber) {
		this.bailerLicenseNumber = bailerLicenseNumber;
	}
	public String getBailerValidTime() {
		return bailerValidTime;
	}
	public void setBailerValidTime(String bailerValidTime) {
		this.bailerValidTime = bailerValidTime;
	}
	public String getBaileeName() {
		return baileeName;
	}
	public void setBaileeName(String baileeName) {
		this.baileeName = baileeName;
	}
	public String getBaileeIdentitycard() {
		return baileeIdentitycard;
	}
	public void setBaileeIdentitycard(String baileeIdentitycard) {
		this.baileeIdentitycard = baileeIdentitycard;
	}
	public String getBaileeMobilephone() {
		return baileeMobilephone;
	}
	public void setBaileeMobilephone(String baileeMobilephone) {
		this.baileeMobilephone = baileeMobilephone;
	}
	public String getUserSource() {
		return userSource;
	}
	public void setUserSource(String userSource) {
		this.userSource = userSource;
	}
	@Override
	public String toString() {
		return "DelegateVehiclesVo [businessType=" + businessType + ", businessReason=" + businessReason
				+ ", bailerName=" + bailerName + ", bailerIdentityCard=" + bailerIdentityCard + ", bailerNumberPlate="
				+ bailerNumberPlate + ", bailerLicenseNumber=" + bailerLicenseNumber + ", bailerValidTime="
				+ bailerValidTime + ", baileeName=" + baileeName + ", baileeIdentitycard=" + baileeIdentitycard
				+ ", baileeMobilephone=" + baileeMobilephone + ", userSource=" + userSource + "]";
	}
	

}
