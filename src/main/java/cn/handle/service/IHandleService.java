package cn.handle.service;

import java.util.Map;

import com.alibaba.fastjson.JSONObject;

import cn.handle.bean.vo.ApplyCarTemporaryLicenceVo;
import cn.handle.bean.vo.ApplyGatePassVo;
import cn.handle.bean.vo.ApplyInspectionMarkVo;
import cn.handle.bean.vo.ApplyRemoteEntrustedBusinessVo;
import cn.handle.bean.vo.CarMortgageVo;
import cn.handle.bean.vo.CreateVehicleInspectionVo;
import cn.handle.bean.vo.DelegateVehiclesVo;
import cn.handle.bean.vo.DriverChangeContactVo;
import cn.handle.bean.vo.DriverLicenseAnnualVerificationVo;
import cn.handle.bean.vo.DriverLicenseIntoVo;
import cn.handle.bean.vo.DriverLicenseVoluntaryDemotionVo;
import cn.handle.bean.vo.IocomotiveCarChangeContactVo;
import cn.handle.bean.vo.IocomotiveCarReplaceVo;
import cn.handle.bean.vo.RenewalDriverLicenseVo;
import cn.handle.bean.vo.RepairOrReplaceDriverLicenseVo;
import cn.handle.bean.vo.ReplaceMotorVehicleLicensePlateVo;
import cn.handle.bean.vo.VehicleDrivingLicenseVo;
import cn.sdk.bean.BaseBean;



public interface IHandleService {
	/**
	 * 获取域名地址
	 * @return
	 */
	public String getTemplateSendUrl();
	/**
	 * 获取msjw域名地址
	 * @return
	 */
	public String getMsjwTemplateSendUrl();
	/**
	 * 获取msjw办理模板id
	 * @return
	 */
	public String getMsjwHandleTemplateId();
	/**
	 * 获取msjw机动车抵押登记域名地址
	 * @return
	 */
	public String getMsjwCarMortgageUrl();
	/**
	 * 获取msjw六年免检url
	 * @return
	 */
	public String getMsjwSixyearsUrl();
	/**
	 * 驾驶证年审
	 * @param driverLicenseAnnualVerificationVo
	 * @return
	 */
	
	public Map<String, String> driverLicenseAnnualVerification(
			DriverLicenseAnnualVerificationVo driverLicenseAnnualVerificationVo)  throws Exception;
	
	/**
	 * 驾驶证延期换证
	 * @param renewalDriverLicenseVo
	 * @return
	 */
	public Map<String, String> renewalDriverLicense(RenewalDriverLicenseVo renewalDriverLicenseVo) throws Exception;
	
	
	
	
	/**
	 * 驾驶证转入
	 * @param driverLicenseIntoVo
	 * @return
	 */
	public Map<String, String> driverLicenseInto(DriverLicenseIntoVo driverLicenseIntoVo) throws Exception;
	
	/**
	 * 驾驶证自愿降级
	 * @param driverLicenseVoluntaryDemotionVo
	 * @return
	 */
	public Map<String, String> driverLicenseVoluntaryDemotion(
			DriverLicenseVoluntaryDemotionVo driverLicenseVoluntaryDemotionVo) throws Exception;
	
	
	
	/**
	 * 驾驶人联系方式变更
	 * @param driverChangeContactVo
	 * @return
	 */
	public Map<String, String> driverChangeContact(DriverChangeContactVo driverChangeContactVo) throws Exception;
	/**
	 * 驾驶证补证
	 * @param repairOrReplaceDriverLicenseVo
	 * @return
	 */
	public Map<String, String> repairDriverLicense(RepairOrReplaceDriverLicenseVo repairOrReplaceDriverLicenseVo) throws Exception;
	/**
	 * 驾驶证换证
	 * @param repairOrReplaceDriverLicenseVo
	 * @return
	 */
	public Map<String, String> replaceDriverLicense(RepairOrReplaceDriverLicenseVo repairOrReplaceDriverLicenseVo) throws Exception;

