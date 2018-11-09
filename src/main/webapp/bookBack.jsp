<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<head>
<title>图书馆管理系统</title>
<link href="CSS/style.css" rel="stylesheet">

<script type="text/javascript" src="script/jquery.min.js"></script>
<script type="text/javascript" src="script/bookBack.js"></script>
<script type="text/javascript" src="script/cookie_util.js"></script>

</head>
<body>
<%-- <%@include file="banner.jsp"%>
<%@include file="navigation.jsp"%> --%>
<table width="778"  border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td valign="top" bgcolor="#FFFFFF"><table width="100%" height="558"  border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF" class="tableBorder_gray">
  <tr>
    <td height="27" valign="top" style="padding:5px;" class="word_orange">&nbsp;当前位置：图书借还 &gt; 图书归还 &gt;&gt;&gt;</td>
  </tr>
  <tr>
    <td align="center" valign="top" style="padding:5px;"><table width="100%"  border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="47" background="Images/borrowBackRenew_back.gif">&nbsp;</td>
      </tr>
      <tr>
        <td height="72" align="center" valign="top" background="Images/main_booksort_1.gif" bgcolor="#F8BF73"><table width="96%" border="0" cellpadding="1" cellspacing="1" bordercolor="#F8BF73">
          <tr>
            <td valign="top" bgcolor="#F8BF73">

                <table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
				<form name="form1" method="post" action="borrow.do?action=bookback">
				
                  <tr>
                    <td><table width="90%" height="21" border="0" cellpadding="0" cellspacing="0">
                        <tr>
                          <td width="24%" height="18" style="padding-left:7px;padding-top:7px;"><img src="Images/reader_checkbg.jpg" width="142" height="18"></td>
                          <td width="76%" style="padding-top:7px;">读者条形码：
                            <input name="barcode" type="text" id="barcode" value="" size="24">
                            &nbsp;
                            <input id="readcode" name="Button" type="button" class="btn_grey" value="确定" />
                            <input name="operator" type="hidden" id="operator" value="sky">
                            <input  type="button" class="btn_grey" value="查询借阅" id="loadbook"/>
                            <span id="barcode-msg"></span>
                            </td>
                           
                        </tr>
                    </table></td>
                  </tr>
                  <tr>
                    <td height="13" align="left" style="padding-left:7px;"><hr width="90%" size="1"></td>
                    </tr>
                  <tr>
                    <td align="center"><table width="96%" border="0" cellpadding="0" cellspacing="0">
                        <tr>
                          <td height="27">姓&nbsp;&nbsp;&nbsp;&nbsp;名：
                            <input name="readername" type="text" id="readername" value=" "></td>
                          <td>性&nbsp;&nbsp;&nbsp;&nbsp;别：
                            <input name="sex" type="text" id="sex" value=" "></td>
                          <td>读者类型：
                            <input name="readerType" type="text" id="readerType" value=" "></td>
                        </tr>
                        <tr>
                          <td height="27">证件类型：
                            <input name="paperType" type="text" id="paperType" value=" "></td>
                          <td>证件号码：
                            <input name="paperNo" type="text" id="paperNo" value=" "></td>
                          <td>可借数量：
                            <input name="number" type="text" id="number" value=" " size="17">
                            册
                            &nbsp;</td>
                        </tr>
                    </table></td>
                  </tr>
				 </form>
              </table></td>
          </tr>
          <tr>
            <td valign="top">
            <table width="100%" height="35" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolorlight="#FFFFFF" bordercolordark="#F6B83B" bgcolor="#FFFFFF">

                <tr id="backType" align="center" bgcolor="#e3F4F7">
                  <td width="17%" height="25" bgcolor="#FFF9D9">图书名称</td>
                  <td width="13%" bgcolor="#FFF9D9">借阅时间</td>
                  <td width="13%" bgcolor="#FFF9D9">应还时间</td>
                  <td width="16%" bgcolor="#FFF9D9">出版社</td>
                  <td width="12%" bgcolor="#FFF9D9">书架</td>
                  <td colspan="2" bgcolor="#FFF9D9">书的类型</td>
                  <td width="12%" bgcolor="#FFF9D9">
                  <input id="Back" type="button" class="btn_grey" value="完成归还" />
                  </td>
                </tr>
                <tr id="checkType" style="display: none" align="center" bgcolor="#F9D16B">
                   <td width="29%" height="25">图书名称</td>
                   <td width="13%">出版社</td>
                   <td width="14%">书的类型</td>
                   <td width="15%">书架</td>
                   <td width="14%">借阅天数</td>
                   <td colspan="2">借阅状态</td>
                </tr> 
            <table id="showbooks" width="99%" border="1" cellpadding="0" cellspacing="0" 
                  bordercolor="#FFFFFF" bordercolorlight="#FFFFFF" bordercolordark="#F6B83B" bgcolor="#FFFFFF">
            <tr  align="center">
                  <td width="17%" height="25" style="padding:5px;"></td>
                  <td width="13%" ></td>
                  <td width="13%" ></td>
                  <td width="16%" align="center"></td>
                  <td width="12%" align="center"></td>
                  <td colspan="2" align="center"></td>
                  <td width="12%" align="center"><a href="#"></a></td>
             </tr>
            </table>
			</td>
          </tr>
		 
        </table></td>
      </tr>
      <tr>
        <td height="19" background="Images/main_booksort_2.gif">&nbsp;</td>
      </tr>
    </table></td>
  </tr>
</table>
    <%@ include file="copyright.jsp"%></td>
  </tr>
</table>
</body>
</html>
