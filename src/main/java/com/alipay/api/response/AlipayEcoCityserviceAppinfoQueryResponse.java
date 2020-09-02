package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cityservice.appinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-05-22 13:38:24
 */
public class AlipayEcoCityserviceAppinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7624684691295676226L;

	/** 
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 业务结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 业务返回结果上下文
	 */
	@ApiField("result_context")
	private String resultContext;

	/** 
	 * 业务返回错误
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultContext(String resultContext) {
		this.resultContext = resultContext;
	}
	public String getResultContext( ) {
		return this.resultContext;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
