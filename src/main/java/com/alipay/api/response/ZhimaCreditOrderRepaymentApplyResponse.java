package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.order.repayment.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-30 15:40:01
 */
public class ZhimaCreditOrderRepaymentApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4178616175195727999L;

	/** 
	 * 请求时传入外部单据号，结果中带回
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 判断调用是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
