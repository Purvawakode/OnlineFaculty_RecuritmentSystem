<%@page import="dto.CandidateDto"%>
<%@page import="dao.CandidateDao"%>
<jsp:useBean id="obj" class="dto.CandidateDto"></jsp:useBean>
<jsp:setProperty name="obj" property="*"></jsp:setProperty>

<%
CandidateDao cd = new CandidateDao();
int i= cd.addCandidate(obj);
if(i>0)
{
%>
<script>alert("Candidate Registration Successfull");</script>
<jsp:include page="candidatelogin.html"></jsp:include>
<%}else{%>
<script>alert("Error while Registration");</script>
<jsp:include page="candidate_reg.html"></jsp:include>
<%}%>