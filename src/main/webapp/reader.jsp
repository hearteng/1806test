<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ page import="cn.sky.entity.Reader,java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>图书馆管理系统</title>
<link href="../CSS/style.css" rel="stylesheet">
</head>
<body>
<%-- <%@include file="banner.jsp"%>
<%@include file="navigation.jsp"%> --%>
<table width="778"  border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td valign="top" bgcolor="#FFFFFF"><table width="99%" height="510"  border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF" class="tableBorder_gray">
  <tr>
    <td height="510" valign="top" style="padding:5px;"><table width="98%" height="487"  border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td height="22" valign="top" class="word_orange">当前位置：读者管理 &gt; 读者档案管理 &gt;&gt;&gt;</td>
      </tr>
      <tr>
        <td align="center" valign="top">
  <c:if test="${empty readers }">
          <table width="100%" height="30"  border="0" cellpadding="0" cellspacing="0">
            <tr>
              <td height="36" align="center">暂无读者信息！</td>
            </tr>
    </table>
          <table width="100%"  border="0" cellspacing="0" cellpadding="0">
           <tr>
            <td>
                <a href="../reader_add.jsp">添加读者信息</a> 
            </td>
           </tr>
          </table>
  </c:if>

 <table width="100%"  border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="87%">&nbsp;      </td>
<td width="13%">
      <a href="../reader_add.jsp">添加读者信息</a></td>	  
  </tr>
</table>  
  <table width="95%"  border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#F6B83B" bordercolorlight="#FFFFFF">
  <tr align="center" bgcolor="#e3F4F7">
    <td width="13%" bgcolor="#F9D16B">条形码</td>  
    <td width="9%" bgcolor="#F9D16B">姓名</td>
    <td width="9%" bgcolor="#F9D16B">读者类型</td>
    <td width="12%" bgcolor="#F9D16B">证件类型</td>
    <td width="20%" bgcolor="#F9D16B">证件号码</td>
    <td width="12%" bgcolor="#F9D16B">电话</td>
    <td width="15%" bgcolor="#F9D16B">Email</td>
    <td width="5%" bgcolor="#F9D16B">修改</td>
    <td width="5%" bgcolor="#F9D16B">删除</td>
  </tr>
<c:forEach items="${readers }" var="r">

  <tr>
    <td style="padding:5px;">${r.barcode }</td>  
    <td style="padding:5px;"><a href="reader.do?action=readerDetail&ID=${r.id }">${r.name }</a></td>
    <td style="padding:5px;">${r.type}</td>
    <td align="center">${r.paperType }</td>
    <td align="center">${r.paperNo }</td>
    <td align="center">${r.tel }</td>
    <td align="center">${r.email }</td>
    <td align="center"><a href="modify.do?id=${r.id }">修改</a></td>
    <td align="center"><a href="del.do?id=${r.id }" onclick="return confirm('确定删除${r.name}吗?');">删除</a></td>
  </tr>
</c:forEach>

</table>
</td>
</tr>
</table>
</td>
</tr>
</table><%@ include file="../book/copyright.jsp"%></td>
</tr>
</table>
</body>
</html>
