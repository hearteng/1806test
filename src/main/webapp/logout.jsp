<%@ page contentType="text/html; charset=utf-8" language="java"%>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
</head>

<body>
<%
session.invalidate();
out.println("<script language='javascript'>");
out.println("window.location.href='managerlogin.jsp'");
out.println("</script>");
%>	

</body>
</html>
