<%@ page isELIgnored="false" language="java" pageEncoding="UTF-8"%>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
This is listUser.jsp  
<br/>  

<c:forEach var="user" items="${listUser}"  >
<hr/>
 用户名： ${user.name} <br/>
  姓名： ${user.p_name} <br/>
  性别： ${user.sex} <br/>
  年龄： ${user.age} <br/>
</c:forEach>

<br/>  
<a href="<%=request.getContextPath()%>/mydemo/logout" target="_blank">Logout</a>  