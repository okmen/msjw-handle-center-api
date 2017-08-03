package cn.handle.bean.vo;

import java.io.Serializable;

public class InspectionDeclarationVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7180204488445678330L;
	private String HPHM;	//有效格式车牌号码
	private String HPZL;	//号牌类型（取值见“元素取值”章节）
	private String CLSYQ;	//车子所有权(0:个人 1:单位)
	private String SFZMHM;	//车主身份证号码
	private String SYR;	//车主姓名
	private String STJG;	//委托机构
	private String LSH;	//流水号
	private String LRZHLX;	//申报方式（A移动APP C微信Z支付宝E邮政）
	private String YJ_SJRXM;	//收件人姓名
	private String YJ_LXDH;	//联系电话
	private String YJ_TDDZ;	//收件人地址
	private String SQSJ;	//申请时间
	private String SBZT;	//状态（0 待审 1 初审 2 复核  3 通知书已接收 4快递已寄出  CT-车管申办失败  YT-邮政申办失败 QT个人取消申请 QQ群众业务退办 CC 车管业务退办）
	private String FKFS;	//付款方式（0到付，1已付款）
	public String getHPHM() {
		return HPHM;
	}
	public void setHPHM(String hPHM) {
		HPHM = hPHM;
	}
	public String getHPZL() {
		return HPZL;
	}
	public void setHPZL(String hPZL) {
		HPZL = hPZL;
	}
	public String getCLSYQ() {
		return CLSYQ;
	}
	public void setCLSYQ(String cLSYQ) {
		CLSYQ = cLSYQ;
	}
	public String getSFZMHM() {
		return SFZMHM;
	}
	public void setSFZMHM(String sFZMHM) {
		SFZMHM = sFZMHM;
	}
	public String getSYR() {
		return SYR;
	}
	public void setSYR(String sYR) {
		SYR = sYR;
	}
	public String getSTJG() {
		return STJG;
	}
	public void setSTJG(String sTJG) {
		STJG = sTJG;
	}
	public String getLSH() {
		return LSH;
	}
	public void setLSH(String lSH) {
		LSH = lSH;
	}
	public String getLRZHLX() {
		return LRZHLX;
	}
	public void setLRZHLX(String lRZHLX) {
		LRZHLX = lRZHLX;
	}
	public String getYJ_SJRXM() {
		return YJ_SJRXM;
	}
	public void setYJ_SJRXM(String yJ_SJRXM) {
		YJ_SJRXM = yJ_SJRXM;
	}
	public String getYJ_LXDH() {
		return YJ_LXDH;
	}
	public void setYJ_LXDH(String yJ_LXDH) {
		YJ_LXDH = yJ_LXDH;
	}
	public String getYJ_TDDZ() {
		return YJ_TDDZ;
	}
	public void setYJ_TDDZ(String yJ_TDDZ) {
		YJ_TDDZ = yJ_TDDZ;
	}
	public String getSQSJ() {
		return SQSJ;
	}
	public void setSQSJ(String sQSJ) {
		SQSJ = sQSJ;
	}
	public String getSBZT() {
		return SBZT;
	}
	public void setSBZT(String sBZT) {
		SBZT = sBZT;
	}
	public String getFKFS() {
		return FKFS;
	}
	public void setFKFS(String fKFS) {
		FKFS = fKFS;
	}

}
