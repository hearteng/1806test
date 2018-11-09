<%@ page contentType="text/html; charset=utf-8" language="java"%>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<head>
<title>图书馆管理系统</title>
<link href="CSS/style.css" rel="stylesheet">
<script type="text/javascript" src="script/jquery.min.js"></script>
<script type="text/javascript" src="script/managerlogin.js"></script>
</head>
<body">
<table width="778" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#F9D16B" class="tableBorder">
  <tr>
    <td>
<table width="760" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="142" valign="top">&nbsp;</td>
  </tr>
</table>
	</td>
  </tr>
	<td>
	<table width="100%"  border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td valign="top"><table width="100%" height="525"  border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="523" align="center" valign="top"><table width="100%" height="271"  border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td height="271" align="right" valign="top" class="word_orange"><table width="100%" height="255"  border="0" cellpadding="0" cellspacing="0" background="Images/logins.jpg">
          <tr>
            <td height="57">&nbsp;</td>
            </tr>
          <tr>
            <td height="179" valign="top"><table width="100%" height="63"  border="0" cellpadding="0" cellspacing="0">
              <tr>
                <td width="2%">&nbsp;</td>
                  <td width="97%" align="center" valign="top">
                    <form name="form1" method="post" action="">
                      <table width="100%"  border="0" cellpadding="0" cellspacing="0" bordercolorlight="#FFFFFF" bordercolordark="#D2E3E6">
                        <tr>
                          <td height="57">&nbsp;</td>
                          <td height="57" colspan="2" align="center">&nbsp;</td>
                          <td>&nbsp;</td>
                        </tr> 
                        <tr>
                          <td width="50%" height="37">&nbsp;</td>
                      <td width="10%">管理员名称：</td>
                      <td width="50%">
                        <input name="name" type="text" class="logininput" id="name" size="30" value="输入管理员名"/> 
                        <span id="name-msg"></span>                       
                      </td>
                      <td width="9%">&nbsp;</td>
                    </tr>
                        <tr>
                          <td height="37">&nbsp;</td>
                      <td>管理员密码：</td>
                      <td>
                      <input name="pwd" type="password" class="logininput" id="pwd" size="30"/>
                      <span id="pwd-msg"></span>
                      </td>
                      <td>&nbsp;</td>
                    </tr>
                        <tr>
                          <td height="30">&nbsp;</td>
                      <td colspan="2" align="center">
                      <input id="login" name="Submit" type="button" class="btn_grey" value="登录">
                        &nbsp;
                        <input name="Submit2" type="button" class="btn_grey" value="返回" >
                        <a href="#" onClick="window.open('manager/pwd_modify.do','','width=360,height=240')">修改密码</a>
                        </td>
                      <td>
                      &nbsp;</td>
                    </tr>
                        </table> 
			  </form>				   </td>
                  <td width="1%">&nbsp;</td>
                </tr>
              </table></td>
            </tr>
          <tr>
            <td height="19">&nbsp;</td>
            </tr>
        </table></td>
      </tr>
      
    </table>
      <table width="100%" height="27"  border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td align="center" class="word_login">&copy;sky有限公司<br>
          </td>
        </tr>
      </table></td>
  </tr>
</table></td>
  </tr>
</table>
</td>
  </tr>
</table>
</body>
</html>
