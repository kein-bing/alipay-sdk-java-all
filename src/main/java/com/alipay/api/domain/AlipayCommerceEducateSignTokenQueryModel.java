package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扫脸信息查询
 *
 * @author auto create
 * @since 1.0, 2019-02-18 14:56:35
 */
public class AlipayCommerceEducateSignTokenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1444249477147197429L;

	/**
	 * 加密TOKEN
	 */
	@ApiField("token_key")
	private String tokenKey;

	public String getTokenKey() {
		return this.tokenKey;
	}
	public void setTokenKey(String tokenKey) {
		this.tokenKey = tokenKey;
	}

}
