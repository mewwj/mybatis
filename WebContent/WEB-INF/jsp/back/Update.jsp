<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
            
<%@ page import="java.util.*"%>
<!DOCTYPE html >
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/add.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>数据更新</title>
</head>
<body >

<form action="/jdbc/UpdateServlet" method="post" class="form">
<h1>数据更新
<span>Please fill all the texts in the fields.</span>
</h1>
<c:forEach items="${itemslist}" var="item" varStatus="status">
<label>
<span>ID :</span>
 <input type="text" name="updateid" value="${item.id }" readonly>
</label>
<br>
<label>
<span>Field1 :</span>
<input id="field1" type="text"   name="updatefield1"  value="${item.field1 }">
</label>
<br>
<label>
<span>Message :</span>
<input id="field2"  type="text" name="updatefield2"  value="${item.field2 }">
</label>
<label>
</label>
<br>
</c:forEach>
<label>
<span>&nbsp;</span>
<input type="submit" class="button" value="Send" />
</label>
</form>
</body>
</html>