<%@page import="dto.VacancyDto"%>
<%@page import="dao.VacancyDao"%>

<jsp:useBean id="obj" class="dto.VacancyDto"></jsp:useBean>
<jsp:setProperty name="obj" property="*"></jsp:setProperty>

<%
VacancyDao vd = new VacancyDao();
int i =vd.addVacancy(obj);
if(i>0)
{
%>
<script>alert("Vacancy Added succefully");</script>
<jsp:include page="recruiteraddvacancy.jsp"></jsp:include>
<%}else{%>
<script>alert("Error while adding vacancy");</script>
<jsp:include page="recruiteraddvacancy.jsp"></jsp:include>


<%}%>