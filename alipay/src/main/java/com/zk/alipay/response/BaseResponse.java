package com.zk.alipay.response;

import java.io.Serializable;

/**
 * 公共响应参数
 * 
 * @author Administrator
 *
 */
public class BaseResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 网关返回码
	 */
	private String code;

	/**
	 * 网关返回码描述
	 */
	private String msg;

	/**
	 * 业务返回码，参见具体的API接口文档
	 */
	private String sub_code;

	/**
	 * 业务返回码描述，参见具体的API接口文档
	 */
	private String sub_msg;

	/**
	 * 签名
	 */
	private String sign;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getSub_code() {
		return sub_code;
	}

	public void setSub_code(String sub_code) {
		this.sub_code = sub_code;
	}

	public String getSub_msg() {
		return sub_msg;
	}

	public void setSub_msg(String sub_msg) {
		this.sub_msg = sub_msg;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
}
