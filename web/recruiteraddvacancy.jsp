<%@include file="recruiterHeader.jsp" %>
<%@page import="dao.RecruiterDao" %>
<%@page import="dto.RecruiterDto" %>
<%
String email = (String)session.getAttribute("email");
%>
 <div id="adminbox">
                <fieldset style="margin-top: -50px;width: 70%" id="adminset">
                    <br><center><h1>Add Vacancy</h1></center>
                    <br><form action="recruiter_add_vacancy_db.jsp">
                       <div style="margin-left: 90px;width:400px; float: left;">         
            <select   style="height: 30px; width: 300px; font-family: candara;font-size: 22px;" required name="post">
             <option value="">Select Post</option>
             <option value="Assistant Professor">Assistant Professor</option>
             <option value="Associate Professor">Associate Professor</option>
             <option value="Principal">Principal</option>
             <option value="Mathematics Teacher">Mathematics Teacher</option>
             <option value="Primary Teacher">Primary Teacher</option>
            
            </select>
     
            <select style="margin: 5px;height: 30px; width: 300px; font-family: candara;font-size: 22px;" required    name="subject">
             <option value="">Select Subject</option>
             <option value="IT Subjects">IT Subjects</option>
             <option value="CS Subjects">CS Subjects</option>
             <option value="EC">EC</option>
             <option value="Mathematics">Mathematics</option>
             <option value="All Subjects">All Subjects</option>
             <option value="Others">Others</option>
  
            </select>
    
    <input required    type="text" name="location" placeholder="Enter Location">
         
            <select style="height: 30px; width: 300px; font-family: candara;font-size: 22px;" required    name="criteria">
             <option value="">Select Qualification</option>
             <option value="B.com">B.com</option>
             <option value="BCA">BCA</option>
             <option value="BE">BE</option>
             <option value="MCA">MCA</option>
             <option value="MBA">MBA</option>
            
            </select>
     
    
    <input required    type="number" name="vacancy" placeholder="Enter No. of Vacancy">

    <input required    type="text" name="salary" placeholder="Enter Salary">
        <p style="font-size: 22px;">Advertisement Date</p>                  
    <input required    type="date" name="advdate">
   
                       </div>
                       <div style="width:400px; float: left;">
                           <p style="font-size: 22px;">Last Date</p> 
    <input required    type="date" name="lastdate">
    

    <input readonly value="<%=email%>"   required type="email" name="email"  placeholder="Enter Email">
    <%
    RecruiterDao rd = new RecruiterDao();
    RecruiterDto rt =rd.getTypeName(email);
    %>
 
    <input readonly  value="<%=rt.getRecruiter()%>"  required type="text" name="recruiter" placeholder="Enter Recruiter Type">
   
    <input readonly value="<%=rt.getName()%>"   required type="text" name="recruitername"  placeholder="Enter Recruiter Name">
                       
            <br>
            <input id="adminbtn" type="submit" value="Add Vacancy">
            <input id="adminbtn" type="reset" value="Reset">
                       </div>
            
           </form>
                </fieldset>
            </div>
<%@include file="recruiterFooter.jsp"%>