package com.gll.ls.utils.web.result;

/**
 * 自定义系统异常类
 */
public class ExceptionResultInfo extends Exception {

	/**
	 * serialVersionUID = 9162147324678490591L;
	 */
	private static final long serialVersionUID = 9162147324678490591L;

	// 系统统一使用的结果类，包括了 提示信息类型和信息内容
	private ResultInfo resultInfo;

	public ExceptionResultInfo(ResultInfo resultInfo) {
		super(resultInfo.getMessage());
		this.resultInfo = resultInfo;
	}

	public ResultInfo getResultInfo() {
		return resultInfo;
	}

	public void setResultInfo(ResultInfo resultInfo) {
		this.resultInfo = resultInfo;
	}

}
