package cn.handle.bean.vo;

import java.io.Serializable;

public class ResultOfFirstIllegalImpunityVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id ;//记录ID
	private String numberPlate ;//号牌号码
	private String plateType ;//号牌种类
	private String illegalTime ;//违法时间
	private String illegalAddress ;//违法地址
	private String illegalSite ;//违法地点
	private String sectionsCode ;//路段代码
	private String illegalAction ;//违法行为
	private String illegalContent ;//违法内容
	private String illegalMoney ;//罚款金额
	private String illegalCore ;//违法记分数
	private String inputTime ;//录入时间
	private String foundAuthority ;//发现机关
	private String foundAuthorityName ;//发现机关名称
	private String illegalNumber ;//违法序号
	private String productiveTime ;//运算时间
	private String updateTime ;//更新时间
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getIllegalTime() {
		return illegalTime;
	}
	public void setIllegalTime(String illegalTime) {
		this.illegalTime = illegalTime;
	}
	public String getIllegalAddress() {
		return illegalAddress;
	}
	public void setIllegalAddress(String illegalAddress) {
		this.illegalAddress = illegalAddress;
	}
	public String getIllegalSite() {
		return illegalSite;
	}
	public void setIllegalSite(String illegalSite) {
		this.illegalSite = illegalSite;
	}
	public String getSectionsCode() {
		return sectionsCode;
	}
	public void setSectionsCode(String sectionsCode) {
		this.sectionsCode = sectionsCode;
	}
	public String getIllegalAction() {
		return illegalAction;
	}
	public void setIllegalAction(String illegalAction) {
		this.illegalAction = illegalAction;
	}
	public String getIllegalContent() {
		return illegalContent;
	}
	public void setIllegalContent(String illegalContent) {
		this.illegalContent = illegalContent;
	}
	public String getIllegalMoney() {
		return illegalMoney;
	}
	public void setIllegalMoney(String illegalMoney) {
		this.illegalMoney = illegalMoney;
	}
	public String getIllegalCore() {
		return illegalCore;
	}
	public void setIllegalCore(String illegalCore) {
		this.illegalCore = illegalCore;
	}
	public String getInputTime() {
		return inputTime;
	}
	public void setInputTime(String inputTime) {
		this.inputTime = inputTime;
	}
	public String getFoundAuthority() {
		return foundAuthority;
	}
	public void setFoundAuthority(String foundAuthority) {
		this.foundAuthority = foundAuthority;
	}
	public String getFoundAuthorityName() {
		return foundAuthorityName;
	}
	public void setFoundAuthorityName(String foundAuthorityName) {
		this.foundAuthorityName = foundAuthorityName;
	}
	public String getIllegalNumber() {
		return illegalNumber;
	}
	public void setIllegalNumber(String illegalNumber) {
		this.illegalNumber = illegalNumber;
	}
	public String getProductiveTime() {
		return productiveTime;
	}
	public void setProductiveTime(String productiveTime) {
		this.productiveTime = productiveTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "ResultOfFirstIllegalImpunityVo [id=" + id + ", numberPlate=" + numberPlate + ", plateType=" + plateType
				+ ", illegalTime=" + illegalTime + ", illegalAddress=" + illegalAddress + ", illegalSite=" + illegalSite
				+ ", sectionsCode=" + sectionsCode + ", illegalAction=" + illegalAction + ", illegalContent="
				+ illegalContent + ", illegalMoney=" + illegalMoney + ", illegalCore=" + illegalCore + ", inputTime="
				+ inputTime + ", foundAuthority=" + foundAuthority + ", foundAuthorityName=" + foundAuthorityName
				+ ", illegalNumber=" + illegalNumber + ", productiveTime=" + productiveTime + ", updateTime="
				+ updateTime + "]";
	}
	
	
	
	
	
	
}
