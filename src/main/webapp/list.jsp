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

	<form action="/chx-week1/list.do" method="post">
		种类：<select name="types" >
		
			<option></option>
			<option  value="手机">手机</option>
			<option  value="电脑">电脑</option>
			
		</select>
		<input type="hidden" name="types" value="${vo.types}">
		品牌：<select name="pinpais" >
		
			<option></option>
			<option  value="华为">华为</option>
			<option  value="小米">小米</option>
			<option  value="三星">三星</option>
			<option  value="惠普">惠普</option>
			
		</select>
		<input type="hidden" name="pinpais" value="${vo.pinpais}">
		
		单价范围：<input type="text" name="p1" value="${vo.p1}">到<input type="text" name="p2" value="${vo.p2 }" ><br>
		
		商品名称<select name="names">
		
			<option></option>
			<option  value="华为">华为</option>
			<option  value="小米">小米</option>
			<option  value="三星">三星</option>
			<option  value="惠普">惠普</option>
		</select>
		<input type="text" name="names" value="${vo.names }">
		
		<input type="submit" value="查询">
		<input type="button" onclick="add()" value="添加">
		</form>
		
		<form >
		<table>
			<tr>
				<td>编号</td>
				<td>名称</td>
				<td>英文名</td>
				<td>品牌</td>
				<td>类型</td>
				<td>尺寸</td>
				<td>价格</td>
				<td>数量</td>
				<td>标签</td>
				<td>图面</td>
			</tr>
			<c:forEach items="${list }" var="w">
				<tr>
					<td>${w.id }</td>
					<td>${w.name }</td>
					<td>${w.ename }</td>
					<td>${w.pinpai }</td>
					<td>${w.type }</td>
					<td>${w.dx }</td>
					<td>${w.price }</td>
					<td>${w.count }</td>
					<td>${w.total }</td>
					<td>
						<img style="width: 50px;height: 50px" alt="失败" src="F:/LitterOne/chx-week1/src/main/webapp/file/${w.img }">
					</td>
					
				</tr>
			
			</c:forEach>
			
			<tr>
				<td colspan="20">
					<button name="pageNum" value="1" >首页</button>
					<button name="pageNum" value="${page.prePage==0?page.pageNum:page.prePage }" >上一页</button>
					<button name="pageNum" value="1">1</button>
					<button name="pageNum" value="2">2</button>
					<button name="pageNum" value="3">3</button>
					<button name="pageNum" value="${page.nextPage==0?page.pages:page.nextPage }" >下一页</button>
					<button name="pageNum" value="${page.pages }" >尾页</button>
					当前${page.pageNum }/${page.pages }页，共${page.total }条 
					 跳转 <input type="text" name="pageMum" value="${vo.pageNum }">页
					 <button>确定</button>
					
				</td>
			</tr>
		</table>

	</form>
	<script type="text/javascript">
		function add() {
			location="/chx-week1/add.jsp";
		}
	
	</script>
	
</body>
</html>