<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*"%>
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
        <td height="22" valign="top" class="word_orange">当前位置：系统查询 &gt; 图书档案查询 &gt;&gt;&gt;</td>
      </tr>
      <tr>
        <td align="center" valign="top">
        
        
 <form id="bookform" action="findKey.do?" method="post" name="" > 
 <table width="98%" height="38"  border="0" cellpadding="0" cellspacing="0" bgcolor="#E3F4F7" class="tableBorder_gray">
  <tr>
    <td align="center" bgcolor="#F9D16B">

&nbsp;<img src="../Images/search.gif" width="45" height="28"></td>
    <td bgcolor="#F9D16B">请选择查询依据：

      <select name="type" class="wenbenkuang" id="f" form="bookform">
        <option value="barcode">条形码</option>
        <option value="typename">类别</option>
        <option value="bookname" selected>书名</option>
        <option value="publishing">出版社</option>
        <option value="bookcasename">书架</option>
      </select>
      <input name="key" type="text" id="key" size="50">
      <input name="Submit" type="submit" class="btn_grey" value="查询"></td>
  </tr>
</table>
 </form>

<c:if test="${empty books }">
    <table width="100%" height="30"  border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td height="36" align="center">暂无图书信息！</td>
      </tr>
    </table>
</c:if>
 
  <table width="98%"  border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#F6B83B" bordercolorlight="#FFFFFF">
  <tr align="center" bgcolor="#e3F4F7">
    <td width="17%" bgcolor="#F9D16B">条形码</td>  
    <td width="31%" bgcolor="#F9D16B">图书名称</td>
    <td width="18%" bgcolor="#F9D16B">图书类型</td>
    <td width="19%" bgcolor="#F9D16B">出版社</td>
    <td width="15%" bgcolor="#F9D16B">书架</td>
    </tr>
<c:forEach items="${books }" var="b">
  <tr>
    <td style="padding:5px;">&nbsp;${b.barcode}</td>  
    <td style="padding:5px;"><a href="detail.do?id=${b.id}">${b.bookname}</a></td>
    <td style="padding:5px;">&nbsp;${b.type }</td>  
    <td style="padding:5px;">&nbsp;${b.pubname }</td>  
    <td style="padding:5px;">&nbsp;${b.casename }</td>  
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
