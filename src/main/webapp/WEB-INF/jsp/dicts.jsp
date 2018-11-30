<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${path}/js/common/jquery-1.12.3.js"></script>
<title>字典信息</title>
</head>
<body>
<h1>数据字典的信息</h1>
<h1>name:</h1><div id="name"></div>
<h1>value:</h1><div id="value"></div>

<script type="text/javascript">
$(document).ready(function(){
	$.ajax({
        type:'POST',
        dataType:'json',
        url: "${pageContext.request.contextPath}/dicts/findDictsById",
        success:function(data){
			alert("ojbk"+data.name);
	        }
    	});
});
</script>
</body>

</html>