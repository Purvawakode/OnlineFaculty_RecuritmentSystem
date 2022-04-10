<%@page import="dao.AdminDao"%>
<%
String email = request.getParameter("email");
AdminDao ad = new AdminDao();
int i =ad.updateRecruiter(email);
if(i>0)
{
   
%>
<script>alert("Recruiter Approved");</script>
<jsp:include page="recruiterlist.jsp"></jsp:include>
<%}else{%>
<script>alert("Error while approving recruiter");</script>
<jsp:include page="recruiterlist.jsp"></jsp:include>

<%}%>