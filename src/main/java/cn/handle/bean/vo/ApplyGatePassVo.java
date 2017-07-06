package cn.handle.bean.vo;

import java.io.Serializable;

/**
 * @ClassName: ApplyGatePassVo
 * @Description: TODO(申请通行证vo)
 * @author yangzan
 * @date 2017年7月3日
 */
public class ApplyGatePassVo implements Serializable{

	/** 
	 * @Fields serialVersionUID : 
	 */ 
	private static final long serialVersionUID = -527148300690047903L;
	
	private String plateType;	//号牌种类
	private String cartype;		//车辆类型
	private String abbreviation;//车牌简称
	private String numberPlate;	//车牌号码
	private String vin;			//车架号
	private String userName;	//车辆所有人
	private String mobilephone;	//手机号码
	private String applyDate;	//申请日期
	private String identityCard;//身份证
	private String remarks;		//备注
	public String getPlateType() {
		return plateType;
	}
	public void setPlateType(String plateType) {
		this.plateType = plateType;
	}
	public String getCartype() {
		return cartype;
	}
	public void setCartype(String cartype) {
		this.cartype = cartype;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	public String getNumberPlate() {
		return numberPlate;
	}
	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}
	
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "ApplyGatePassVo [plateType=" + plateType + ", cartype=" + cartype + ", abbreviation=" + abbreviation
				+ ", numberPlate=" + numberPlate + ", vin=" + vin + ", userName=" + userName + ", mobilephone="
				+ mobilephone + ", applyDate=" + applyDate + ", identityCard=" + identityCard + ", remarks=" + remarks
				+ "]";
	}
	
}