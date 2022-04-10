package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class recruiteraddvacancy_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/recruiterHeader.jsp");
    _jspx_dependants.add("/recruiterFooter.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Faculty Recruitment</title>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"images/logo.png\" rel=\"shortcut icon\" type=\"image/png\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"container\">\n");
      out.write("              <div id=\"header\">\n");
      out.write("                  &nbsp;&nbsp;\n");
      out.write("                  <img src=\"images/logo.png\" id=\"logo\" alt=\"\"/>\n");
      out.write("                  <span style=\"position: absolute;\"> &nbsp;&nbsp;  Faculty Recruitment System </span>\n");
      out.write("               </div>\n");
      out.write("            <div id=\"navbar\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"recruiterhome.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"recruiteraddvacancy.jsp\">Recruiter</a></li>\n");
      out.write("                    <li><a href=\"#\">Vacancy List</a></li>\n");
      out.write("                    <li><a href=\"#\">Applied Candidate</a></li>\n");
      out.write("                    <li><a href=\"#\">Profile</a></li>\n");
      out.write("                    <li><a href=\"recruiterlogout.jsp\">Logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>");
      out.write("\n");
      out.write(" <div id=\"adminbox\">\n");
      out.write("                <fieldset style=\"margin-top: -50px;width: 70%\" id=\"adminset\">\n");
      out.write("                    <br><center><h1>Add Vacancy</h1></center>\n");
      out.write("                    <br><form action=\"recruiter_add_vacancy_db.jsp\">\n");
      out.write("                       <div style=\"margin-left: 90px;width:400px; float: left;\">         \n");
      out.write("            <select   style=\"height: 30px; width: 300px; font-family: candara;font-size: 22px;\" required name=\"post\">\n");
      out.write("             <option value=\"\">Select Post</option>\n");
      out.write("             <option value=\"Assistant Professor\">Assistant Professor</option>\n");
      out.write("             <option value=\"Associate Professor\">Associate Professor</option>\n");
      out.write("             <option value=\"Principal\">Principal</option>\n");
      out.write("             <option value=\"Mathematics Teacher\">Mathematics Teacher</option>\n");
      out.write("             <option value=\"Primary Teacher\">Primary Teacher</option>\n");
      out.write("            \n");
      out.write("            </select>\n");
      out.write("     \n");
      out.write("            <select style=\"margin: 5px;height: 30px; width: 300px; font-family: candara;font-size: 22px;\" required    name=\"subject\">\n");
      out.write("             <option value=\"\">Select Subject</option>\n");
      out.write("             <option value=\"IT Subjects\">IT Subjects</option>\n");
      out.write("             <option value=\"CS Subjects\">CS Subjects</option>\n");
      out.write("             <option value=\"EC\">EC</option>\n");
      out.write("             <option value=\"Mathematics\">Mathematics</option>\n");
      out.write("             <option value=\"All Subjects\">All Subjects</option>\n");
      out.write("             <option value=\"Others\">Others</option>\n");
      out.write("  \n");
      out.write("            </select>\n");
      out.write("    \n");
      out.write("    <input required    type=\"text\" name=\"location\" placeholder=\"Enter Location\">\n");
      out.write("         \n");
      out.write("            <select style=\"height: 30px; width: 300px; font-family: candara;font-size: 22px;\" required    name=\"criteria\">\n");
      out.write("             <option value=\"\">Select Qualification</option>\n");
      out.write("             <option value=\"B.com\">B.com</option>\n");
      out.write("             <option value=\"BCA\">BCA</option>\n");
      out.write("             <option value=\"BE\">BE</option>\n");
      out.write("             <option value=\"MCA\">MCA</option>\n");
      out.write("             <option value=\"MBA\">MBA</option>\n");
      out.write("            \n");
      out.write("            </select>\n");
      out.write("     \n");
      out.write("    \n");
      out.write("    <input required    type=\"number\" name=\"vacancy\" placeholder=\"Enter No. of Vacancy\">\n");
      out.write("\n");
      out.write("    <input required    type=\"text\" name=\"salary\" placeholder=\"Enter Salary\">\n");
      out.write("        <p style=\"font-size: 22px;\">Advertisement Date</p>                  \n");
      out.write("    <input required    type=\"date\" name=\"advdate\">\n");
      out.write("   \n");
      out.write("                       </div>\n");
      out.write("                       <div style=\"width:400px; float: left;\">\n");
      out.write("                           <p style=\"font-size: 22px;\">Last Date</p> \n");
      out.write("    <input required    type=\"date\" name=\"lastdate\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <input readonly    required type=\"email\" name=\"email\"  placeholder=\"Enter Email\">\n");
      out.write("  <input readonly    required type=\"text\" name=\"recruiter\" placeholder=\"Enter Recruiter Type\">\n");
      out.write("   \n");
      out.write(" <input readonly    required type=\"text\" name=\"recruitername\"  placeholder=\"Enter Recruiter Name\">\n");
      out.write("                       \n");
      out.write("            <br>\n");
      out.write("            <input id=\"adminbtn\" type=\"submit\" value=\"Add Vacancy\">\n");
      out.write("            <input id=\"adminbtn\" type=\"reset\" value=\"Reset\">\n");
      out.write("                       </div>\n");
      out.write("            \n");
      out.write("           </form>\n");
      out.write("                </fieldset>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"footer\">\n");
      out.write("                <center>&copy;All Rights Reserved | 2021&trade;</center>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
