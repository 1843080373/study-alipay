<%@ page language="java" contentType="text/html; charset=utf-8"	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>交易关闭</title>
</head>
<body>
交易关闭结果：
<h3>code:${tradeCloseResponse.alipay_trade_close_response.code}</h3>
<h3>msg:${tradeCloseResponse.alipay_trade_close_response.msg}</h3>
<h3>sub_code:${tradeCloseResponse.alipay_trade_close_response.sub_code}</h3>
<h3>sub_msg:${tradeCloseResponse.alipay_trade_close_response.sub_msg}</h3>
<h3>out_trade_no:${tradeCloseResponse.alipay_trade_close_response.out_trade_no}</h3>
</body>
</html>