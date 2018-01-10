package cn.handle.bean.vo;

import java.io.Serializable;

public class CarMortgageBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String serialNumber;//流水号
	private String carNumber;//车牌号码
	private String numberPlate;//号牌种类
	private String businessType;//业务类型
	private String carCode;//车辆识别代号
	private String ownerIDcard;//车主身份证号
	private String ownerName;//车主姓名
	private String mainContractNo;//主合同号
	private String mortgageContactNo;//抵押合同号
	private String state;//状态
	private String sourceOfCertification;//录入来源
	private String applyTime;//申办时间
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getNumberPlate() {
		return numberPlate;
	}
	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getCarCode() {
		return carCode;
	}
	public void setCarCode(String carCode) {
		this.carCode = carCode;
	}
	public String getOwnerIDcard() {
		return ownerIDcard;
	}
	public void setOwnerIDcard(String ownerIDcard) {
		this.ownerIDcard = ownerIDcard;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getMainContractNo() {
		return mainContractNo;
	}
	public void setMainContractNo(String mainContractNo) {
		this.mainContractNo = mainContractNo;
	}
	public String getMortgageContactNo() {
		return mortgageContactNo;
	}
	public void setMortgageContactNo(String mortgageContactNo) {
		this.mortgageContactNo = mortgageContactNo;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getSourceOfCertification() {
		return sourceOfCertification;
	}
	public void setSourceOfCertification(String sourceOfCertification) {
		this.sourceOfCertification = sourceOfCertification;
	}
	public String getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(String applyTime) {
		this.applyTime = applyTime;
	}
	
	
}