	/**
	 * 申请通行证(外地车)
	 * @param applyGatePassVo
	 * @return
	 */
	public Map<String, String> applyGatePass(ApplyGatePassVo applyGatePassVo) throws Exception;
	
	/**
	 * 申请机动车临牌
	 * @param applyGatePassVo
	 * @return
	 */
	public Map<String, String> applyCarTemporaryLicence(ApplyCarTemporaryLicenceVo applyCarTemporaryLicenceVo) throws Exception;
	
	/**
	 * 机动车联系方式变更
	 * @param iocomotiveCarChangeContactVo
	 * @return
	 */
	public Map<String, String> iocomotiveCarChangeContact(IocomotiveCarChangeContactVo iocomotiveCarChangeContactVo) throws Exception;
	
	/**
	 * 换领机动车行驶证
	 * @param iocomotiveCarReplaceVo
	 * @return
	 */
	public Map<String, String> iocomotiveCarReplace(IocomotiveCarReplaceVo iocomotiveCarReplaceVo) throws Exception;
	
	/**
	 * 补领机动车行驶证
	 * @param vehicleDrivingLicenseVo
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> complementTheMotorVehicleDrivingLicense(VehicleDrivingLicenseVo vehicleDrivingLicenseVo)throws Exception;
	/**
	 * 补换检验合格标志
	 * @param applyGatePassVo
	 * @return
	 */
	public Map<String, String> replaceInspectionMark(ApplyInspectionMarkVo applyCarTemporaryLicenceVo) throws Exception;
	
	/**
	 * 机动车委托异地定期检验申报
	 * @param applyGatePassVo
	 * @return
	 */
	public Map<String, String> inspectionDeclaration(ApplyRemoteEntrustedBusinessVo applyCarTemporaryLicenceVo) throws Exception;
	
	/**
	 * 机动车委托异地定期检验申报查询
	 * @param applyGatePassVo
	 * @return
	 */
	public Map<String, String> inspectionDeclarationQuery(String identityCard,String sourceOfCertification) throws Exception;

	/**
	 * 机动车六年免检预约信息写入
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public BaseBean createVehicleInspection(CreateVehicleInspectionVo createVehicleInspectionVo)throws Exception;
	/**
	 * 获取车辆类型列表
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public JSONObject getCarTypes() throws Exception;
	/**
	 * 取消机动车六年免检预约
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public JSONObject cancelVehicleInspection(String bookNumber, String numberPlate) throws Exception;
	/**
	 * 获取机动车六年免检预约信息
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public JSONObject getVehicleInspection(String bookNumber, String numberPlate, String driveLicenseNumber) throws Exception;
	/**
	 * 补领机动车号牌
	 * @param vo 补领机动车号牌 申请信息
	 * @return
	 * @throws Exception
	 */
	public BaseBean replaceMotorVehicleLicensePlate(ReplaceMotorVehicleLicensePlateVo vo)throws Exception;
	/**
	 * 首违免罚查询
	 * @param numberPlate
	 * @param plateType
	 * @param id
	 * @param queryType
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> getResultOfFirstIllegalImpunity(String numberPlate ,String plateType , String illegalNumber ,String queryType) throws Exception;
	/**
	 * 车管电子委托机动车
	 * @param delegateVehiclesVo
	 * @return
	 * @throws Exception
	 */
	public BaseBean electronicDelegateVehicles(DelegateVehiclesVo delegateVehiclesVo)throws Exception;
	/**
	 * 申请或取消机动车抵押
	 * @return
	 * @throws Exception
	 */
	public BaseBean applyOrCancleCarMortgage(CarMortgageVo carMortgageVo)throws Exception;
	/**
	 * 查询机动车抵押
	 * @return
	 * @throws Exception
	 */
	public BaseBean queryCarMortgage(String loginUser,String sqlx,String sourceOfCertification)throws Exception;
}
