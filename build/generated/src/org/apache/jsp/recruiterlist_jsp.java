package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dto.RecruiterDto;
import dao.AdminDao;
import java.util.ArrayList;

public final class recruiterlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/adminHeader.jsp");
    _jspx_dependants.add("/adminFooter.jsp");
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

      out.write('\n');
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
      out.write("                    <li><a href=\"adminhome.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"recruiterlist.jsp\">Recruiter</a></li>\n");
      out.write("                       <li><a href=\"#\">Candidate</a></li>\n");
      out.write("                    <li><a href=\"#about\">Vacancy List</a></li>\n");
      out.write("                    <li><a href=\"#contact\">Applied Candidate</a></li>\n");
      out.write("                    <li><a href=\"#\">Profile</a></li>\n");
      out.write("                    <li><a href=\"adminlogout.jsp\">Logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"js/jquery-3.6.0.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/jquery.dataTables.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<link href=\"css/jquery.dataTables.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<script>\n");
      out.write("    $(document).ready( function () {\n");
      out.write("    $('#myTable').DataTable();\n");
      out.write("} );\n");
      out.write("</script><br>\n");
      out.write("<center><h1>Recruiter List</h1></center>\n");
      out.write("<table id=\"myTable\" style=\"fontsize:20px;padding: 20px;\">\n");
      out.write("    <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>NAME</th>\n");
      out.write("            <th>RECRUITER</th>\n");
      out.write("            <th>EMAIL</th>\n");
      out.write("            \n");
      out.write("            <th>CONTACT</th>\n");
      out.write("            <th>ADDRESS</th>\n");
      out.write("            <th>STATUS</th>\n");
      out.write("        </tr> \n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("        ");

        AdminDao ad = new AdminDao();
        ArrayList<RecruiterDto>list = ad.getRecruiterList();
        for(RecruiterDto rt : list)
        {
        
      out.write("\n");
      out.write("            <tr>\n");
      out.write("            <td>");
      out.print(rt.getName());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rt.getRecruiter());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rt.getEmail());
      out.write("</td>\n");
      out.write("            \n");
      out.write("            <td>");
      out.print(rt.getContact());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rt.getAddress());
      out.write("</td>\n");
      out.write("            <td><a href=\"adminapproverecruiter.jsp?email=");
      out.print(rt.getEmail());
      out.write('"');
      out.write('>');
      out.print(rt.getStatus());
      out.write("</td>\n");
      out.write("           \n");
      out.write("              \n");
      out.write("            </tr>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    </tbody>\n");
      out.write("    <tfoot>\n");
      out.write("        <tr>\n");
      out.write("            <th>NAME</th>\n");
      out.write("            <th>RECRUITER</th>\n");
      out.write("            <th>EMAIL</th>\n");
      out.write("          \n");
      out.write("            <th>CONTACT</th>\n");
      out.write("            <th>ADDRESS</th>\n");
      out.write("            <th>STATUS</th>\n");
      out.write("        </tr>  \n");
      out.write("    </tfoot>\n");
      out.write("</table>\n");
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
