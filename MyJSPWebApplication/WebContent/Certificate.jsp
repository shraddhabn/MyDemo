<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.header {
height:20%;
text-align: center;
background: navy;
color: white;
font-size: 20px;
}
.content{
height:80%;
text-align: center;
color: blue;
font-size: 30px;
}
.footer {
position: fixed;
left: 0;
bottom: 0;
width: 100%;
background-color: yellow;
color: red;
text-align: center;
}
</style>
</head>

<body  bgcolor=cornsilk text=blue>
<div class="header">
<%@ include file="Header.jsp"%>
</div>
<div class ="content">
This is to certify that Mr.X working with us for
the last 4 years.His conduct and behaviour are
satisfactory.
</div>
<div class="footer">
<%@ include file="Footer.jsp"%>
</div>

</body>
</html>