<%@page import="dao.AdminDao"%>
<%
String email = request.getParameter("email");
String password = request.getParameter("password");
AdminDao ad = new AdminDao();
int i =ad.adminLogin(email,password);
if(i>0)
{
   session.setAttribute("email",email);
%>
<script>alert("Admin Login Sucessfully!!");</script>
<jsp:include page="adminhome.jsp"></jsp:include>
<%}else{%>
<script>alert("Error Ocurred");</script>
<jsp:include page="adminlogin.html"></jsp:include>
<%}%>