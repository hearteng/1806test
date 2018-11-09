<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ page import="cn.sky.entity.BookType,java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<head>
<title>图书馆管理系统</title>
<link href="../CSS/style.css" rel="stylesheet">
</head>
<body onLoad="clockon(bgclock)">
<%-- <%@include file="banner.jsp"%>
<%@include file="navigation.jsp"%> --%>
<table width="778"  border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td valign="top" bgcolor="#FFFFFF"><table width="99%" height="510"  border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF" class="tableBorder_gray">
  <tr>
    <td height="510" valign="top" style="padding:5px;"><table width="98%" height="487"  border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td height="22" valign="top" class="word_orange">当前位置：图书管理 &gt; 图书类型设置 &gt;&gt;&gt;</td>
      </tr>
      <tr>
        <td align="center" valign="top">
<c:if test="${empty bookTypes }">
  <table width="100%" height="30"  border="0" cellpadding="0" cellspacing="0">
       <tr><td height="36" align="center">暂无图书类型信息！</td></tr>
  </table>
  <table width="100%"  border="0" cellspacing="0" cellpadding="0">
    <tr>
     <td>
      <a href="#" onClick="window.open('../bookType_add.jsp','','width=360,height=240')">添加图书类型信息</a> 
     </td>
    </tr>
  </table>
</c:if>

 <table width="91%"  border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="82%">&nbsp;      </td>
<td width="18%" align="right">
      <a href="#" onClick="window.open('../bookType_add.jsp','','width=360,height=240')">添加图书类型信息</a> </td>	  
  </tr>
</table>  
  <table width="91%"  border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#F6B83B" bordercolorlight="#FFFFFF">
  <tr align="center" bgcolor="#e3F4F7">
    <td width="35%" bgcolor="#F9D16B">图书类型名称</td>
    <td width="35%" bgcolor="#F9D16B">可借天数</td>
    <td width="16%" bgcolor="#F9D16B">修改</td>
    <td width="14%" bgcolor="#F9D16B">删除</td>
  </tr>
<c:forEach items="${bookTypes}" var="bt">
  <tr>
    <td style="padding:5px;" >${bt.typeName }</td>
    <td style="padding:5px;">${bt.days }</td>
    <td align="center" ><a href="#" onClick="window.open('modify.do?id=${bt.id }','','width=360,height=240')">修改</a></td>
    <td align="center" ><a href="del.do?id=${bt.id }">删除</a></td>
  </tr>
 </c:forEach>
</table>
</td>
</tr>
</table>
</td>
  </tr>
</table><%@ include file="copyright.jsp"%></td>
  </tr>
</table>
</body>
</html>
