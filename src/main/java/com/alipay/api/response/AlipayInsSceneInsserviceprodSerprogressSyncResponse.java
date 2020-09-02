package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.insserviceprod.serprogress.sync response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-19 18:25:15
 */
public class AlipayInsSceneInsserviceprodSerprogressSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5625537694465297343L;

	/** 
	 * 进度明细编号(业务主键)
	 */
	@ApiField("progress_no")
	private String progressNo;

	public void setProgressNo(String progressNo) {
		this.progressNo = progressNo;
	}
	public String getProgressNo( ) {
		return this.progressNo;
	}

}
