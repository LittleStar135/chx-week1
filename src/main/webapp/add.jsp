<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form" %>      
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <script type="text/javascript" src="<%=path%>/jquery/jquery-1.8.2.js"></script>
  <script type="text/javascript" src="jquery/jquery.validate.js"></script>
  <link rel="stylesheet" href="<%=path%>/css/css.css" type="text/css"></link>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form:form action="/chx-week1/add.do" method="post" enctype="multipart/form-data" modelAttribute="week" >
		<table>
			<tr>
				<td>编号</td>
				<td>
					<input type="text" name="id">
				</td>
			</tr>
			<tr>
				<td>名称</td>
				<td>
					<input type="text" name="name">
					
				</td>
			</tr>
			<tr>
				<td>英文名称</td>
				<td>
					<input type="text" name="ename">
				</td>
			</tr>
			<tr>
				<td>品牌</td>
				<td>
					<select  name="pinpai">
						<option>小米</option>
						<option>华为</option>
						<option>三星</option>
						<option>惠普</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>种类</td>
				<td>
					<select  name="type">
						<option>手机</option>
						<option>电脑</option>
						
					</select>
				</td>
			</tr>
			<tr>
				<td>尺寸</td>
				<td>
					<input type="text" name="dx">
				</td>
			</tr>
			<tr>
				<td>单价（元）</td>
				<td>
					<input type="text" name="price">
				</td>
			</tr>
			<tr>
				<td>数量</td>
				<td>
					<input type="text" name="count">
				</td>
			</tr>
			<tr>
				<td>标签</td>
				<td>
					<input type="text" name="total">
				</td>
			</tr>
 			<tr>
				<td>图片</td>
				<td>
					<input type="file" name="myFile">
				</td>
			</tr>
			<tr>
				<td colspan="5">
					<input type="submit" value="提交" onclick="add()">
				</td>
			</tr>
		</table>
	
	</form:form>
	
	
</body>
</html>