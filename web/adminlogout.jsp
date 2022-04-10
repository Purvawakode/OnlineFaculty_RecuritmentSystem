<%
    session.setAttribute("email", null);
    session.invalidate();
    response.sendRedirect("adminlogin.html");
%>
