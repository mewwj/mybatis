<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
    <%@ page import="info.Items"%>
<%@ page import="java.util.*"%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/add.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>新增页面</title>
</head>
<body>
<form action="/jdbc/InsertServlet" method="post" class="form">
<h1>数据添加
<span>请在下面输入编号以及回复字段</span>
</h1>
<label>
<span>回复字段1 :</span>
<input id="email" type="text" name="field1" placeholder="field1" />
</label>
<label>
<span>回复字段2 :</span>
<input id="message" type="text" name="field2" placeholder="field2"/>
</label>
<label>
<span>&nbsp;&nbsp;</span>
<input type="submit" class="button" value="submit" />
</label>
</form>
</body>
</html>