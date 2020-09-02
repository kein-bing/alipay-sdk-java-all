package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.bizdata.templatemessage.upload response.
 * 
 * @author auto create
 * @since 1.0, 2020-01-09 18:36:35
 */
public class AlipayOpenMiniBizdataTemplatemessageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 3815561436584689781L;

	/** 
	 * 成功：true 失败：false
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
