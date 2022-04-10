<%@page import="dto.RecruiterDto"%>
<%@page import="dao.RecruiterDao"%>

<jsp:useBean id="obj" class="dto.RecruiterDto"></jsp:useBean>
<jsp:setProperty name="obj" property="*"></jsp:setProperty>

<%
RecruiterDao rd = new RecruiterDao();
int i = rd.addRecruiter(obj);
if(i>0)
{
%>
<script>alert("Recruiter added sucessfully!!");</script>
<jsp:include page="recruiterlogin.html"></jsp:include>
<%}else{%>
<script>alert("Error while adding recruiter");</script>
<jsp:include page="recruiterlogin.html"></jsp:include>
<%}%>