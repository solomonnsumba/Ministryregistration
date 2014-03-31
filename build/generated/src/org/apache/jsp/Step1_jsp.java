package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Step1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" /><title>Untitled Document</title>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write(".style1 {color: #0000FF}\n");
      out.write(".style2 {\n");
      out.write("\tcolor: #FFFFFF;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tfont-size: 24px;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style></head><body>\n");
      out.write("<div align=\"center\">\n");
      out.write("    <form id=\"form1\" name=\"form1\" method=\"post\" action=\"Step2.jsp\">\n");
      out.write("  <table bgcolor=\"#cccccc\" border=\"0\" height=\"600\" width=\"667\">\n");
      out.write("    <tbody><tr bordercolor=\"#0066FF\">\n");
      out.write("      <td colspan=\"3\" bgcolor=\"#0099cc\"><div class=\"style2\" align=\"center\">Teacher Registration Step 1 of 3 </div></td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("      <td style=\"vertical-align: top;\"><br />\n");
      out.write("      </td>\n");
      out.write("      <td style=\"vertical-align: top;\">Your Names<br />\n");
      out.write("      </td>\n");
      out.write("      <td style=\"vertical-align: top;\"><br />\n");
      out.write("      </td>\n");
      out.write("    </tr>\n");
      out.write("<tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td><input name=\"firstName\"  type=\"text\" Placeholder=\"First Name\" /> </td>\n");
      out.write("      <td><input name=\"lastName\"  type=\"text\" Placeholder=\"Last name\" /> <br />\n");
      out.write("</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td><input name=\"otherName\" placeholder=\"Other Name\" type=\"text\" /></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>Create a Password </td>\n");
      out.write("      <td>Confirm Password </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td><input name=\"password\" Placeholder=\"Password\" type=\"password\" /></td>\n");
      out.write("      <td><input name=\"password2\" Placeholder=\"Re-enter Password\" type=\"password\" /></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>Date Of Birth </td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>\n");
      out.write("        <label>\n");
      out.write("        </label><label>Month Of Birth\n");
      out.write("        <select name=\"monthBirth\" id=\"monthBirth\">\n");
      out.write("            <option>Select Month Of Birth</option>\n");
      out.write("          <option value=\"January\">January</option>\n");
      out.write("          <option value=\"February\">February</option>\n");
      out.write("          <option value=\"March\">March</option>\n");
      out.write("          <option value=\"April\">April</option>\n");
      out.write("          <option value=\"May\">May</option>\n");
      out.write("          <option value=\"June\">June</option>\n");
      out.write("          <option value=\"July\">July</option>\n");
      out.write("          <option value=\"August\">August</option>\n");
      out.write("          <option value=\"September\">September</option>\n");
      out.write("          <option value=\"October\">October</option>\n");
      out.write("          <option value=\"November\">November</option>\n");
      out.write("          <option value=\"December\">December</option>\n");
      out.write("          \n");
      out.write("            </select>\n");
      out.write("        </label>\n");
      out.write("            </td>\n");
      out.write("      <td><label>Year Of Birth\n");
      out.write("              <select name=\"yearBirth\" id=\"yearBirth\">\n");
      out.write("                  <option>Select year Of Birth</option>\n");
      out.write("                  <option value=\"2014\">2014</option>\n");
      out.write("                  <option value=\"2013\">2013</option>\n");
      out.write("                  <option value=\"2012\">2012</option>\n");
      out.write("                  <option value=\"2011\">2011</option>\n");
      out.write("                  <option value=\"2010\">2010</option>\n");
      out.write("                  <option value=\"2009\">2009</option>\n");
      out.write("                  <option value=\"2008\">2008</option>\n");
      out.write("                  <option value=\"2007\">2007</option>\n");
      out.write("                  <option value=\"2006\">2006</option>\n");
      out.write("                  <option value=\"2005\">2005</option>\n");
      out.write("                  <option value=\"2004\">2004</option>\n");
      out.write("                  <option value=\"2003\">2003</option>\n");
      out.write("                  <option value=\"2002\">2002</option>\n");
      out.write("                  <option value=\"2001\">2001</option>\n");
      out.write("                  <option value=\"2000\">2000</option>\n");
      out.write("                  <option value=\"1999\">1999</option>\n");
      out.write("                  <option value=\"1998\">1998</option>\n");
      out.write("                  <option value=\"1997\">1997</option>\n");
      out.write("                  <option value=\"1996\">1996</option>\n");
      out.write("          </select>\n");
      out.write("      </label></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>Gender</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td><label>\n");
      out.write("        <select name=\"gender\" id=\"gender\">\n");
      out.write("            <option>Select Gender</option>\n");
      out.write("            <option value=\"Male\">MALE</option>\n");
      out.write("            <option value=\"Female\">FEMALE</option>\n");
      out.write("                        </select>\n");
      out.write("      </label></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>Mobile Number </td>\n");
      out.write("      <td>Location</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\">&nbsp;</td>\n");
      out.write("      <td><input name=\"telNo\" type=\"text\" Placeholder=\"Mobile Number\"/></td>\n");
      out.write("      <td><select name=\"location\" id=\"location\">\n");
      out.write("              <option>Select Your Location</option>\n");
      out.write("              <option value=\"Gayaza\">Gayaza</option>\n");
      out.write("              <option value=\"Mengo\">Mengo</option>\n");
      out.write("              <option value=\"Rubaga\">Rubaga</option>\n");
      out.write("              <option value=\"Seeta\">Seeta</option>\n");
      out.write("              <option value=\"Mukono\">Mukono</option>\n");
      out.write("              <option value=\"Kawempe\">Kawempe</option>\n");
      out.write("              <option value=\"Ggaba\">Ggaba</option>\n");
      out.write("              <option value=\"Bukasa\">Bukasa</option>\n");
      out.write("              <option value=\"Ntinda\">Ntinda</option>\n");
      out.write("                  </select></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\">&nbsp;</td>\n");
      out.write("      <td>Your Current Email Address </td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\">&nbsp;</td>\n");
      out.write("      <td><input name=\"email\" type=\"text\" Placeholder=\"Email Address\" /></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\">&nbsp;</td>\n");
      out.write("      <td><br />\n");
      out.write("</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
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
      out.write("    \n");
      out.write("</body></html>");
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
