<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="cn.sky.entity.Reader,java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <script language="jscript">
function check(form){
	if(form.name.value==""){
		alert("请输入读者姓名!");form.name.focus();return false;
	}
	if(form.paperNO.value==""){
		alert("请输入证件号码!");form.paperNo.focus();return false;
	}
}
</script>
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
        <td height="22" valign="top" class="word_orange">当前位置：读者管理 &gt; 读者档案管理 &gt; 修改读者信息 &gt;&gt;&gt;</td>
      </tr>
      <tr>
        <td align="center" valign="top"><table width="100%" height="493"  border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="center" valign="top">
	<form name="form1" method="post" action="update.do">
	<table width="600" height="432"  border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
      <tr>
        <td width="173" align="center">姓&nbsp;&nbsp;&nbsp;&nbsp;名：</td>
        <td width="427" height="39">
         <input name="name" type="text" id="name" value="${reader.name }">
      
          <input name="id" type="hidden" id="id" value="${reader.id }"></td>
      </tr>
      <tr>
        <td width="173" align="center">性&nbsp;&nbsp;&nbsp;&nbsp;别：</td>
         <td height="35">
           <input name="sex" type="radio" class="noborder" id="radiobutton" value="男" <c:if test="${'M'eq reader.sex}">checked</c:if>     >
           <label for="radiobutton">男 </label>
           <label><input name="sex" type="radio" class="noborder" value="女" <c:if test="${'F'eq reader.sex}">checked</c:if>>女</label>
          </td>
      </tr>
      <tr>
        <td align="center">条&nbsp;形&nbsp;码：</td>
        <td><input name="barcode" type="text" id="barcode" value=${reader.barcode } readonly></td>
      </tr>
      <tr>
        <td align="center">读者类型：</td>
        <td>
		<select name="typeid" class="wenbenkuang" id="typeid">
          <option value="1" <c:if test="${1==reader.typeid}">selected</c:if>>学生</option>
          <option value="2" <c:if test="${2==reader.typeid}">selected</c:if>>教师</option>
          <option value="3" <c:if test="${3==reader.typeid}">selected</c:if>>其他</option>
        </select>        
        </td>
      </tr>
      <tr>
        <td align="center">职&nbsp;&nbsp;&nbsp;&nbsp;业：</td>
        <td><input name="vocation" type="text" id="vocation" value="${reader.vocation}"></td>
      </tr>
      <tr>
        <td align="center">出生日期：</td>
        <td><input name="birthday" type="text" id="birthday" value="${reader.birthday}"></td>
      </tr>
      <tr>
        <td align="center">有效证件：</td>
        <td>
         <select name="paperType" class="wenbenkuang" id="paperType">
          <option value="身份证"<c:if test="${'身份证'=='${reader.paperType}' }">selected</c:if>>身份证</option>
          <option value="学生证"<c:if test="${'学生证'=='${reader.paperType}' }">selected</c:if>>学生证</option>
          <option value="军官证"<c:if test="${'军官证'=='${reader.paperType}' }">selected</c:if>>军官证</option>
          <option value="工作证"<c:if test="${'工作证'=='${reader.paperType}' }">selected</c:if>>工作证</option>
         </select>
        </td>
      </tr>
      <tr>
        <td align="center">证件号码：</td>
        <td><input name="paperNo" type="text" id="paperNO" value="${reader.paperNo}"></td>
      </tr>
      <tr>
        <td align="center">电&nbsp;&nbsp;&nbsp;&nbsp;话：</td>
        <td><input name="tel" type="text" id="tel" value="${reader.tel}"></td>
      </tr>
      <tr>
        <td align="center">Email：</td>
        <td><input name="email" type="text" id="email" value="${reader.email}" size="50">
          <input name="operator" type="hidden" id="operator" value="${reader.operator}" /></td>
      </tr>
      <tr>
        <td height="30" align="center">操&nbsp;作&nbsp;员：</td>
        <td><input name="operator" type="text" id="operator" value="${reader.operator}" readonly/>
        </td>
      </tr>
      <tr>
        <td align="center">备&nbsp;&nbsp;&nbsp;&nbsp;注：</td>
        <td><textarea name="remark" cols="50" rows="5" class="wenbenkuang" id="remark">${reader.remark }</textarea></td>
      </tr>
      <tr>
        <td align="center">&nbsp;</td>
        <td><input name="Submit" type="submit" class="btn_grey" value="保存" onClick="return check(form)">
&nbsp;
<input name="Submit2" type="button" class="btn_grey" value="返回" onClick="history.back()"></td>
      </tr>
    </table>
    </form>
	</td>
  </tr>
</table></td>
      </tr>
    </table>
</td>
  </tr>
</table><%@ include file="../book/copyright.jsp"%></td>
  </tr>
</table>
</body>
</html>

