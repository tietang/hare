<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="u" uri="/hare-ui-tags" %>
<%
    response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-Control", "no-cache");
    response.setDateHeader("Expires", -10);
%>
<html>
<head>


    <meta charset="UTF-8">

</head>
<body>

<u:body action="#"
        customAtrribute="value">不显示的文字
    <u:define name="title">Demo 页面
        <%
            String s = "";
            out.print(12321);

        %>
    </u:define>不显示的文字
    <u:define name="header">
        <font color="red">百度LOGO</font>
        <img src="http://www.baidu.com/img/baidu_logo.gif" width="270"
             height="129" border=0/>
        <%
            String s = "";
            out.print(12321);

        %>
    </u:define>

    <u:define name="body"> body body body body</u:define>



</u:body>
<div>不显示的文字</div>
</body>
</html>