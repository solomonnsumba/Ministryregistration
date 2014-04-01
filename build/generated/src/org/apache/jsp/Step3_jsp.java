package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Step3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\"><head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" /><title>Untitled Document</title>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write(".style1 {color: #0000FF}\n");
      out.write(".style2 {\n");
      out.write("\tfont-size: 24px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tcolor: #FFFFFF;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style></head><body>\n");
      out.write("    \n");
      out.write("    ");

   String mStatus = request.getParameter( "maritualStatus" );
   String noChild = request.getParameter( "noOfChildren" );
   String heir = request.getParameter( "heir" );
   
   session.setAttribute( "maritualStatus", mStatus );
   session.setAttribute( "noOfChildren", noChild );
   session.setAttribute( "heir", heir );

      out.write("\n");
      out.write("    \n");
      out.write("<div align=\"center\">\n");
      out.write("    <form id=\"form1\" name=\"form1\" method=\"post\" action=\"Register\">\n");
      out.write("  <table bgcolor=\"#cccccc\" border=\"0\" height=\"600\" width=\"667\">\n");
      out.write("    <tbody><tr bordercolor=\"#0066FF\">\n");
      out.write("      <td colspan=\"3\" bgcolor=\"#0099cc\"><div class=\"style2\" align=\"center\">Teacher Registration Step 3 of 3 </div></td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>Academic Documents </td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>Primary Leaving Examinations </td>\n");
      out.write("      <td><div align=\"center\">\n");
      out.write("        <input type=\"file\" name=\"primary\" size=\"50\"/>\n");
      out.write("      </div></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>Uganda Certificate Of Education </td>\n");
      out.write("      <td><div align=\"center\">\n");
      out.write("        <input type=\"file\" name=\"Olevel\" size=\"50\"/>\n");
      out.write("      </div></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>Uganda Advanced Certificate Of Eductaion</td>\n");
      out.write("      <td><label>\n");
      out.write("        </label><div align=\"center\">\n");
      out.write("          <input type=\"file\" name=\"Alevel\" size=\"50\"/>\n");
      out.write("          </div>\n");
      out.write("      </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td><label>Teacher Qualification Testimonial </label></td>\n");
      out.write("      <td><div align=\"center\">\n");
      out.write("        <input type=\"file\" name=\"testimonial\" size=\"50\"/>\n");
      out.write("      </div></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\">&nbsp;</td>\n");
      out.write("      <td>Other Certificate </td>\n");
      out.write("      <td><div align=\"center\">\n");
      out.write("        <input type=\"file\" name=\"other\" size=\"50\"/>\n");
      out.write("      </div></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\">&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("   <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><div align=\"center\"><br />\n");
      out.write("</div></td>\n");
      out.write("      <td><div align=\"center\">\n");
      out.write("        <input name=\"Submit2\" value=\"Cancel\" type=\"submit\" />\n");
      out.write("      </div></td>\n");
      out.write("      <td><div align=\"center\">\n");
      out.write("        <input name=\"Continue\" value=\"Continue\" type=\"submit\" />\n");
      out.write("      </div></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\">&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("  </tbody></table>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("</body></html>\n");
      out.write(" \n");
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
