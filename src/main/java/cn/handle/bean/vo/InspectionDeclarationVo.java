package cn.handle.bean.vo;

import java.io.Serializable;


public class InspectionDeclarationVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7180204488445678330L;
	public String HPHM;	//有效格式车牌号码
	public String HPZL;	//号牌类型（取值见“元素取值”章节）
	public String CLSYQ;	//车子所有权(0:个人 1:单位)
	public String SFZMHM;	//车主身份证号码
	public String SYR;	//车主姓名
	public String STJG;	//委托机构
	public String LSH;	//流水号
	public String LRZHLX;	//申报方式（A移动APP C微信Z支付宝E邮政）
	public String YJ_SJRXM;	//收件人姓名
	public String YJ_LXDH;	//联系电话
	public String YJ_TDDZ;	//收件人地址
	public String SQSJ;	//申请时间
	public String SBZT;	//状态（0 待审 1 初审 2 复核  3 通知书已接收 4快递已寄出  CT-车管申办失败  YT-邮政申办失败 QT个人取消申请 QQ群众业务退办 CC 车管业务退办）
	public String FKFS;	//付款方式（0到付，1已付款）

	public void setHPHM(String hPHM) {
		HPHM = hPHM;
	}

	public void setHPZL(String hPZL) {
		HPZL = hPZL;
	}

	public void setCLSYQ(String cLSYQ) {
		CLSYQ = cLSYQ;
	}

	public void setSFZMHM(String sFZMHM) {
		SFZMHM = sFZMHM;
	}

	public void setSYR(String sYR) {
		SYR = sYR;
	}

	public void setSTJG(String sTJG) {
		STJG = sTJG;
	}

	public void setLSH(String lSH) {
		LSH = lSH;
	}

	public void setLRZHLX(String lRZHLX) {
		LRZHLX = lRZHLX;
	}

	public void setYJ_SJRXM(String yJ_SJRXM) {
		YJ_SJRXM = yJ_SJRXM;
	}

	public void setYJ_LXDH(String yJ_LXDH) {
		YJ_LXDH = yJ_LXDH;
	}

	public void setYJ_TDDZ(String yJ_TDDZ) {
		YJ_TDDZ = yJ_TDDZ;
	}

	public void setSQSJ(String sQSJ) {
		SQSJ = sQSJ;
	}

	public void setSBZT(String sBZT) {
		SBZT = sBZT;
	}

	public void setFKFS(String fKFS) {
		FKFS = fKFS;
	}

}
