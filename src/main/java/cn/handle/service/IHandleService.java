package cn.handle.service;

import java.util.Map;

import cn.handle.bean.vo.ApplyCarTemporaryLicenceVo;
import cn.handle.bean.vo.ApplyGatePassVo;
import cn.handle.bean.vo.ApplyInspectionMarkVo;
import cn.handle.bean.vo.ApplyRemoteEntrustedBusinessVo;
import cn.handle.bean.vo.DriverChangeContactVo;
import cn.handle.bean.vo.DriverLicenseAnnualVerificationVo;
import cn.handle.bean.vo.DriverLicenseIntoVo;
import cn.handle.bean.vo.DriverLicenseVoluntaryDemotionVo;
import cn.handle.bean.vo.IocomotiveCarChangeContactVo;
import cn.handle.bean.vo.IocomotiveCarReplaceVo;
import cn.handle.bean.vo.RenewalDriverLicenseVo;
import cn.handle.bean.vo.RepairOrReplaceDriverLicenseVo;
import cn.handle.bean.vo.VehicleDrivingLicenseVo;



public interface IHandleService {
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
}
