package cn.handle.bean.vo;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import cn.sdk.util.DateUtil2;
/**
 * 模板点击之后显示的字段
 * @author Mbenben
 */
@SuppressWarnings(value="all")
public class HandleTemplateVo implements Serializable{
	
	
	public static void main(String[] args) {
		HandleTemplateVo handleTemplateVo = new HandleTemplateVo(1, "complementTheMotorVehicleDrivingLicense", "33333333333", DateUtil2.date2str(new Date()));
		try {
			String baseUrl = "/appointSuccess?";
			String url = HandleTemplateVo.getUrl(handleTemplateVo,baseUrl);
			System.out.println(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
     * javaBean 转 Map
     * @param object 需要转换的javabean
     * @return  转换结果map
     * @throws Exception
     */
    public static Map<String, Object> beanToMap(Object object) throws Exception
    {
        Map<String, Object> map = new HashMap<String, Object>();
        Class cls = object.getClass();
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if(null != field.get(object)){
            	map.put(field.getName(), field.get(object));
            }
        }
        return map;
    }
	public static String getUrlParamsByMap(Map<String, Object> map,boolean isSort) {
	      if (map == null) {
	          return "";
	      }
	      StringBuffer sb = new StringBuffer();
	      List<String> keys = new ArrayList<String>(map.keySet());
	      if (isSort) {
	          Collections.sort(keys);
	      }
	      for (int i = 0; i < keys.size(); i++) {
	          String key = keys.get(i);
	          String value = map.get(key).toString();
	          sb.append(key + "=" + value);
	          sb.append("&");
	      }
	      String s = sb.toString();
	      if (s.endsWith("&")) {
	          s = s.substring(0, s.lastIndexOf("&"));
	      }
	      return s;
	}
	public static String getUrl(HandleTemplateVo handleTemplateVo,String baseUrl) throws Exception{
		StringBuffer sBuffer = new StringBuffer();
		Map<String, Object> map = beanToMap(handleTemplateVo);
		String paramsStr = getUrlParamsByMap(map, true);
		sBuffer.append(baseUrl).append(paramsStr);
		return sBuffer.toString();
	}
	
	private Integer type; //业务类型  1-办理类，2-预约类
	private String title; //具体业务类型,例如 六年免检申请
	private String plateType; //号牌种类
	private String numberPlate; //号牌号码
	private String mobilephone; //手机号码
	private String effectiveTime; //有效时间
	private String waterNumber; //流水号码
	private String bidDate; //申办日期
	
	
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setBusinessType(String title) {
		this.title = title;
	}
	public String getPlateType() {
		return plateType;
	}
	public void setPlateType(String plateType) {
		this.plateType = plateType;
	}
	public String getNumberPlate() {
		return numberPlate;
	}
	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getEffectiveTime() {
		return effectiveTime;
	}
	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
	}
	public String getWaterNumber() {
		return waterNumber;
	}
	public void setWaterNumber(String waterNumber) {
		this.waterNumber = waterNumber;
	}
	public String getBidDate() {
		return bidDate;
	}
	public void setBidDate(String bidDate) {
		this.bidDate = bidDate;
	}
	/**
	 * 
	 * @param type 业务类型  1-办理类，2-预约类
	 * @param title 具体业务类型,例如 六年免检申请
	 * @param waterNumber 流水号码
	 * @param bidDate 申办日期
	 */
	public HandleTemplateVo(Integer type, String title, String waterNumber, String bidDate) {
		this.type = type;
		this.title = title;
		this.waterNumber = waterNumber;
		this.bidDate = bidDate;
	}
	/**
	 * 
	 * @param type 业务类型  1-办理类，2-预约类
	 * @param title 具体业务类型,例如 六年免检申请
	 * @param bidDate 申办日期
	 */
	public HandleTemplateVo(Integer type, String title,  String bidDate) {
		this.type = type;
		this.title = title;
		this.bidDate = bidDate;
	}
	/**
	 * 
	 * @param type 业务类型  1-办理类，2-预约类
	 * @param title 具体业务类型,例如 六年免检申请
	 * @param plateType 号牌种类
	 * @param numberPlate 号牌号码
	 * @param mobilephone 手机号
	 * @param effectiveTime 有效时间
	 */
	public HandleTemplateVo(Integer type, String title, String plateType, String numberPlate, String mobilephone,
			String effectiveTime) {
		this.type = type;
		this.title = title;
		this.plateType = plateType;
		this.numberPlate = numberPlate;
		this.mobilephone = mobilephone;
		this.effectiveTime = effectiveTime;
	}
	
	public HandleTemplateVo() {
		
	}
	@Override 
    public String toString() { 
		return ReflectionToStringBuilder.toString(this); 
    }
	
}