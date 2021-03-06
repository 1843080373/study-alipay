package com.alipay.alipay;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayDEVConfig {

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016080700186744";

	// 商户私钥，您的PKCS8格式RSA2私钥
	public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCYcS0kVP2rmw9SCER4BicrrY+5szSoNfm9sGLk7/Wq8UJ3Wl3jwKJkyGDdOTxLaiF5mEjn0tT6mrLLL2RFbA2O/ETjS89j0QHH3CM8SMVwz4UTDUuDd7pfnLcwEiZxJEacyE4eta3s30WPszDtExFcYcaAo1RmqbudYUoiGcFD75YlvxzOd88Tcvz37RMhCX2hFEl0X4ms9QOpvF9UNcRofX9mHgx7iBlbpHHbxpdUeTM4MGSEleLtLtUJp60I9ADOV1GRmnWQ/gEBbhiq8LocmbGovOduGJxC27WQxEAOj50JkznaGC6RihD3cCWyeZsTyqh7THNM8gu7qeZezYfnAgMBAAECggEAchoUbeNn1DDF8OLbTPNeEmVg9OBcA6QTAJasDyxFN+RJmch8CmM/qiwJxMx4gwI3eCoyN8MpQ0LTnR4l8YiFRYcxkOhHnTDuIkh130Og9WV+99m1sfvF9pb4zvRm7bz3VZbgUkAupOQhzwOTFYB2OC2/RL38CLP3CD+wG4InlM7xQ5BDY4HSSIvIraa99aS1zDZjmJ8NGLnNCfaQoRMpo9/02488IYwoK+VkcgqrDYB8h8ZUdut8XdTqspV/Kpi8eVpzz7wLAw9JDmXNNXAs0hRNnga6SuGv8VYfoJsET9C7Dvg1LBe2po2KPZu0KaH3hdywGnjS89Fw1gzXNFwRAQKBgQDXQdbRLfzR5dkmnLgfg6pPyJG+b1ERuuAEVBUazJICmiASMJpLFPU2Uklo2VZCXEXr3kJ9Cbybf1peD13qDoWsBY2hZ7HesrrJOCICkt3b9wcKwMGkB32tKRyEKyRY58pVgjMBPym57kxLn8X2r3gbxcIjoS3UINFU41G0/xfxQQKBgQC1S6s4hF2xK6YVpEMDT4k5YoC6WTM4afOmoLDDQM02AvYk2TncGH1QZnB2KDzOi1xW7t4cbuCRby4cBzLCPJg7aQzrl/5OSmoGGwdThcZZaXvQ/QWK451vRyObXWgu0j4UBXw8DEnM7/SsTrBXy1+YdcSE2z31RIynu/olB88HJwKBgFLjU2jxIG1i6J9psazQ8oAOZ7DBBKKjJygDiKztITxHRRo8BO3sgBAO1528Mu8SwQn2Z/vmB+6It6+Ik01Rkj+PU95XI7Lxd+OL7ey3yR6unNOTLf2PtOE893Ider2RY+RRYnqUa+jgzhhAyeYX41Qubndx1Ufd6z2Y2xmrMPkBAoGAezNIz8djxBpdayeNQpqyLgT6ZahoXlXh9cINXSKUUbgBfVkBMMiToCd9FU6Sw+mAfrMkzT2r7ikXtIRPwh9bdEQXO6K2do2rLyr+94tZFznPol3PfmrfeddmIxZ+zhKhjQmNO2E+Zb5LDy0KOR9Df1/IhGBY4mwLCZF8k92SmtECgYAgCw06fQNyu1Pd/ByLi0NCn1C4l0KLi6pw2gO1tl9AQhwK7k5gW1V3dB/dRMkrBKhNnrZJDIF0aBnUtVg8SyRza7X3aN3OLDtA9c3UAZw57oAjA7n6MEGG96rE/u5d768MZAmfnVbXMIwgK97Pbpav1/dI0IAN2BL6wEd5h0nYZA==";

	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuQm5GBcgZtj1G6KhXwXY7rKzMwrm9kcBJFURq7xtb5nsaLasfl6vfKtzTDtnfIKOZayTVfqJKS1hrgAIYDfddZOJHMYAwte80D4kd1IkVc4B8PxHELs76rxaVR+fz69BzIzuyySJcY85ceHVDzdlQzDzHgdWAvkMpqt0HFuWUUlvAeK8wF+PXiZAwzmd8vtqRuJ08amG2gEEIuhgXlBD9MxFKMGgHaaIAaunHnWyWLrqtJispr/mlFx0zXa8aSMhLU/xoHspMTm/gpwHAmSt7ebyj4IkC04SkfMAq5RzQtuf86V6zULAj/zr98+YieOSk2tj1vl/KxtpvyQnpYimPwIDAQAB";

	// 服务器异步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://ey3ebr.natappfree.cc/notifyUrl.do";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://ey3ebr.natappfree.cc/returnUrl.htm";

	// 签名方式
	public static String sign_type = "RSA2";

	// 数据格式
	public static String data_type = "json";

	// 字符编码格式
	public static String charset = "utf-8";

	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	// 支付宝Auth网关
	public static String authReqUrl = "https://openauth.alipaydev.com/oauth2/appToAppAuth.htm?app_id=APPID&redirect_uri=REDIRECT_URI";
	
	public static String log_path = "D:\\";

	/**
	 * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
	 * 
	 * @param sWord 要写入日志里的文本内容
	 */
	public void logResult(String sWord) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
			writer.write(sWord);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
