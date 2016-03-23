<%@  page isELIgnored="false" language="java" pageEncoding="UTF-8"%>  
当前登录的用户为${currUser}  
<br/>  
姓名：${currUser.p_name}
年龄：${currUser.age}
性别：${currUser.sex}
<br/>  
<a href="<%=request.getContextPath()%>/mydemo/logout" target="_blank">Logout</a>