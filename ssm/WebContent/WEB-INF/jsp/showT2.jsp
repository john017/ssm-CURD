<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="st" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	table.gridtable {
	margin:auto auto;
	font-family: verdana,arial,sans-serif;
	font-size:11px;
	color:#333333;
	border-width: 1px;
	border-color: #666666;
	border-collapse: collapse;
}
table.gridtable th {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #666666;
	background-color: #dedede;
}
table.gridtable td {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #666666;
	background-color: #ffffff;
}
</style>
</head>
<body>
	<table class="gridtable">
	<tr>
		<td>string</td>
		<td>id</td>
	</tr>
    <c:if test="${t2list==null}">null!</c:if>
	<c:forEach items="${t2list}" var="str">
		<tr>
			<td>${str.string}</td>
			<td>${str.id}</td>
			<td><a href="update?id=${str.id}">修改</a></td>
			<td><a href="delete?id=${str.id}">删除</a></td>
		</tr>
	</c:forEach>
	    
	<tr>
			<td colspan="2">
       			 <a href="showT2?page=${page-1 }" onclick="return frontPageCheck();">上一页</a>
         		  [每页显示：${pageSize}条] [  第${page}页 / 共${allpage} 页]
       			 <a href="showT2?page=${page+1 }" onclick="return backPageCheck();">下一页</a>
        	</td>
	</tr>
	
</table class="gridtable">
	<tr>
		<td>string</td>
		<form action="add" method="post">
		<td><input name="str" type="text" /></td>
		<td><input type="submit" /></td>
		</form>
		
	</tr>
<table>

</table>

<SCRIPT type="text/javascript">  
            function frontPageCheck()  
            {  
                if(${page > 1})  
                {  
                    return true;  
                }  
                return false;  
            }  
              
            function backPageCheck()  
            {  
                if(${page < allpage})  
                {  
                    return true;  
                }             
                return false;  
            }  
        </SCRIPT> 
</body>
</html>