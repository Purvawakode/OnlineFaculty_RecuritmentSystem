<%@page import="dto.RecruiterDto"%>
<%@include file="adminHeader.jsp" %>
<%@page import="dao.AdminDao" %>
<%@page import="java.util.ArrayList" %>

<script src="js/jquery-3.6.0.min.js" type="text/javascript"></script>
<script src="js/jquery.dataTables.min.js" type="text/javascript"></script>
<link href="css/jquery.dataTables.min.css" rel="stylesheet" type="text/css"/>
<script>
    $(document).ready( function () {
    $('#myTable').DataTable();
} );
</script><br>
<center><h1>Recruiter List</h1></center>
<table id="myTable" style="fontsize:20px;padding: 20px;">
    <thead>
        <tr>
            <th>NAME</th>
            <th>RECRUITER</th>
            <th>EMAIL</th>
            
            <th>CONTACT</th>
            <th>ADDRESS</th>
            <th>STATUS</th>
        </tr> 
    </thead>
    <tbody>
        <%
        AdminDao ad = new AdminDao();
        ArrayList<RecruiterDto>list = ad.getRecruiterList();
        for(RecruiterDto rt : list)
        {
        %>
            <tr>
            <td><%=rt.getName()%></td>
            <td><%=rt.getRecruiter()%></td>
            <td><%=rt.getEmail()%></td>
            
            <td><%=rt.getContact()%></td>
            <td><%=rt.getAddress()%></td>
            <td><a href="adminapproverecruiter.jsp?email=<%=rt.getEmail()%>"><%=rt.getStatus()%></td>
           
              
            </tr>
        <%}%>
    </tbody>
    <tfoot>
        <tr>
            <th>NAME</th>
            <th>RECRUITER</th>
            <th>EMAIL</th>
          
            <th>CONTACT</th>
            <th>ADDRESS</th>
            <th>STATUS</th>
        </tr>  
    </tfoot>
</table>
<%@include file="adminFooter.jsp"%>